package model;
import model.Cart;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
//    private ArrayList<Product> cart;
    private Cart cart;
    private String phone;
    private String address;



    public String getPhone(){
        return phone;
    }

    public String getAddress(){
        return address;
    }
    public Cart getCart() {
        return cart;
    }


    public void setPhone(String phone){
        this.phone=phone;
    }

    public void setAddress(String address){
        this.address=address;
    }

    public void setCart(Cart cart){this.cart=cart;}
    public Customer(String phone, String address, Cart cart){
        this.address="";
        this.phone="";
        this.cart=null;
    }
    public Customer(Integer idUser, String userName, String password, String email, String firstName, String lastName, String phone, String address, Cart cart){
        super(idUser,userName,password,email,firstName, lastName);
        this.phone=phone;
        this.address=address;
        this.cart=cart;
    }


//    public void addItemToCart(Product product) {
//        if (cart==null)
//            cart=new ArrayList<Product>();
//        cart.add(product);
//    }

//    public void removeItemFromCart(Product product) {
//        cart.remove(product);
//    }


//
//    public void checkOut() {
//        cart.clear();
//    }


    @Override
    public String toString(){
        return super.toString()+'\n'+"phone="+getPhone()+'\n'+"address="+getAddress()+'\n';
    }
}
