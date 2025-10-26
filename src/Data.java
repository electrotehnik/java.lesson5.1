import java.util.*;
import java.time.LocalDate;

public class Data {
    private static List<Sale> sales = Arrays.asList(
                        new Sale("Laptop", "Electronics", 999.99, 5, LocalDate.of(2025, 1, 15)),
                        new Sale("Smartphone", "Electronics", 699.99, 10, LocalDate.of(2025, 5, 20)),
                        new Sale("Desk", "Furniture", 249.99, 3, LocalDate.of(2024, 11, 10)),
                        new Sale("Chair", "Furniture", 99.99, 8, LocalDate.of(2025, 3, 5)),
                        new Sale("Monitor", "Electronics", 199.99, 7, LocalDate.of(2025, 7, 12))
    );

    static List<Sale> getData() {
        return sales;
    }
}
