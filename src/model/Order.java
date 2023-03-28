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





    public void setIdOrder(Integer idOrder){
        this.idOrder= idOrder;
    }

    public void setMetodaPlata(String metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void setDataPlasare(Date dataPlasare) {
        this.dataPlasare = dataPlasare;
    }




    public Order(Integer idOrder, String metodaPlata, Date dataPlasare){
        this.idOrder=idOrder;
        this.metodaPlata=metodaPlata;
        this.dataPlasare=dataPlasare;
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



}
