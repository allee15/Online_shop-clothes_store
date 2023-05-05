import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException{

        Connection connection = null;
        Statement statememt =null;
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/barbieshop", "root", "Sparky2002!");

            statememt = connection.createStatement();

            String sql = "INSERT INTO admin" + "(role, status)" + "Values('owner','available')";

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
