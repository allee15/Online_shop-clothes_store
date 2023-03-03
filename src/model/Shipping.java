package model;

import java.util.Date;
import java.util.SortedMap;

public class Shipping {

    private Integer idShipping;
    private String city;
    private String country;
    private String address;
    private String postalCode;
    private Date dataLivrare;


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

    public Date getDataLivrare() {
        return dataLivrare;
    }




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

    public void setDataLivrare(Date dataLivrare) {
        this.dataLivrare = dataLivrare;
    }



    public Shipping(Integer idShipping, String city, String country, String address, String postalCode, Date dataLivrare){
        this.idShipping=idShipping;
        this.city=city;
        this.country=country;
        this.address=address;
        this.postalCode=postalCode;
        this.dataLivrare=dataLivrare;
    }

}
