import java.util.HashMap;
import java.util.Map;

public class Result {
    private double totalSales;
    private Map<String, Integer> maxSale;
    private Map<String, Double> maxPrice;

    Result() {
        this.totalSales = 0;
        this.maxSale = new HashMap<>();
        this.maxPrice = new HashMap<>();
    }

    public String getMaxSale(Map<String, Integer> map) {
        return map.entrySet().iterator().next().getKey() + " (" + map.entrySet().iterator().next().getValue() + " шт.)\n";
    }
    public String getMaxPrice(Map<String, Double> map) {
        return map.entrySet().iterator().next().getKey() + " (" + map.entrySet().iterator().next().getValue() + ")\n";
    }
    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    public void setMaxSale(String name, Integer quantity) {
        this.maxSale.put(name, quantity);
    }
    public void setMaxPrice(String name, Double price) {
        this.maxPrice.put(name, price);
    }

    @Override
    public String toString() {
        return  "Общая выручка: " + totalSales + " \n" +
                "Самый продаваемый товар: " + getMaxSale(maxSale) +
                "Самый дорогой товар: " + getMaxPrice(maxPrice);
    }
}
