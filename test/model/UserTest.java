package model;
import model.User;
//import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setIdUser(1);
        user.setUserName("john.doe");
        user.setPassword("password123");
        user.setEmail("john.doe@example.com");
        user.setFirstName("John");
        user.setLastName("Doe");
    }

    @Test
    public void testSetIdUser() {
        user.setIdUser(2);
        Assertions.assertEquals(2, user.getIdUser());
    }

    @Test
    public void testSetUserName() {
        user.setUserName("johndoe");
        Assertions.assertEquals("johndoe", user.getUserName());
    }

    @Test
    public void testSetPassword() {
        user.setPassword("newpassword");
        Assertions.assertEquals("newpassword", user.getPassword());
    }

    @Test
    public void testSetEmail() {
        user.setEmail("johndoe@example.com");
        Assertions.assertEquals("johndoe@example.com", user.getEmail());
    }

    @Test
    public void testSetFirstName() {
        user.setFirstName("Jane");
        Assertions.assertEquals("Jane", user.getFirstName());
    }

    @Test
    public void testSetLastName() {
        user.setLastName("Smith");
        Assertions.assertEquals("Smith", user.getLastName());
    }

    @Test
    public void testGetIdUser() {
        Assertions.assertEquals(1, user.getIdUser());
    }

    @Test
    public void testGetUserName() {
        Assertions.assertEquals("john.doe", user.getUserName());
    }

    @Test
    public void testGetPassword() {
        Assertions.assertEquals("password123", user.getPassword());
    }

    @Test
    public void testGetEmail() {
        Assertions.assertEquals("john.doe@example.com", user.getEmail());
    }

    @Test
    public void testGetFirstName() {
        Assertions.assertEquals("John", user.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Assertions.assertEquals("Doe", user.getLastName());
    }

    @Test
    public void testToString() {
        String expected = "idUser=1\nusername=john.doe\npassword=password123\nemailjohn.doe@example.com\nnume=John\nprenume=Doe\n";
        Assertions.assertEquals(expected, user.toString());
    }

    @Test
    public void testLastName_ValidLastName_NoExceptionThrown() {
        String lastName = "Doe";
        Assertions.assertDoesNotThrow(() -> user.LastName(lastName));
    }

    @Test
    public void testLastName_EmptyLastName_ThrowsUserException1() {
        String lastName = "";
        Assertions.assertThrows(User.UserException1.class, () -> user.LastName(lastName));
    }

    @Test
    public void testFirstName_ValidFirstName_NoExceptionThrown() {
        String firstName = "John";
        Assertions.assertDoesNotThrow(() -> user.FirstName(firstName));
    }

    @Test
    public void testFirstName_EmptyFirstName_ThrowsUserException2() {
        String firstName = "";
        Assertions.assertThrows(User.UserException2.class, () -> user.FirstName(firstName));
    }

    @Test
    public void testUserName_ValidUserName_NoExceptionThrown() {
        String userName = "john.doe";
        Assertions.assertDoesNotThrow(() -> user.UserName(userName));
    }

    @Test
    public void testUserName_EmptyUserName_ThrowsUserException3() {
        String userName = "";
        Assertions.assertThrows(User.UserException3.class, () -> user.UserName(userName));
    }

    @Test
    public void testPassword_ValidPassword_NoExceptionThrown() {
        String password = "password123";
        Assertions.assertDoesNotThrow(() -> user.Password(password));
    }

    @Test
    public void testPassword_EmptyPassword_ThrowsUserException4() {
        String password = "";
        Assertions.assertThrows(User.UserException4.class, () -> user.Password(password));
    }

    @Test
    public void testEmail_ValidEmail_NoExceptionThrown() {
        String email = "john.doe@example.com";
        Assertions.assertDoesNotThrow(() -> user.Email(email));
    }

    @Test
    public void testEmail_EmptyEmail_ThrowsUserException5() {
        String email = "";
        Assertions.assertThrows(User.UserException5.class, () -> user.Email(email));
    }
}
