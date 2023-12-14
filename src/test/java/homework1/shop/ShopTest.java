package homework1.shop;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    private List<Product> productList;
    private Shop shop;

//    @BeforeAll
//    static void setup() {
//        ShopTest shopTest = new ShopTest();
//        shopTest.productList = new ArrayList<>();
//
//        Product product1 = new Product();
//        product1.setTitle("apple");
//        product1.setCost(20);
//
//        Product product2 = new Product();
//        product2.setTitle("pear");
//        product2.setCost(40);
//
//        Product product3 = new Product();
//        product3.setTitle("carrot");
//        product3.setCost(10);
//
//        shopTest.productList.add(product1);
//        shopTest.productList.add(product2);
//        shopTest.productList.add(product3);
//
//         shopTest.shop = new Shop();
//        shopTest.shop.setProducts(shopTest.productList);
//        List<Product> sortProductList = new ArrayList<>();
//        sortProductList = shopTest.shop.sortProductsByPrice();
//    }



    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов,
    верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */


    @Test

    void getProducts() {
        productList = new ArrayList<>();
        Product product1 = new Product();
        product1.setTitle("apple");
        product1.setCost(20);

        Product product2 = new Product();
        product2.setTitle("pear");
        product2.setCost(40);

        Product product3 = new Product();
        product3.setTitle("carrot");
        product3.setCost(10);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        assertThat(productList).hasSize(3).contains(product1, product2, product3);
    }

    @Test
    void sortProductsByPrice() {
        productList = new ArrayList<>();
        Product product1 = new Product();
        product1.setTitle("apple");
        product1.setCost(20);

        Product product2 = new Product();
        product2.setTitle("pear");
        product2.setCost(40);

        Product product3 = new Product();
        product3.setTitle("carrot");
        product3.setCost(10);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        shop = new Shop();
        shop.setProducts(productList);

        List<Product> sortProductList = new ArrayList<>();
        sortProductList = shop.sortProductsByPrice();

        Product[] expectedList = {product3, product1, product2};

        assertArrayEquals(sortProductList.toArray(), expectedList);

    }

    @Test
    void getMostExpensiveProduct() {
        productList = new ArrayList<>();
        Product product1 = new Product();
        product1.setTitle("apple");
        product1.setCost(20);

        Product product2 = new Product();
        product2.setTitle("pear");
        product2.setCost(40);

        Product product3 = new Product();
        product3.setTitle("carrot");
        product3.setCost(10);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        shop = new Shop();
        shop.setProducts(productList);
        assertTrue(product2.equals(shop.getMostExpensiveProduct()));
    }


}