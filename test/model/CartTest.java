

package model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CartTest {

    private Cart cart;
    private List<Product> products;
    private List<Coupon> coupons;

    @BeforeEach
    public void setUp() {
        products = new ArrayList<>();
        coupons = new ArrayList<>();
        cart = new Cart(products, coupons);
    }

    @Test
    public void testAdaugareProdus() {
        Product product = new Product(1,"Rochie rosie", "Draguta", 150.0, true, 3, new Category(), new HashSet<>());
        cart.adaugareProdus(product);
        List<Product> cartProducts = cart.getProducts();
        Assertions.assertTrue(cartProducts.contains(product));
    }

    @Test
    public void testStergeProdus() {
        Product product = new Product(1,"Rochie rosie", "Draguta", 150.0, true, 3, new Category(), new HashSet<>());
        cart.adaugareProdus(product);
        cart.stergeProdus(product);
        List<Product> cartProducts = cart.getProducts();
        Assertions.assertFalse(cartProducts.contains(product));
    }

    @Test
    public void testAdaugareCoupon() {
        Coupon coupon = new Coupon("CouponA", 5.0, true);
        cart.adaugareCoupon(coupon);
        List<Coupon> cartCoupons = cart.getCoupons();
        Assertions.assertTrue(cartCoupons.contains(coupon));
    }

    @Test
    public void testStergereCoupon() {
        Coupon coupon = new Coupon("CouponA", 5.0, true);
        cart.adaugareCoupon(coupon);
        cart.stergereCoupon(coupon);
        List<Coupon> cartCoupons = cart.getCoupons();
        Assertions.assertFalse(cartCoupons.contains(coupon));
    }

    @Test
    public void testTotal() {
        Product product1 = new Product(1,"Rochie rosie", "Draguta", 150.0, true, 3, new Category(), new HashSet<>());
        Product product2 = new Product(2,"Rochie albastra", "Minunata", 200.0, true, 5, new Category(), new HashSet<>());
        Coupon coupon = new Coupon("CouponA", 5.0, true);

        cart.adaugareProdus(product1);
        cart.adaugareProdus(product2);
        cart.adaugareCoupon(coupon);

        double expectedTotal = (product1.getQuantity() * product1.getPrice())
                + (product2.getQuantity() * product2.getPrice())
                - coupon.reducere((product1.getQuantity() * product1.getPrice())
                + (product2.getQuantity() * product2.getPrice()));

        double actualTotal = cart.Total(products, coupons);

        Assertions.assertEquals(expectedTotal, actualTotal, 0.0);
    }
}
