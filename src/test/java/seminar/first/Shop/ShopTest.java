package seminar.first.Shop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    private Shop shop;

    @BeforeEach
    void makeShop() {
        this.shop = new Shop();
    }

    @AfterEach
    void purgeShop() {
        this.shop = null;
    }

    @Test
    @DisplayName("Сортировка продуктов по цене")
    void sortProductsByPrice() {
        Product bread = new Product("Bread", 50);
        Product milk = new Product("Milk", 80);
        Product eggs = new Product("Eggs", 100);

        shop.addProduct(bread);
        shop.addProduct(milk);
        shop.addProduct(eggs);

        assertIterableEquals(new ArrayList<Product>() {{
            add(bread);
            add(milk);
            add(eggs);
        }}, shop.sortProductsByPrice());
    }

    @Test
    @DisplayName("Получение самого дорого продукта")
    void getMostExpensiveProduct() {
        Product bread = new Product("Bread", 50);
        Product milk = new Product("Milk", 80);
        Product eggs = new Product("Eggs", 100);

        shop.addProduct(bread);
        shop.addProduct(milk);
        shop.addProduct(eggs);

        assertEquals(eggs, shop.getMostExpensiveProduct());
    }
}