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


    public Admin(){
        this.status="";
        this.role="";
    }
    public Admin( Integer idUser,String userName, String password, String email, String firstName, String lastName,String role, String status){
        super(idUser,userName, password, email,firstName,lastName);
        this.role=role;
        this.status=status;
    }
    @Override
    public String toString(){
        return super.toString()+'\n'+"role="+getRole()+'\n'+"status="+getStatus()+'\n';
    }

}
