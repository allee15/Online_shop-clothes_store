package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    //metoda de plata, total
    private Integer idOrder;
    private String metodaPlata;
    private Date dataPlasare;

    private List<Product> itemsInOrder;

    private Shipping shipping;


    public Integer getIdOrder(){
        return idOrder;
    }

    public String getMetodaPlata() {
        return metodaPlata;
    }

    public Date getDataPlasare() {
        return dataPlasare;
    }
    public List<Product> getItemsInOrder() {
        return itemsInOrder;
    }

    public Shipping getShipping(){
        return shipping;
    }


    public void setShipping(Shipping shipping){
        this.shipping=shipping;

    }
    public void setIdOrder(Integer idOrder){
        this.idOrder= idOrder;
    }

    public void setMetodaPlata(String metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void setDataPlasare(Date dataPlasare) {
        this.dataPlasare = dataPlasare;
    }
    public void setItemsInOrder(List<Product> itemsInOrder) {
        this.itemsInOrder = itemsInOrder;
    }




    public Order(Integer idOrder, String metodaPlata,Shipping shipping, Date dataPlasare,List<Product>itemsInOrder){

        this.idOrder=idOrder;
        this.metodaPlata=metodaPlata;
        this.dataPlasare=dataPlasare;
        this.shipping=shipping;
        this.itemsInOrder=itemsInOrder;
    }

    public Order(){
        this.idOrder=-1;
        this.metodaPlata="card";
        this.dataPlasare=new Date();
        this.shipping=null;
        this.itemsInOrder=new ArrayList<Product>();
    }
    public void addItem(Product p){
        this.itemsInOrder.add(p);
    }

    public void removeItem(Product p){
        this.itemsInOrder.remove(p);
    }

    public double calculateTotalCost(){
        double totalCost=0.0;
        for(Product p: this.itemsInOrder)
            totalCost+= p.getPrice();
        return totalCost;
    }



    @Override
    public String toString(){
        return "idOrder="+getIdOrder()+'\n'+"metoda de plata="+getMetodaPlata()+'\n'+"shipping="+getShipping()+'\n'+"dataLivrare="+dataPlasare+'\n'+"produse comanda="+getItemsInOrder()+'\n';
    }

    public void PaymentMethod(String metodaPlata) throws OrderException{
        if(!Objects.equals(metodaPlata, "Cash") && !Objects.equals(metodaPlata, "Card")) {
            throw new OrderException("Alege o metoda de plata existenta!");
        }
    }

    public static class OrderException extends Exception {
        public OrderException(String message) {
            super(message);
        }
    }
}


