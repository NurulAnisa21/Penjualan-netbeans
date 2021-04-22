/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;
import java.io.File;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
        
/**
 *
 * @author Nurul AD
 */
public class Formlaporan extends javax.swing.JFrame {

    koneksijual kj=new koneksijual();
   
    /**
     * Creates new form Formlaporan
     */
    public Formlaporan() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Blapsepatu = new javax.swing.JButton();
        Blapuser = new javax.swing.JButton();
        Blaptrans = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Blapsepatu.setText("Laporan Sepatu");
        Blapsepatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlapsepatuActionPerformed(evt);
            }
        });

        Blapuser.setText("Laporan User");
        Blapuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlapuserActionPerformed(evt);
            }
        });

        Blaptrans.setText("Laporan Transaksi");
        Blaptrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlaptransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Blaptrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Blapuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Blapsepatu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(Blapsepatu)
                .addGap(43, 43, 43)
                .addComponent(Blapuser)
                .addGap(47, 47, 47)
                .addComponent(Blaptrans)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BlapsepatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlapsepatuActionPerformed
        // TODO add your handling code here:
        try{
            kj.connect();
            File file = new File("");
            String sourcefilename=file.getAbsolutePath()+"\\report\\reportSepatu.jasper";
            JasperPrint cetak=JasperFillManager.fillReport(sourcefilename, new HashMap());
            JasperViewer viewer=new JasperViewer(cetak,false);
            viewer.setFitPageZoomRatio();
            viewer.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BlapsepatuActionPerformed

    private void BlapuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlapuserActionPerformed
        // TODO add your handling code here;
          try{
            kj.connect();
            File file = new File("");
            String sourcefilename=file.getAbsolutePath()+"\\report\\reportUser.jasper";
            JasperPrint cetak=JasperFillManager.fillReport(sourcefilename, new HashMap());
            JasperViewer viewer=new JasperViewer(cetak,false);
            viewer.setFitPageZoomRatio();
            viewer.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BlapuserActionPerformed

    private void BlaptransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlaptransActionPerformed
        // TODO add your handling code here:
          try{
            kj.connect();
            File file = new File("");
            String sourcefilename=file.getAbsolutePath()+"\\report\\reportOrder.jasper";
            JasperPrint cetak=JasperFillManager.fillReport(sourcefilename, new HashMap());
            JasperViewer viewer=new JasperViewer(cetak,false);
            viewer.setFitPageZoomRatio();
            viewer.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BlaptransActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formlaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formlaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formlaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formlaporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formlaporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blapsepatu;
    private javax.swing.JButton Blaptrans;
    private javax.swing.JButton Blapuser;
    // End of variables declaration//GEN-END:variables
}
