import java.sql.*;
import java.io.*;
public class FiveJDBC {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Nov_JDBC";
            String username = "root";
            String password = "9990";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection is closed...");
            }else{
                System.out.println("Connection is created...");
            }
            String query = "create table images(Id int(10) primary key auto_increment,Pic blob)";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table is created......");
            /** Inseting image into a table**/

            String quer = "insert into images(pic)values(?)";
            PreparedStatement pstmt = con.prepareStatement(quer);
            FileInputStream file = new FileInputStream("C:\\Users\\Shashank\\Desktop\\n\\JDBC\\src\\cat.jpg");
            pstmt.setBinaryStream(1,file,file.available());
            pstmt.executeUpdate();
            System.out.println("Image Inserted.....");
            con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
