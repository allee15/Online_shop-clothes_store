package model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    private Customer customer;
    private Cart cart;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
        customer = new Customer(1, "username", "password", "email", "John", "Doe", "1234567890", "Address", cart);
    }

    @Test
    public void testGetPhone() {
        String expectedPhone = "1234567890";
        String actualPhone = customer.getPhone();
        Assertions.assertEquals(expectedPhone, actualPhone);
    }

    @Test
    public void testGetAddress() {
        String expectedAddress = "Address";
        String actualAddress = customer.getAddress();
        Assertions.assertEquals(expectedAddress, actualAddress);
    }

    @Test
    public void testGetCart() {
        Cart expectedCart = cart;
        Cart actualCart = customer.getCart();
        Assertions.assertEquals(expectedCart, actualCart);
    }

    @Test
    public void testSetPhone() {
        String newPhone = "9876543210";
        customer.setPhone(newPhone);
        String updatedPhone = customer.getPhone();
        Assertions.assertEquals(newPhone, updatedPhone);
    }

    @Test
    public void testSetAddress() {
        String newAddress = "New Address";
        customer.setAddress(newAddress);
        String updatedAddress = customer.getAddress();
        Assertions.assertEquals(newAddress, updatedAddress);
    }

    @Test
    public void testSetCart() {
        Cart newCart = new Cart();
        customer.setCart(newCart);
        Cart updatedCart = customer.getCart();
        Assertions.assertEquals(newCart, updatedCart);
    }

//    @Test
//    public void testToString() {
//        String expectedToString = "idUser=1\nuserName=username\npassword=password\nemail=email\nfirstName=John\nlastName=Doe\nphone=1234567890\naddress=Address\ncos cumparaturi=Cart()";
//        String actualToString = customer.toString();
//        Assertions.assertEquals(expectedToString, actualToString);
//    }

    @Test
    public void testPersonalDetails() {
        String validPhone = "123456789012";
        try {
            customer.PersonalDetails(validPhone);
        } catch (Customer.CustomerException e) {
            Assertions.fail("Valid phone number should not throw an exception");
        }

        String invalidPhone = "12345";
        Assertions.assertThrows(Customer.CustomerException.class, () -> customer.PersonalDetails(invalidPhone));
    }
}
