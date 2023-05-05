import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException{

        Connection connection = null;
        Statement statememt =null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/barbieshop", "root", "Sparky2002!");

            statememt = connection.createStatement();

            String sql = "INSERT INTO user" + "(iduser , userName, password, email,firstName, lastName)" + "Values('1','anonymus123','mereueu123456','anonimat@gmail.com','Mircea', 'Mirela')";

            statememt.execute(sql);

            System.out.println("Succes!");
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            if (statememt !=null){
                statememt.close();
            }
            if (connection !=null){
                connection.close();
            }
        }
    }
}
