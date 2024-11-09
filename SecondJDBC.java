import java.sql.*;

public class SecondJDBC {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = ("jdbc:mysql://localhost:3306/Nov_JDBC");
            String username = "root";
            String password = "9990";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection is closed....");
            }else
            {
                System.out.println("Connection is created.....");
            }

            String query = "create table TABLE01 (ID int(20) primary key auto_increment,Name varchar(200) not null ,City varchar(400))";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created in databases : ");
            con.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
