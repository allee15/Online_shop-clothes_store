package model;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


public class CouponTest {

    private Coupon coupon;

    @BeforeEach
    public void setUp() {
        coupon = new Coupon();
        coupon.setCode("ABC123");
        coupon.setPercentage(10.0);
        coupon.setValid(true);
    }

//    @Test
//    public void testSetCode() {
//        coupon.setCode("DEF456");
//        Assertions.assertEquals("DEF456", coupon.getCode());
//    }

    @Test
    public void testSetPercentage() {
        coupon.setPercentage(20.0);
        Assertions.assertEquals(20.0, coupon.getPercentage());
    }

    @Test
    public void testSetValid() {
        coupon.setValid(false);
        Assertions.assertFalse(coupon.getValid());
    }

//    @Test
//    public void testGetCode() {
//        Assertions.assertEquals("ABC123", coupon.getCode());
//    }

    @Test
    public void testGetPercentage() {
        Assertions.assertEquals(10.0, coupon.getPercentage());
    }

    @Test
    public void testGetValid() {
        Assertions.assertTrue(coupon.getValid());
    }

    @Test
    public void testReducere_ValidCoupon_ReturnsReducedPrice() {
        double price = 100.0;
        double expectedReducedPrice = 90.0;
        double reducedPrice = coupon.reducere(price);
        Assertions.assertEquals(expectedReducedPrice, reducedPrice);
    }

    @Test
    public void testReducere_InvalidCoupon_ReturnsOriginalPrice() {
        coupon.setValid(false);
        double price = 100.0;
        double reducedPrice = coupon.reducere(price);
        Assertions.assertEquals(price, reducedPrice);
    }

//    @Test
//    public void testToString() {
//        String expected = "Code=ABC123\npercentage=10.0\nvalid=true\n";
//        Assertions.assertEquals(expected, coupon.toString());
//    }

    @Test
    public void testPercentage_ValidPercentage_NoExceptionThrown() {
        double percentage = 10.0;
        Assertions.assertDoesNotThrow(() -> coupon.Percentage(percentage));
    }

    @Test
    public void testPercentage_InvalidPercentage_ThrowsCouponException() {
        double percentage = 0.0;
        Assertions.assertThrows(Coupon.CouponException.class, () -> coupon.Percentage(percentage));
    }
}
