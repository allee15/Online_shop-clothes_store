package model;

import java.util.ArrayList;

public class Category {

    private Integer idCateg;
//    public ArrayList<Product> products;
    private String name;
    private String description;




    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public Integer getIdCateg() {
        return idCateg;
    }
//    public ArrayList<Product> getProducts() {
//        return products;
//    }





    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setIdCateg(Integer idCateg) {
        this.idCateg = idCateg;
    }
//    public void setProducts(ArrayList<Product> products) {
//        this.products = products;
//    }



    public Category(){
        this.idCateg=0;
        this.name="";
        this.description="";
    }

    public Category(Integer idCateg, String name, String description){
        this.idCateg=idCateg;
        this.name=name;
        this.description=description;
//        this.products=new ArrayList<Product>();
    }

    @Override
    public String toString(){
        return "idCategorie="+getIdCateg()+" "+"nume categorie="+getName()+" "+"descriere categorie="+getDescription()+'\n';
    }
//    public void addProduct(Product product) {
//        this.products.add(product);
//    }

//    public void removeProduct(Product product) {
//        products.remove(product);
//    }

//    public void displayProducts() {
//        for (Product product : products) {
//            System.out.println(product.getName() + " - " + product.getPrice());
//        }}

}

