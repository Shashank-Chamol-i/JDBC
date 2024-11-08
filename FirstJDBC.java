import java.sql.*;
public class FirstJDBC {

    public static void main(String[] args)
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Nov_JDBC";
            String username = "root";
            String password = "9990";

            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection is closed....");
            }else{
                System.out.println("Connection is created....... ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
