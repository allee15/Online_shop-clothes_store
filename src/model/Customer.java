package model;

import java.util.ArrayList;

public class Customer extends User{
    private final ArrayList<Product> cart;
    private String phone;
    private String address;


    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }
    public ArrayList<Product> getCart() {
        return cart;
    }


    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setAddress(String address){
        this.address=address;
    }


    public Customer(){
        this.address="";
        this.phone="";
        this.cart=new ArrayList<>();
    }
    public Customer(Integer idUser,String userName, String password, String email, String firstName, String lastName,String phone, String address){
        super(idUser,userName,password,email,firstName, lastName);
        this.phone=phone;
        this.address=address;
        this.cart=new ArrayList<Product>();
    }

    public void addItemToCart(Product product) {
        cart.add(product);
    }

    public void removeItemFromCart(Product product) {
        cart.remove(product);
    }



    public void checkOut() {
        cart.clear();
    }


    @Override
    public String toString(){
        return "idUser="+getIdUser()+" "+"username="+getUserName()+" "+"password="+getPassword()+"email"+getEmail()+" "+"nume="+getFirstName()+" "+"prenume="+getLastName()+" "+"phone="+getPhone()+" "+"address="+getAddress()+'\n';
    }
}
