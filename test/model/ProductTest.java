package model;

//import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product();
        product.setId(1);
        product.setName("Product 1");
        product.setDescription("Description 1");
        product.setPrice(100.0);
        product.setDisponibility(true);
        product.setQuantity(10);
        product.setCategory(new Category());
        product.setRatings(new HashSet<>());
    }

    @Test
    public void testSetQuantity() {
        product.setQuantity(5);
        Assertions.assertEquals(5, product.getQuantity());
    }

    @Test
    public void testSetName() {
        product.setName("Product 2");
        Assertions.assertEquals("Product 2", product.getName());
    }

    @Test
    public void testSetDescription() {
        product.setDescription("Descriere faina");
        Assertions.assertEquals("Descriere faina", product.getDescription());
    }

    @Test
    public void testSetDisponibility() {
        product.setDisponibility(false);
        Assertions.assertFalse(product.getDisponibility());
    }

    @Test
    public void testSetPrice() {
        product.setPrice(200.0);
        Assertions.assertEquals(200.0, product.getPrice());
    }

    @Test
    public void testSetRatings() {
        Set<Rating> ratings = new HashSet<>();
        ratings.add(new Rating(4, "Interesant", new Customer()));
        product.setRatings(ratings);
        Assertions.assertEquals(ratings, product.getRatings());
    }

    @Test
    public void testSetCategory() {
        Category category = new Category();
        product.setCategory(category);
        Assertions.assertEquals(category, product.getCategory());
    }

    @Test
    public void testGetDisponibility() {
        Assertions.assertTrue(product.getDisponibility());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals("Description 1", product.getDescription());
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("Product 1", product.getName());
    }

    @Test
    public void testGetId() {
        Assertions.assertEquals(1, product.getId());
    }

    @Test
    public void testGetQuantity() {
        Assertions.assertEquals(10, product.getQuantity());
    }

    @Test
    public void testGetPrice() {
        Assertions.assertEquals(100.0, product.getPrice());
    }

    @Test
    public void testGetRatings() {
        Assertions.assertEquals(new HashSet<>(), product.getRatings());
    }

    @Test
    public void testGetCategory() {
        Assertions.assertNotNull(product.getCategory());
    }

    @Test
    public void testAddRatingProduct() {
        Rating rating = new Rating(4, "Dragut", new Customer());
        product.addRatingProduct(rating);
        Set<Rating> expectedRatings = new HashSet<>();
        expectedRatings.add(rating);

        Assertions.assertEquals(expectedRatings, product.getRatings());
    }

    @Test
    public void testToString() {
        String expected = "id=1\nname=Product 1\ndescription=Description 1\ndisponibility=true\nprice=100.0\nquantity10\nratings=[]\ncategory:null\n";
        Assertions.assertEquals(expected, product.toString());
    }

    @Test
    public void testEquals() {
        Product sameProduct = new Product();
        sameProduct.setId(1);
        sameProduct.setName("Product 1");
        sameProduct.setDescription("Description 1");
        sameProduct.setPrice(100.0);
        sameProduct.setDisponibility(true);
        sameProduct.setQuantity(10);
        sameProduct.setCategory(new Category());
        sameProduct.setRatings(new HashSet<>());

        Product differentProduct = new Product();
        differentProduct.setId(2);
        differentProduct.setName("Product 2");
        differentProduct.setDescription("Description 2");
        differentProduct.setPrice(50.0);
        differentProduct.setDisponibility(false);
        differentProduct.setQuantity(5);
        differentProduct.setCategory(new Category());
        differentProduct.setRatings(new HashSet<>());

        Assertions.assertEquals(product, sameProduct);
        Assertions.assertNotEquals(product, differentProduct);
    }

    @Test
    public void testStock() throws Product.ProductException {
        int stock = 20;
        product.Stock(stock);
        Assertions.assertEquals(stock - product.getQuantity(), stock);
    }

    @Test
    public void testStock_InsufficientStock_ThrowsProductException() {
        int stock = 5;
        Assertions.assertThrows(Product.ProductException.class, () -> product.Stock(stock));
    }
}
