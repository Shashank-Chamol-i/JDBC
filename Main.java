package com.connection.sql;
import javax.swing.*;
import java.sql.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try
        {
            Connection c = CreatingConnection.getConnection();
            String qurey = "insert into images(pic)values(?)";
            PreparedStatement pstmt = c.prepareStatement(qurey);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            FileInputStream fle = new FileInputStream(file);
            pstmt.setBinaryStream(1,fle,fle.available());
            pstmt.executeUpdate();
            System.out.println("Done.....");
            JOptionPane.showMessageDialog(null,"success");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
