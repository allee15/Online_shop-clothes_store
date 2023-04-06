package model;

public class Coupon {

    private Boolean valid;
    private Double percentage;
    private final String code;




    public String getCode() {
        return code;
    }
    public Double getPercentage() {
        return percentage;
    }
    public Boolean getValid() {
        return valid;
    }





    public void setCode(String code) {
        code = code;
    }
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }




    public Coupon(){
        this.code="";
        this.percentage=0.0;
        this.valid=false;
    }
    public Coupon(String code, Double percentage, Boolean valid){
        this.code=code;
        this.percentage=percentage;
        this.valid=valid;
    }


    public double reducere(double price){
        double redus;
        if (valid){
            redus=price-(price*percentage/100);
            return redus;
        }
        else return  price;
    }


    @Override
    public String toString(){
        return "Code="+getCode()+'\n'+"percentage="+getPercentage()+'\n'+"valid="+getValid()+"email"+'\n';
    }
}
