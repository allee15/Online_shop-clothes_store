package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;
    private List<Coupon> Coupons;
    private List<Product > itemsInCart;




    public List<Product> getItemsInCart() {
        return itemsInCart;
    }
    public List<Product> getProducts() {
        return products;
    }

    public List<Coupon> getCoupons() {
        return Coupons;
    }



    public  Cart(){
        this.products= new ArrayList<Product>();
        this.Coupons=new ArrayList<Coupon>();
        this.itemsInCart= new ArrayList<Product>();
    }




    public void adaugareProdus(Product product){
        products.add(product);
    }

    public void stergeProdus(Product product){
        products.remove(product);
    }



    public void adaugareCoupon(Coupon Coupon){Coupons.add(Coupon);}
    public void stergereCoupon(Coupon Coupon){Coupons.remove(Coupon);}



    public void adaugareItem(Product product){itemsInCart.add(product);}
    public void stergereItem(Product product){itemsInCart.remove(product);}



    public Double Total(){
        double total=0;
        for (Product product: products){
            total= total + product.getQuantity()*product.getPrice();
        }
        for (Coupon Coupon: Coupons){
            total = total - Coupon.reducere(total);
        }
        return total;
    }

}
