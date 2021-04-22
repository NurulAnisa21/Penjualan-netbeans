/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author Nurul AD
 */
import java.sql.*;
import javax.swing.*;
public class koneksijual {
    
    Connection con;
    ResultSet rs;
    Statement st;
    String db;
    
    void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_jualsepatu","root","");
            st=con.createStatement();
        }
        catch(Exception a)
        {
            JOptionPane.showMessageDialog(null,"Koneksi gagal pada Koneksi Sepatu!"+a);
        }
    }
    
}

