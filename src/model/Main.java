package model;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Create some products
        Category c1 = new Category(1,"Clothing","Awesome");
        Category c2 = new Category(2,"Footwear","Super");

        Product p1 = new Product(1,"T-Shirt", "A simple white T-shirt", 19.99, true, c1);
        Product p2 = new Product(2,"Jeans", "A pair of blue jeans", 39.99, true,c2);
        Product p3 = new Product(3,"Sneakers", "A pair of running shoes", 79.99, true,c2);

        c1.addProduct(p1);
        c1.addProduct(p2);
        c2.addProduct(p3);

        // Create a store
        Store store = new Store();

        // Add products, categories, and customers to the store
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        store.addCategory(c1);
        store.addCategory(c2);


        store.addCustomer(new Customer("customer1","123456","customer1@yahoo.com", "072546548","Str Academiei"));
        store.addAdmin(new Admin("admin1","123456","admin1@yahoo,com","Admin", "available", "Bucur", "Denisa"));

        // Display all products in the store
        System.out.println("All products:");
        store.displayAllProducts();

        // Display products in the "Clothing" category
        System.out.println("\nProducts in the Clothing category:");
        ArrayList<Product> clothingProducts = store.getProductsByCategory("Clothing");
        for (Product product : clothingProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        // Display customers in the store
        System.out.println("\nAll customers:");
        store.displayAllCustomers();

        // Display admins in the store
        System.out.println("\nAll admins:");
        store.displayAllAdmins();

        // Add a new product to the store (admin only)
        Admin admin = new Admin("admin1","123456","admin1@yahoo,com","Admin", "available", "Bucur", "Denisa");
        Product p4 = new Product(3,"Gucci wallet", "A Gucci Wallet by Diana Clinciu", 1009.99, true,c2);
        admin.addProduct(p4, store);

        // Remove a product from the store (admin only)
        Product p2ToRemove = new Product(2,"Jeans", "A pair of blue jeans", 39.99, true,c2);
        admin.removeProduct(p2ToRemove, store);

        // Display all products in the store again
        System.out.println("\nAll products after adding and removing a product:");
        store.displayAllProducts();

        // Add a product to a customer's cart
        Customer customer = new Customer("customer1","123456","customer1@yahoo.com", "072546548","Str Academiei");
        customer.addItemToCart(p1);

        // Remove a product from a customer's cart
        customer.removeItemFromCart(p1);

        // Process a customer's order
        customer.addItemToCart(p3);
        customer.checkOut();
    }
}
