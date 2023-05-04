import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;

public class JDBCDemo {
    public static void main(String[] args){
        String url = "ldbc:mysql://localhost:3306/jdbcdemo";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
