package model;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RatingTest {

    private Rating rating;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        customer = new Customer(1, "username", "password", "email", "John", "Doe", "1234567890", "Address", null);
        rating = new Rating(4, "Good product", customer);
    }

    @Test
    public void testGetComment() {
        String expectedComment = "Good product";
        String actualComment = rating.getComment();
        Assertions.assertEquals(expectedComment, actualComment);
    }

    @Test
    public void testGetStars() {
        Integer expectedStars = 4;
        Integer actualStars = rating.getStars();
        Assertions.assertEquals(expectedStars, actualStars);
    }

    @Test
    public void testGetCustomer() {
        Customer expectedCustomer = customer;
        Customer actualCustomer = rating.getCustomer();
        Assertions.assertEquals(expectedCustomer, actualCustomer);
    }

    @Test
    public void testSetComment() {
        String newComment = "Great product";
        rating.setComment(newComment);
        String updatedComment = rating.getComment();
        Assertions.assertEquals(newComment, updatedComment);
    }

    @Test
    public void testSetStars() {
        Integer newStars = 5;
        rating.setStars(newStars);
        Integer updatedStars = rating.getStars();
        Assertions.assertEquals(newStars, updatedStars);
    }

    @Test
    public void testToString() {
        String expectedToString = "customer_name=Doe\nstars=4\ncomment=Good product\n";
        String actualToString = rating.toString();
        Assertions.assertEquals(expectedToString, actualToString);
    }

    @Test
    public void testNbStars() {
        Integer validStars = 3;
        try {
            rating.NbStars(validStars);
        } catch (Rating.RatingException e) {
            Assertions.fail("Valid star rating should not throw an exception");
        }

        Integer invalidStars = 6;
        Assertions.assertThrows(Rating.RatingException.class, () -> rating.NbStars(invalidStars));
    }
}