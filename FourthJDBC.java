/*Inserting data into table with dynamic input*/
import javax.xml.transform.Source;
import java.sql.*;
import java.io.*;
public class FourthJDBC {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Nov_jdbc";
            String username = "root";
            String password = "9990";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection not creted......");
            }else{
                System.out.println("Connection is created....");
            }
            String query = "insert into table01(Name,City)values(?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Name..");
            String name = br.readLine();
            System.out.println("Enter the City..");
            String city = br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.executeUpdate();
            System.out.println("Data inserted...");
            con.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
