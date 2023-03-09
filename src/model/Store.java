package model;

import java.util.ArrayList;
import java.util.List;


public class Store {
    private ArrayList<Product> products;
    private ArrayList<Customer> customers;
    private ArrayList<Admin> admins;
    private ArrayList<Category> categories;

    public Store() {
        products = new ArrayList<>();
        customers = new ArrayList<>();
        admins = new ArrayList<>();
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
    public void addAdmin(Admin admin){admins.add(admin);}
    public void removeAdmin(Admin admin){admins.remove(admin);}

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


    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }

    public void displayAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getUserName() + " - " + customer.getEmail());
        }
    }

    public void displayAllAdmins() {
        for (Admin admin : admins) {
            System.out.println(admin.getUserName() + " - " + admin.getEmail());
        }
    }}
