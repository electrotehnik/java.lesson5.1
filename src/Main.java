import java.util.*;
import java.time.LocalDate;
import java.util.Map.*;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Sale> sales = Data.getData();

        Map<String, Result> out = sales.stream()
                .filter(sale -> sale.getSaleDate().isAfter(LocalDate.now().minusYears(1)))
                .collect(Collectors.groupingBy(
                        Sale::getCategory,
                        Collectors.teeing(
                                Collectors.summingDouble(Sale::getTotalSales),
                                Collectors.teeing(
                                        Collectors.maxBy(Comparator.comparing(Sale::getQuantity)),
                                        Collectors.maxBy(Comparator.comparing(Sale::getPrice)),
                                        (maxQuantOptional, maxPriceOptional) -> {
                                            Map<String, Integer> maxQuant = new HashMap<>();
                                            Map<String, Double> maxPrice = new HashMap<>();

                                            maxQuantOptional.ifPresent(sale ->
                                                    maxQuant.put(sale.getProductName(), sale.getQuantity())
                                            );
                                            maxPriceOptional.ifPresent(sale ->
                                                    maxPrice.put(sale.getProductName(), sale.getPrice())
                                            );

                                            return new Stats(maxQuant, maxPrice);
                                        }
                                ),
                                (totalSales, maxStat) -> {
                                    Result r = new Result();
                                    r.setTotalSales(totalSales);
                                    r.setMaxSale(maxStat.maxQuant.entrySet().iterator().next().getKey(),
                                                 maxStat.maxQuant.entrySet().iterator().next().getValue());
                                    r.setMaxPrice(maxStat.maxPrice.entrySet().iterator().next().getKey(),
                                                  maxStat.maxPrice.entrySet().iterator().next().getValue());
                                    return r;
                                }
                        )
                        ));

        out.forEach((cat, res) -> System.out.println(cat + ": \n" + res));
    }
}
