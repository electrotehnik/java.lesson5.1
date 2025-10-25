Задача: Анализ данных о продажах
Описание:
У вас есть список объектов класса Sale, который содержит информацию о продажах в интернет-магазине. Каждый объект Sale имеет следующие поля:

productName (название товара, String)
category (категория товара, String)
price (цена товара, double)
quantity (количество проданных единиц, int)
saleDate (дата продажи, LocalDate)

Требуется:

1. Отфильтровать продажи за последний год (от текущей даты).
2. Сгруппировать продажи по категориям. Для каждой категории:
Найти общую выручку (сумма price * quantity).
Найти самый продаваемый товар (по количеству).
Найти самый дорогой товар (по цене).
3. Отсортировать категории по убыванию общей выручки. Вывести результаты в виде отчёта.

import java.time.LocalDate;
class Sale {
    private String productName;
    private String category;
    private double price;
    private int quantity;
    private LocalDate saleDate;

    // Конструктор, геттеры и сеттеры
}

List<Sale> sales = Arrays.asList(
    new Sale("Laptop", "Electronics", 999.99, 5, LocalDate.of(2025, 1, 15)),
    new Sale("Smartphone", "Electronics", 699.99, 10, LocalDate.of(2025, 5, 20)),
    new Sale("Desk", "Furniture", 249.99, 3, LocalDate.of(2024, 11, 10)),
    new Sale("Chair", "Furniture", 99.99, 8, LocalDate.of(2025, 3, 5)),
    new Sale("Monitor", "Electronics", 199.99, 7, LocalDate.of(2025, 7, 12))
);

В качестве результата должен быть вывод:
Категория: Electronics
Общая выручка: 11999.85
Самый продаваемый товар: Smartphone (10 шт.)
Самый дорогой товар: Laptop (999.99)

Категория: Furniture
Общая выручка: 1199.91
Самый продаваемый товар: Chair (8 шт.)
Самый дорогой товар: Desk (249.99)
