package com.connection.sql;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class UpdateJDBC {
    public static void main(String[] args) throws IOException {
      try{
          Connection con = CreatingConnection.getConnection();
          String query = "update table01 set NAME = ?,CITY = ? where ID = ?";
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter new Name :");
          String name = br.readLine();
          System.out.println("Enter new City : ");
          String city = br.readLine();
          System.out.println("Enter Id");
          int id = Integer.parseInt(br.readLine());
          PreparedStatement pstmt = con.prepareStatement(query);
          pstmt.setString(1,name);
          pstmt.setString(2,city);
          pstmt.setInt(3,id);
          pstmt.executeUpdate();
          System.out.println("Updation executed Successfully::");
          con.close();
      }catch(Exception e)
      {
          e.printStackTrace();
      }
    }
}
