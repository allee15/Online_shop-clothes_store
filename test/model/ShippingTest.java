package model;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShippingTest {

    private Shipping shipping;

    @BeforeEach
    public void setUp() {
        shipping = new Shipping(1, "New York", "USA", "123 Main St", "12345");
    }

    @Test
    public void testGetIdShipping() {
        Integer expectedId = 1;
        Integer actualId = shipping.getIdShipping();
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    public void testGetCity() {
        String expectedCity = "New York";
        String actualCity = shipping.getCity();
        Assertions.assertEquals(expectedCity, actualCity);
    }

    @Test
    public void testGetCountry() {
        String expectedCountry = "USA";
        String actualCountry = shipping.getCountry();
        Assertions.assertEquals(expectedCountry, actualCountry);
    }

    @Test
    public void testGetAddress() {
        String expectedAddress = "123 Main St";
        String actualAddress = shipping.getAddress();
        Assertions.assertEquals(expectedAddress, actualAddress);
    }

    @Test
    public void testGetPostalCode() {
        String expectedPostalCode = "12345";
        String actualPostalCode = shipping.getPostalCode();
        Assertions.assertEquals(expectedPostalCode, actualPostalCode);
    }

    @Test
    public void testSetIdShipping() {
        Integer newId = 2;
        shipping.setIdShipping(newId);
        Integer updatedId = shipping.getIdShipping();
        Assertions.assertEquals(newId, updatedId);
    }

    @Test
    public void testSetCity() {
        String newCity = "Los Angeles";
        shipping.setCity(newCity);
        String updatedCity = shipping.getCity();
        Assertions.assertEquals(newCity, updatedCity);
    }

    @Test
    public void testSetCountry() {
        String newCountry = "Canada";
        shipping.setCountry(newCountry);
        String updatedCountry = shipping.getCountry();
        Assertions.assertEquals(newCountry, updatedCountry);
    }

    @Test
    public void testSetAddress() {
        String newAddress = "456 Elm St";
        shipping.setAddress(newAddress);
        String updatedAddress = shipping.getAddress();
        Assertions.assertEquals(newAddress, updatedAddress);
    }

    @Test
    public void testSetPostalCode() {
        String newPostalCode = "54321";
        shipping.setPostalCode(newPostalCode);
        String updatedPostalCode = shipping.getPostalCode();
        Assertions.assertEquals(newPostalCode, updatedPostalCode);
    }

    @Test
    public void testToString() {
        String expectedToString = "idShipping=1\ncity=New York\ncountry=USA\naddress=123 Main St\npostal code=12345\n";
        String actualToString = shipping.toString();
        Assertions.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void testAddressDelivery() {
        String validAddress = "123 Main St";
        try {
            shipping.AddressDelivery(validAddress);
        } catch (Shipping.ShippingException1 e) {
            Assertions.fail("Valid address should not throw an exception");
        }

        String invalidAddress = "";
        Assertions.assertThrows(Shipping.ShippingException1.class, () -> shipping.AddressDelivery(invalidAddress));
    }

    @Test
    public void testCityDelivery() {
        String validCity = "New York";
        try {
            shipping.CityDelivery(validCity);
        } catch (Shipping.ShippingException2 e) {
            Assertions.fail("Valid city should not throw an exception");
        }

        String invalidCity = "";
        Assertions.assertThrows(Shipping.ShippingException2.class, () -> shipping.CityDelivery(invalidCity));
    }

    @Test
    public void testCountryDelivery() {
        String validCountry = "USA";
        try {
            shipping.CountryDelivery(validCountry);
        } catch (Shipping.ShippingException3 e) {
            Assertions.fail("Valid country should not throw an exception");
        }

        String invalidCountry = "";
        Assertions.assertThrows(Shipping.ShippingException3.class, () -> shipping.CountryDelivery(invalidCountry));
    }

//    @Test
//    public void testPostalCodeDelivery() {
//        String validPostalCode = "12345";
//        try {
//            shipping.PostalCodeDelivery(validPostalCode);
//        } catch (Shipping.ShippingException4 e) {
//            Assertions.fail("Valid postal code should not throw an exception");
//        }
//
//        String invalidPostalCode = "123456";
//        Assertions.assertThrows(Shipping.ShippingException4.class, () -> shipping.PostalCodeDelivery(invalidPostalCode));
//    }
}