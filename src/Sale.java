import java.time.LocalDate;

public class Sale {
    private String productName;
    private String category;
    private double price;
    private int quantity;
    private LocalDate saleDate;

    Sale(String productName, String category, double price, int quantity, LocalDate saleDate) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.saleDate = saleDate;
    }

    String getProductName() {
        return productName;
    }
    String getCategory() {
        return category;
    }
    double getPrice() {
        return price;
    }
    double getTotalSales() {
        return price * quantity;
    }
    int getQuantity() {
        return quantity;
    }
    LocalDate getSaleDate() {
        return saleDate;
    }

    @Override
    public String toString() {
        return "Категория " + category + ", продукт " + productName + ", дата продажи " + saleDate;
    }
}
