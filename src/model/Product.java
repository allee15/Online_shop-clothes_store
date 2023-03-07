
package model;


import java.util.ArrayList;
import java.util.List;

public class Product {


    private Integer id;


    private String name;

    private String description;


    private Double price;

    private Boolean disponibility;


    private Integer quantity;

    private List<Rating> rantings;
    public void setQuantity(Integer quantity){this.quantity=quantity;}
    public void setId(Integer id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDisponibility(Boolean disponibility) {
        this.disponibility = disponibility;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Boolean getDisponibility() {
        return disponibility;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getQuantity(){return quantity;}

    public Double getPrice() {
        return price;
    }


    public Product(Integer id, String name, String description, Double price, Boolean disponibility){
        this.id=id;
        this.name=name;
        this.description=description;
        this.disponibility=disponibility;
        this.price=price;
        this.rantings=new ArrayList<Rating>();
    }



}
