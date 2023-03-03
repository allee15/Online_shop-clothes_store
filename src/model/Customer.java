package model;

public class Customer extends User{
    //phone adresa
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
}
