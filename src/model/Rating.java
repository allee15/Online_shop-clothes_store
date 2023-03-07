package model;

public class Rating {


    private String comment;


    private Integer stars;


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Rating(Integer stars, String comment){
        this.stars=stars;
        this.comment=comment;
    }


}
