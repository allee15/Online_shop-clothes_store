package model;

import java.util.ArrayList;

public class Category {

    public Integer idCateg;
    public ArrayList<Product> products;
    public String name;
    public String description;




    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public Integer getIdCateg() {
        return idCateg;
    }
    public ArrayList<Product> getProducts() {
        return products;
    }





    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setIdCateg(Integer idCateg) {
        this.idCateg = idCateg;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }




    public Category(Integer idCateg, String name, String description){
        this.idCateg=idCateg;
        this.name=name;
        this.description=description;
        this.products=new ArrayList<Product>();
    }


    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }}

}

