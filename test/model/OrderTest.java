package model;

//import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class OrderTest {

    private Order order;
    private Product product1;
    private Product product2;

    @BeforeEach
    public void setUp() {
        List<Product> itemsInOrder = new ArrayList<>();
        product1 = new Product(1,"Rochie rosie", "Draguta", 150.0, true, 3, new Category(), new HashSet<>());
        product2 = new Product(2,"Rochie albastra", "Minunata", 200.0, true, 5, new Category(), new HashSet<>());
        itemsInOrder.add(product1);
        itemsInOrder.add(product2);
        Shipping shipping = new Shipping(15, "Bucharest", "Romania", "Str Academiei", "00000");
        order = new Order(1, "Card", shipping, new Date(), itemsInOrder);
    }
    @Test
    public void testGetIdOrder() {
        int expectedIdOrder = 1;
        int actualIdOrder = order.getIdOrder();
        Assertions.assertEquals(expectedIdOrder, actualIdOrder);
    }

    @Test
    public void testGetMetodaPlata() {
        String expectedMetodaPlata = "Card";
        String actualMetodaPlata = order.getMetodaPlata();
        Assertions.assertEquals(expectedMetodaPlata, actualMetodaPlata);
    }

//    @Test
//    public void testGetShipping() {
//        Shipping expectedShipping = new Shipping(15, "Bucharest", "Romania", "Str Academiei", "00000");
//        Shipping actualShipping = order.getShipping();
//        Assertions.assertEquals(expectedShipping, actualShipping);
//    }

    @Test
    public void testGetDataPlasare() {
        Date expectedDataPlasare = new Date();
        Date actualDataPlasare = order.getDataPlasare();
        Assertions.assertEquals(expectedDataPlasare, actualDataPlasare);
    }

    @Test
    public void testGetItemsInOrder() {
        List<Product> expectedItemsInOrder = new ArrayList<>();
        expectedItemsInOrder.add(product1);
        expectedItemsInOrder.add(product2);
        List<Product> actualItemsInOrder = order.getItemsInOrder();
        Assertions.assertEquals(expectedItemsInOrder, actualItemsInOrder);
    }

    @Test
    public void testSetIdOrder() {
        int newIdOrder = 2;
        order.setIdOrder(newIdOrder);
        int updatedIdOrder = order.getIdOrder();
        Assertions.assertEquals(newIdOrder, updatedIdOrder);
    }

    @Test
    public void testSetMetodaPlata() {
        String newMetodaPlata = "Cash";
        order.setMetodaPlata(newMetodaPlata);
        String updatedMetodaPlata = order.getMetodaPlata();
        Assertions.assertEquals(newMetodaPlata, updatedMetodaPlata);
    }

    @Test
    public void testSetDataPlasare() {
        Date newDataPlasare = new Date();
        order.setDataPlasare(newDataPlasare);
        Date updatedDataPlasare = order.getDataPlasare();
        Assertions.assertEquals(newDataPlasare, updatedDataPlasare);
    }


    @Test
    public void testSetShipping() {
        Shipping newShipping = new Shipping(17, "Roma", "Italy", "Str Vicenzo", "00002");
        order.setShipping(newShipping);
        Shipping updatedShipping = order.getShipping();
        Assertions.assertEquals(newShipping, updatedShipping);
    }
    @Test
    public void testCalculateTotalCost() {
        double expectedTotalCost = 350.0;
        double actualTotalCost = order.calculateTotalCost();
        Assertions.assertEquals(expectedTotalCost, actualTotalCost);
    }

    @Test
    public void testAddItem() {
        Product product3 = new Product(3,"Rochie violet", "Minunata", 250.0, true, 5, new Category(), new HashSet<>());
        order.addItem(product3);
        List<Product> itemsInOrder = order.getItemsInOrder();
        Assertions.assertEquals(3, itemsInOrder.size());
        Assertions.assertTrue(itemsInOrder.contains(product3));
    }

    @Test
    public void testRemoveItem() {
        order.removeItem(product2);
        List<Product> itemsInOrder = order.getItemsInOrder();
        Assertions.assertEquals(1, itemsInOrder.size());
        Assertions.assertFalse(itemsInOrder.contains(product2));
    }

    @Test
    public void testPaymentMethodValid() throws Order.OrderException {
        String validPaymentMethod = "Cash";
        order.PaymentMethod(validPaymentMethod);

    }

    @Test
    public void testPaymentMethodInvalid() {
        String invalidPaymentMethod = "Invalid";
        Assertions.assertThrows(Order.OrderException.class, () -> {
            order.PaymentMethod(invalidPaymentMethod);
        });
    }
}
