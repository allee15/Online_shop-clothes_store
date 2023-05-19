package model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    private Category category;

    @BeforeEach
    public void setUp() {
        category = new Category(1, "Bluze", "Categorie pentru bluze");
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("Bluze", category.getName());
    }

    @Test
    public void testSetName() {
        category.setName("Camasi");
        Assertions.assertEquals("Camasi", category.getName());
    }

    @Test
    public void testGetDescription() {
        Assertions.assertEquals("Categorie pentru bluze", category.getDescription());
    }

    @Test
    public void testSetDescription() {
        category.setDescription("Categorie pentru camasi");
        Assertions.assertEquals("Categorie pentru camasi", category.getDescription());
    }

    @Test
    public void testGetIdCateg() {
        Assertions.assertEquals(1, category.getIdCateg());
    }

    @Test
    public void testSetIdCateg() {
        category.setIdCateg(2);
        Assertions.assertEquals(2, category.getIdCateg());
    }

    @Test
    public void testToString() {
        String expected = "idCategorie=1\nnume categorie=Bluze\ndescriere categorie=Categorie pentru bluze\n";
        Assertions.assertEquals(expected, category.toString());
    }

    @Test
    public void testLenDescription() {
        try {
            category.LenDescription(""); // Empty description, should throw an exception
            Assertions.fail("Expected CategoryException was not thrown.");
        } catch (Category.CategoryException ex) {
            Assertions.assertEquals("Trebuie sa adaugi o descriere!", ex.getMessage());
        }
    }
}
