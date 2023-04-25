package model;

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

    public User(){
        this.idUser=0;
        this.lastName="";
        this.firstName="";
        this.userName="";
        this.email="";
        this.password="";
    }
    public User(Integer idUser,String userName, String password, String email, String firstName, String lastName){
        this.idUser=idUser;
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString(){
        return "idUser="+getIdUser()+'\n'+"username="+getUserName()+'\n'+"password="+getPassword()+'\n'+"email"+getEmail()+'\n'+"nume="+getFirstName()+'\n'+"prenume="+getLastName()+'\n';
    }


    public void LastName(String lastName) throws CustomExceptions.UserException1{
        if(lastName.length() == 0) {
            throw new CustomExceptions.UserException1("Introdu un nume valid!");
        }
    }

    public void FirstName(String firstName) throws CustomExceptions.UserException2{
        if(firstName.length() == 0){
            throw new CustomExceptions.UserException2("Introdu un prenume valid!");
        }
    }

    public void UserName(String userName) throws CustomExceptions.UserException3{
        if(userName.length()==0) throw new CustomExceptions.UserException3("Introdu un username valid!");
    }

    public void Password(String password) throws CustomExceptions.UserException4{
        if(password.length()==0) throw new CustomExceptions.UserException4("Introdu o parola!");
    }

    public void Email(String email) throws CustomExceptions.UserException5{
        if(email.length()==0) throw new CustomExceptions.UserException5("Introdu un email valid!");
    }
}
