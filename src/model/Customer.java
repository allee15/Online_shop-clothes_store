package model;

public class Customer extends User{
//    private ArrayList<Product> cart;
    private Cart cart;
    private String phone;
    private String address;

//    private List<Order> orders;

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

//    public List<Order> getOrders() {
//        return orders;
//    }


    public Customer(){
        this.address="";
        this.phone="";
        this.cart=null;
//        this.orders=new ArrayList<Order>();

    }
    public Customer(Integer idUser, String userName, String password, String email, String firstName, String lastName, String phone, String address, Cart cart){
        super(idUser,userName,password,email,firstName, lastName);
        this.phone=phone;
        this.address=address;
        this.cart=cart;
//        this.orders=orders;
    }

//    public void adaugareComanda(Order order) {
//        orders.add(order);
//    }
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
        return super.toString()+'\n'+"phone="+getPhone()+'\n'+"address="+getAddress()+'\n'+"cos cumparaturi"+getCart();
    }

    public void PersonalDetails(String phone) throws CustomerException{
        if(phone.length() != 12) throw new CustomerException("Numarul de telefon introdus este invalid! ");

    }


    public static class CustomerException extends Exception {
        public CustomerException(String message) {
            super(message);
        }
    }

}
