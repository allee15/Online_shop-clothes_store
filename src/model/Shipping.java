package model;

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

    public void AddressDelivery(String address) throws ShippingException1{
        if(address.length() == 0) {
            throw new ShippingException1("Introdu o adresa valida!");
        }
    }

    public void CityDelivery(String city) throws ShippingException2{
        if(city.length() == 0) {
            throw new ShippingException2("Introdu un oras valid!");
        }
    }

    public void CountryDelivery(String country) throws ShippingException3{
        if(country.length() == 0) {
            throw new ShippingException3("Introdu o tara valida!");
        }
    }

    public void PostalCodeDelivery(String postalCode) throws ShippingException4{
        if(postalCode.length() == 0 || postalCode.length() >6) {
            throw new ShippingException4("Introdu un cod postal valid!");
        }
    }

    public static class ShippingException1 extends Exception{
        public ShippingException1(String message){
            super(message);
        }
    }

    public static class ShippingException2 extends Exception{
        public ShippingException2(String message){
            super(message);
        }
    }

    public static class ShippingException3 extends Exception{
        public ShippingException3(String message){
            super(message);
        }
    }

    public static class ShippingException4 extends Exception{
        public ShippingException4(String message){
            super(message);
        }
    }
}
