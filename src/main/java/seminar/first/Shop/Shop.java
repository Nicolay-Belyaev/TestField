package seminar.first.Shop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Product> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getCost))
                .collect(Collectors.toList());
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products.isEmpty()) {
            return null;
        }
        return products.stream().max(Comparator.comparing(Product::getCost)).get();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

}