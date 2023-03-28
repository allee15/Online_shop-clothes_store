import Business.Store;
import model.*;

import java.util.ArrayList;
public class Testing {
    public static void main(String[] args) {


        Category c1 = new Category(1,"Clothing","Awesome");
        Category c2 = new Category(2,"Footwear","Terrific");

        Product p1 = new Product(1,"Dress", "A shinny pink dress", 59.99, true, c1);
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


        store.addCustomer(new Customer("customer1","123456","customer1@yahoo.com", "Barbie", "Fashionista","072546548","Str Academiei"));
        store.addAdmin(new Admin("admin1","123456","admin1@yahoo,com","Cristina", "Boboc", "admin", "available"));


        System.out.println("All products:");
        store.displayAllProducts();


        System.out.println("\nProducts in the Clothing category:");
        ArrayList<Product> clothingProducts = store.getProductsByCategory("Clothing");
        for (Product product : clothingProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }


        System.out.println("\nAll customers:");
        store.displayAllCustomers();


        System.out.println("\nAll admins:");
        store.displayAllAdmins();


        Admin admin = new Admin("admin1","123456","admin1@yahoo,com","Alexia", "Aldea", "admin", "available");
        Product p4 = new Product(3,"Gucci wallet", "A Gucci Wallet by Diana Clinciu", 1009.99, true,c2);



        Product p2ToRemove = new Product(2,"Jeans", "A pair of blue jeans", 39.99, true,c2);



        System.out.println("\nAll products after adding and removing a product:");
        store.displayAllProducts();


        Customer customer = new Customer("customer1","123456","customer1@yahoo.com","Mihnea", "Gherghel", "072546548","Str Academiei");
        customer.addItemToCart(p1);


        customer.removeItemFromCart(p1);


        customer.addItemToCart(p3);
        customer.checkOut();
    }
}
