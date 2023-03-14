package model;

public class Rating {

    private String comment;
    private Integer stars;
    private Customer customer;
    private Product product;






    public String getComment() {
        return comment;
    }
    public Integer getStars() {
        return stars;
    }






    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setStars(Integer stars) {
        this.stars = stars;
    }



    public Rating(Integer stars, String comment, Customer customer, Product product){
        this.customer=customer;
        this.product=product;
        this.stars=stars;
        this.comment=comment;
    }


}
