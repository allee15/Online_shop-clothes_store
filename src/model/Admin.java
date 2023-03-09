package model;

public class Admin extends User {

    private String role;
    private String status;



    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }







    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Admin(String userName, String password, String email, String firstName, String lastName,String role, String status){
        super(userName, password, email,firstName,lastName);
        this.role=role;
        this.status=status;
    }

    public void addProduct(Product product, Store store) {
        store.addProduct(product);
    }

    public void removeProduct(Product product, Store store) {
        store.removeProduct(product);
    }

}
