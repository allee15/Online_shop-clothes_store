package model;

import java.util.ArrayList;

public class User {

    private Integer idUser;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}





    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName){this.firstName=firstName;}
    public void setLastName(String lastName){this.lastName=lastName;}

    public User(Integer idUser,String userName, String password, String email, String firstName, String lastName){
        this.idUser=idUser;
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
    }



}
