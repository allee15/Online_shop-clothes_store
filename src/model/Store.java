package model;

import java.util.ArrayList;


public class Store {
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;
    private ArrayList<Category> categories;

    public Store() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        categories = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public ArrayList<Product> getProductsByCategory(String categoryName) {
        ArrayList<Product> productsByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(categoryName)) {
                productsByCategory.add(product);
            }
        }
        return productsByCategory;
    }

    public ArrayList<Product> getProductsByRating(double minRating) {
        ArrayList<Product> productsByRating = new ArrayList<>();
        for (Product product : products) {
            if (product.getRating() >= minRating) {
                productsByRating.add(product);
            }
        }
        return productsByRating;
    }

    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getName() + " - " + customer.getEmail());
        }
    }