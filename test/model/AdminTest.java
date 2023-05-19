package model;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdminTest {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin(1, "admin123", "password", "admin@example.com", "John", "Doe", "Admin", "Active");
    }

    @Test
    public void testGetRole() {
        Assertions.assertEquals("Admin", admin.getRole());
    }

    @Test
    public void testGetStatus() {
        Assertions.assertEquals("Active", admin.getStatus());
    }

//    @Test
//    public void testToString() {
//        String expected = "idUser=1\nuserName=admin123\npassword=password\nemail=admin@example.com\nfirstName=John\nlastName=Doe\nrole=Admin\nstatus=Active\n";
//        Assertions.assertEquals(expected, admin.toString());
//    }
}
