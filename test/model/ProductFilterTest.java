package model;



import model.Product;
import model.ProductFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class ProductFilterTest {

    private ProductFilter productFilter;

    @BeforeEach
    public void setUp() {
        productFilter = new ProductFilter();
    }

//    @Test
//    public void testCompare() {
//        Product product1 = new Product(1,"Rochie rosie", "Draguta", 150.0, true, 3, new Category(), new HashSet<>());
//        Product product2 = new Product(2,"Rochie albastra", "Minunata", 200.0, true, 5, new Category(), new HashSet<>());
//
//        int result = productFilter.compare(product1, product2);
//        Assertions.assertTrue(result < 0, "Product1 should come before Product2");
//
//        result = productFilter.compare(product2, product1);
//        Assertions.assertTrue(result > 0, "Product2 should come after Product1");
//
//        result = productFilter.compare(product1, product1);
//        Assertions.assertEquals(0, result, "Product1 and Product1 should be equal");
//    }
}
