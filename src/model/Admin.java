package model;

public class Admin extends User {

    private String role;
    private String status;
    private String firstName;
    private String lastName;



    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }







    public void setRole(String role) {
        this.role = role;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Admin(String role, String status, String firstName, String lastName){
        super();
        this.role=role;
        this.status=status;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void addProduct(Product product, Store store) {
        store.addProduct(product);
    }

    public void removeProduct(Product product, Store store) {
        store.removeProduct(product);
    }

}
