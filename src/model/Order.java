package model;

import java.util.Date;

public class Order {
    //metoda de plata, total
    private Integer idOrder;
    private String metodaPlata;
    private Float total;
    private Date dataPlasare;


    public Integer getIdOrder(){
        return idOrder;
    }

    public String getMetodaPlata() {
        return metodaPlata;
    }

    public Float getTotal() {
        return total;
    }

    public Date getDataPlasare() {
        return dataPlasare;
    }



    public void setIdOrder(Integer idOrder){
        this.idOrder= idOrder;
    }

    public void setMetodaPlata(String metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public void setDataPlasare(Date dataPlasare) {
        this.dataPlasare = dataPlasare;
    }




    public Order(Integer idOrder, String metodaPlata, Float total, Date dataPlasare){
        this.idOrder=idOrder;
        this.metodaPlata=metodaPlata;
        this.total=total;
        this.dataPlasare=dataPlasare;
    }


}
