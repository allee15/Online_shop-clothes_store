package model;

import Business.Store;

public final class Admin extends User {

    private final String role;
    private final String status;



    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }



    public Admin(String userName, String password, String email, String firstName, String lastName,String role, String status){
        super(userName, password, email,firstName,lastName);
        this.role=role;
        this.status=status;
    }


}
