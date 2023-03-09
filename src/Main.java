public class Main {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product("T-Shirt", "A simple white T-shirt", 19.99, "Clothing", 4.5);
        Product p2 = new Product("Jeans", "A pair of blue jeans", 39.99, "Clothing", 4.2);
        Product p3 = new Product("Sneakers", "A pair of running shoes", 79.99, "Footwear", 4.8);

        // Create some categories
        Category c1 = new Category("Clothing");
        Category c2 = new Category("Footwear");

        // Add products to categories
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
        store.addCustomer(new Customer("John Doe", "johndoe@example.com", "123 Main St"));
        store.addCustomer(new Customer("Jane Doe", "janedoe@example.com", "456 Elm St"));
        store.addCustomer(new Admin("Admin User", "admin@example.com", "789 Oak St"));

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

        // Add a new product to the store (admin only)
        Admin admin = new Admin("Admin User", "admin@example.com", "789 Oak St");
        Product p4 = new Product("Jacket", "A warm winter jacket", 99.99, "Clothing", 4.6);
        admin.addProduct(p4, store);

        // Remove a product from the store (admin only)
        Product p2ToRemove = new Product("Jeans", "A pair of blue jeans", 39.99, "Clothing", 4.2);
        admin.removeProduct(p2ToRemove, store);

        // Display all products in the store again
        System.out.println("\nAll products after adding and removing a product:");
        store.displayAllProducts();

        // Add a product to a customer's cart
        Customer customer = new Customer("John Doe", "johndoe@example.com", "123 Main St");
        customer.addItemToCart(p1);

        // Remove a product from a customer's cart
        customer.removeItemFromCart(p1);

        // Process a customer's order
        customer.addItemToCart(p3);
        customer.checkOut();
    }
}
