import java.sql.*;
public class ThirdJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = ("jdbc:mysql://localhost:3306/Nov_JDBC");
            String username = "root";
            String password = "9990";
            Connection con = DriverManager.getConnection(url,username,password);
            if(con.isClosed())
            {
                System.out.println("Connection is closed..........");
            }else{
                System.out.println("Connection is created.....");
            }
            String query = "insert into TABLE01(Name,City)values(?,?)";
              PreparedStatement pstmt = con.prepareStatement(query);
              // Set the values
            pstmt.setString(1,"Bupesh");
            pstmt.setString(2,"India");

            System.out.println("Data inserted....");

            pstmt.executeUpdate();
            con.close();


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
