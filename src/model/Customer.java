package model;

import java.util.ArrayList;

public class Customer extends User{
    private ArrayList<Product> cart;
    private String phone;
    private String address;


    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }


    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setAddress(String address){
        this.address=address;
    }


    public Customer(String phone, String address){
        super();
        this.phone=phone;
        this.address=address;
    }

    public void addItemToCart(Product product) {
        cart.add(product);
    }

    public void removeItemFromCart(Product product) {
        cart.remove(product);
    }

    public void checkOut() {
        // process payment and shipping information
        // clear the cart
        cart.clear();
    }
}
