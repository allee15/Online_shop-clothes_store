package model;

import java.util.Date;
import java.util.Calendar;
import java.util.Objects;
import java.time.LocalDate;
public class Shipping {

    private Integer idShipping;
    private String city;
    private String country;
    private String address;
    private String postalCode;
//    private Date dataLivrare;


    public Integer getIdShipping() {
        return idShipping;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

//    public Date getDataLivrare() {
//        return dataLivrare;
//    }




    public void setIdShipping(Integer idShipping) {
        this.idShipping = idShipping;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

//    public void setDataLivrare(Date dataLivrare) {
//        this.dataLivrare = dataLivrare;
//    }



    public Shipping(Integer idShipping, String city, String country, String address, String postalCode){
        this.idShipping=idShipping;
        this.city=city;
        this.country=country;
        this.address=address;
        this.postalCode=postalCode;
//        this.dataLivrare=dataLivrare;
    }

    public Shipping(){
        this.idShipping=1;
        this.city="";
        this.country="";
        this.address="";
        this.postalCode="";
//        this.dataLivrare=new Date();
    }

    //in functie de data livrarii, estimam ziua sigura a acesteia
//    public Date getDeliveryDate(int estimatedDeliveryTime) {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(dataLivrare);
//        cal.add(Calendar.DAY_OF_MONTH, estimatedDeliveryTime);
//        return cal.getTime();
//    }

    //comparam 2 date de livrare
//    public static int compareByDataLivrare(Shipping s1, Shipping s2) {
//        return s1.getDataLivrare().compareTo(s2.getDataLivrare());
//    }


    @Override
    public String toString(){
        return "idShipping="+getIdShipping()+'\n'+"city="+getCity()+'\n'+"country="+getCountry()+'\n'+"address="+getAddress()+'\n'+"postal code="+getPostalCode()+'\n';
    }
}
