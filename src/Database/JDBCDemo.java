package Database;

import java.sql.*;

public class JDBCDemo {

        private static Connection connection = null;
        static {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/barbieshop", "root", "Sparky2002!");
            } catch (ClassNotFoundException | SQLException e){
                e.printStackTrace();
            }
        }
        public static Connection getConnection(){return connection;}

}
