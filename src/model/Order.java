package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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




    public Order(Integer idOrder, String metodaPlata, Date dataPlasare,Shipping shipping){

        this.idOrder=idOrder;
        this.metodaPlata=metodaPlata;
        this.dataPlasare=dataPlasare;
        this.shipping=shipping;
    }

    public Order(){
        this.idOrder=-1;
        this.metodaPlata="card";
        this.dataPlasare=new Date();
        this.shipping=null;
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
        return "idOrder="+getIdOrder()+" "+"metoda de plata="+getMetodaPlata()+" "+"data plasarii="+getDataPlasare()+" "+"shipping="+getShipping()+'\n';
    }
}
