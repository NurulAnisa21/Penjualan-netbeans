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

public class regispetugas {
    Statement st;
    ResultSet rs;
    
    String kode,nama,kel,almt,pss;
    long umr;
    
    koneksijual kj=new koneksijual();
    
    public regispetugas()
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

    public String getKel() {
        return kel;
    }

    public void setKel(String kel) {
        this.kel = kel;
    }

    public String getAlmt() {
        return almt;
    }

    public void setAlmt(String almt) {
        this.almt = almt;
    }

    public String getPss() {
        return pss;
    }

    public void setPss(String pss) {
        this.pss = pss;
    }

    public long getUmr() {
        return umr;
    }

    public void setUmr(long umr) {
        this.umr = umr;
    }
    
      void simpan(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("insert into petugas values('"+this.kode+"','"+this.nama+"','"+this.kel+"','"+this.umr+"','"+this.almt+"','"+this.pss+"')");
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal tersimpan " +e);
        }
    }
      
      void cari(){
        try{
            st=kj.con.createStatement();
            rs=st.executeQuery("select * from petugas where kd_petugas='"+this.kode+"'");
            if(rs.next()){
                kode=rs.getString("kd_petugas");
                nama=rs.getString("nm_petugas");
                kel=rs.getString("jenkel");
                umr=rs.getInt("umur_petugas");
                almt=rs.getString("alamat_petugas");
                pss=rs.getString("password");
                
                JOptionPane.showMessageDialog(null, "Data Ditemukan");
            }
            else{
                JOptionPane.showMessageDialog(null, "Gagal Ditemukan");
                kode="";
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Ditemukan "+e);
        }
    }
    
    void update(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("Update petugas set nm_petugas='"+this.nama+"',jenkel='"+this.kel+"',umur_petugas='"+this.umr+"',alamat_petugas='"+this.almt+"',password='"+this.pss+"'" +
                    " where kd_petugas='"+this.kode+"'");
            JOptionPane.showMessageDialog(null, "Data Berhasil di-update");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Di-update "+e);
        }
    }
    
    void hapus(){
        try{
            st.executeUpdate("delete from petugas where kd_petugas='"+this.kode+"'");
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Dihapus "+e);
        }
    }
}

