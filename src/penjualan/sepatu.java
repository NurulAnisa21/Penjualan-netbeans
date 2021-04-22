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
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

public class sepatu {
    Statement st;
    ResultSet rs;
    
    String kode,nama,jenis,type;
    long harga, stok,uk;
    
    koneksijual kj = new koneksijual();
    
    public sepatu()
    {
        kj.connect();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public long getStok() {
        return stok;
    }

    public void setStok(long stok) {
        this.stok = stok;
    }

    public long getUk() {
        return uk;
    }

    public void setUk(long uk) {
        this.uk = uk;
    }

    
    
    void simpan()
    {
        try
        {
            st=kj.con.createStatement();
            st.executeUpdate("insert into t_sepatu values('"+this.kode+"','"+this.nama+"','"+this.jenis+"','"+this.uk+"','"+this.type+"','"+this.harga+"','"+this.stok+"')");
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
        }
    }
    
    void cari()
    {
        try
        {
            st=kj.con.createStatement();
            rs=st.executeQuery("select * from t_sepatu where kd_sepatu='"+this.kode+"'");
            if(rs.next())
            {
                kode=rs.getString("kd_sepatu");
                nama=rs.getString("nm_sepatu");
                jenis=rs.getString("jenis_sepatu");
                uk=rs.getInt("ukuran");
                type=rs.getString("tipe");
                harga=rs.getInt("harga");
                stok=rs.getInt("stok");
                
                JOptionPane.showMessageDialog(null, "Data berhasil ditemukan");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data tidak dapat ditemukan");
                kode="";
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,("Gagal Ditemukan")+e);
        }
    }
    
    void update()
    {
        try
        {
            st=kj.con.createStatement();
             st.executeUpdate("update t_sepatu set nm_sepatu='"+this.nama+"',jenis_sepatu='"+this.jenis+"',ukuran='"+this.uk+"',tipe='"+this.type+"',harga='"+this.harga+"',stok='"+this.stok+"'" +
                    " where kd_sepatu='"+this.kode+"'");
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Update");
           
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Gagal di Update" +e);
        }
    }
    
    void hapus()
    {
        try
        {
            st.executeUpdate("delete from t_sepatu where kd_sepatu='"+this.kode+"'");
            
            JOptionPane.showMessageDialog(null, "Data berhasil terhapus");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus"+ e);
            
        }
    }
}
