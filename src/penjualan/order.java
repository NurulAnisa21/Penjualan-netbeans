/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nurul AD
 */
public class order extends Penjualan{
    Statement st ;
    ResultSet rs ;
    
    String nota, tgl, kode,merk;
 //   Date tgl;
    long total=0,subtotal,ubay,ukem,qty, harga;
    
    koneksijual kj = new koneksijual();
    
    public order(){
        kj.connect();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
   public String getNota(){
        return nota;
    }
    
    public void setNota(String nota){
        this.nota = nota ;
    }

//    public Date getTgl() {
//        return tgl;
//    }
//
//    public void setTgl(Date tgl) {
//        this.tgl = tgl;
//    }  

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
        
    
    
    public long getTotal(){
        total = total+subtotal;
        return total;
    }
    
    public void setTotal(long total){
        this.total = total;
    }
    
    public long getUbay(){
        return ubay;
    }
    
    public void setUbay(long ubay){
        this.ubay = ubay;
    }
    
    public long getUkem(){
        ukem=ubay-total;
        return ukem;
    }
    
    public void setUkem(long ukem){
        this.ukem = ukem;
    }

  //  @Override
    public String getMerk() {
        return merk;
    }
    
    public long getSubtotal(){
        subtotal = harga*qty;
        return subtotal;
    }
    
    public void setSubtotal(long subtotal){
        this.subtotal = subtotal;
    }
   

    //@Override
    public void setHarga(long harga) {
        this.harga = harga;
    }

   // @Override
    public long getHarga() {
        return harga;
    }

  //  @Override
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    

 
    
    
    void HapusGrid(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("delete from sementara");
            JOptionPane.showMessageDialog(null, "Berhasil Hapus Grid");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Hapus Grid"+e);
        }
    }

    void SimpanSementara(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("insert into sementara values('"+this.kode+"','"+this.merk+"','"+this.harga+"','"+this.qty+"','"+this.subtotal+"')");
            JOptionPane.showMessageDialog(null, "Disimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Disimpan 1"+e);
        }
    }
    
    void KurangStok(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("update t_sepatu set stok=stok-'"+this.qty+"'where kd_sepatu='"+this.kode+"'");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal kurang stok"+e);
        }
    }
    
    void SimpanDetail(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("insert into DetailSementara values('"+this.nota+"','"+this.kode+"','"+this.qty+"','"+this.subtotal+"')");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Disimpan 2"+e);
        }
    }
    
    void Simpantb_order(){
        try{
            st=kj.con.createStatement();
            st.executeUpdate("insert into tb_order values('"+this.nota+"','"+this.tgl+"','"+this.total+"')");
            JOptionPane.showMessageDialog(null, "Data Sudah Tersimpan");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Disimpan"+e);
        }
    }
    
}
