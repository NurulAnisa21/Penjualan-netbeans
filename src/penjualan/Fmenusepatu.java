/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nurul AD
 */
public class Fmenusepatu extends javax.swing.JInternalFrame {
    DefaultTableModel tm;
    String[] spt={"kode sepatu", "nm_sepatu", "jenis_sepatu", "ukuran", "tipe", "harga", "stok"};
    
    sepatu Sepatu = new sepatu(); 
    koneksijual kj =new koneksijual();
    
    /**
     * Creates new form menusepatu
     */
    public Fmenusepatu() {
        initComponents();
        
        tampil();
        Btsimpan.setEnabled(false);
        Btbatal.setEnabled(false);
        Btubah.setEnabled(false);
        Bthapus.setEnabled(false);
        Btupdate.setEnabled(false);
    }
    
    void no_auto()
    {
        try
        {
            int kode;
            kj.rs=kj.st.executeQuery("select right(kd_sepatu,3) as x from t_sepatu order by kd_sepatu desc");
            if (kj.rs.next())
            {
                kode = Integer.parseInt(kj.rs.getString("x"))+1;
                Kdsepatu.setText("KD00"+Integer.toString(kode));
            }
            else
            {
                kode=1;
                Kdsepatu.setText("KD00"+Integer.toString(kode));
                
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Kode tidak bisa tampil"+e);
        }
    }
            
void nonaktif()
{
    Kdsepatu.setEnabled(false);
    Nmbarang.setEnabled(false);
    Jenissepatu.setEnabled(false);
    Hargasepatu.setEnabled(false);
    Stoksepatu.setEnabled(false);
    ukuran.setEnabled(true);
    dewasa.setEnabled(true);
    anak.setEnabled(true);
}

void aktif()
{
    Nmbarang.setEnabled(true);
    Jenissepatu.setEnabled(true);
    ukuran.setEnabled(true);
    dewasa.setEnabled(true);
    anak.setEnabled(true);
    Hargasepatu.setEnabled(true);
    Stoksepatu.setEnabled(true);
}

void bersih()
{
     Kdsepatu.setText("");
    Nmbarang.setText("");
    ukuran.setText("");
    bg.clearSelection();
    Jenissepatu.setText("");
    Hargasepatu.setText("");
    Stoksepatu.setText("");
}

void tampil()
{
    tm=new DefaultTableModel(null,spt);
    try
    {
        kj.connect();
        kj.rs=kj.st.executeQuery("select * from t_sepatu");
        while (kj.rs.next())
        {
            String a=kj.rs.getString("kd_sepatu");
            String b=kj.rs.getString("nm_sepatu");
            String c=kj.rs.getString("jenis_sepatu");
            String d=kj.rs.getString("ukuran");
            String e=kj.rs.getString("tipe");
            String f=kj.rs.getString("harga");
            String g=kj.rs.getString("stok");
            
            String[] data={a,b,c,d,e,f,g};
            tm.addRow(data);
            
        }
        tb_sepatu.setModel(tm);
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Tabel belum muncul" +e);
    }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        Kdsepatu = new javax.swing.JTextField();
        Nmbarang = new javax.swing.JTextField();
        Jenissepatu = new javax.swing.JTextField();
        ukuran = new javax.swing.JTextField();
        dewasa = new javax.swing.JRadioButton();
        anak = new javax.swing.JRadioButton();
        Hargasepatu = new javax.swing.JTextField();
        Stoksepatu = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Bttambah = new javax.swing.JButton();
        Btubah = new javax.swing.JButton();
        Btsimpan = new javax.swing.JButton();
        Btupdate = new javax.swing.JButton();
        Btbatal = new javax.swing.JButton();
        Bthapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Caribarang = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_sepatu = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        Kdsepatu1 = new javax.swing.JTextField();
        Nmbarang1 = new javax.swing.JTextField();
        Jenissepatu1 = new javax.swing.JTextField();
        ukuran1 = new javax.swing.JTextField();
        dewasa1 = new javax.swing.JRadioButton();
        anak1 = new javax.swing.JRadioButton();
        Hargasepatu1 = new javax.swing.JTextField();
        Stoksepatu1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Bttambah1 = new javax.swing.JButton();
        Btubah1 = new javax.swing.JButton();
        Btsimpan1 = new javax.swing.JButton();
        Btupdate1 = new javax.swing.JButton();
        Btbatal1 = new javax.swing.JButton();
        Bthapus1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Caribarang1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_sepatu1 = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Form Sepatu Laki-laki");
        setAutoscrolls(true);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)), "Input Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 55));
        jPanel1.setLayout(null);
        jPanel1.add(Kdsepatu);
        Kdsepatu.setBounds(190, 40, 154, 30);
        jPanel1.add(Nmbarang);
        Nmbarang.setBounds(190, 90, 154, 30);
        jPanel1.add(Jenissepatu);
        Jenissepatu.setBounds(190, 130, 154, 30);
        jPanel1.add(ukuran);
        ukuran.setBounds(470, 180, 80, 30);

        bg.add(dewasa);
        dewasa.setText("Dewasa");
        dewasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dewasaActionPerformed(evt);
            }
        });
        jPanel1.add(dewasa);
        dewasa.setBounds(190, 180, 80, 30);

        bg.add(anak);
        anak.setText("Anak-anak");
        anak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anakActionPerformed(evt);
            }
        });
        jPanel1.add(anak);
        anak.setBounds(280, 180, 100, 30);
        jPanel1.add(Hargasepatu);
        Hargasepatu.setBounds(190, 230, 154, 30);
        jPanel1.add(Stoksepatu);
        Stoksepatu.setBounds(190, 280, 154, 30);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/form-sepatu.jpg"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(10, 20, 550, 310);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)), "Tools", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        jPanel2.setLayout(null);

        Bttambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tambah.png"))); // NOI18N
        Bttambah.setText("Tambah");
        Bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttambahActionPerformed(evt);
            }
        });
        jPanel2.add(Bttambah);
        Bttambah.setBounds(30, 40, 130, 50);

        Btubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        Btubah.setText("Ubah");
        Btubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtubahActionPerformed(evt);
            }
        });
        jPanel2.add(Btubah);
        Btubah.setBounds(30, 100, 130, 50);

        Btsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/simpan.jpg"))); // NOI18N
        Btsimpan.setText("Simpan");
        Btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtsimpanActionPerformed(evt);
            }
        });
        jPanel2.add(Btsimpan);
        Btsimpan.setBounds(200, 40, 118, 50);

        Btupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update.png"))); // NOI18N
        Btupdate.setText("Update");
        Btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtupdateActionPerformed(evt);
            }
        });
        jPanel2.add(Btupdate);
        Btupdate.setBounds(200, 100, 120, 50);

        Btbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Batal.png"))); // NOI18N
        Btbatal.setText("Batal");
        Btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtbatalActionPerformed(evt);
            }
        });
        jPanel2.add(Btbatal);
        Btbatal.setBounds(30, 160, 130, 50);

        Bthapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hapus.png"))); // NOI18N
        Bthapus.setText("Hapus");
        Bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BthapusActionPerformed(evt);
            }
        });
        jPanel2.add(Bthapus);
        Bthapus.setBounds(200, 160, 120, 50);

        jLabel7.setText("Cari Barang");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 210, 57, 15);

        Caribarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaribarangActionPerformed(evt);
            }
        });
        Caribarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CaribarangKeyPressed(evt);
            }
        });
        jPanel2.add(Caribarang);
        Caribarang.setBounds(40, 250, 173, 40);

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cari.jpg"))); // NOI18N
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel2.add(cari);
        cari.setBounds(230, 250, 50, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tools-.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 20, 350, 310);

        tb_sepatu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tb_sepatu);

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jInternalFrame1.setBorder(null);
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Form Sepatu Laki-laki");
        jInternalFrame1.setAutoscrolls(true);

        jDesktopPane2.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane2.setForeground(new java.awt.Color(204, 204, 204));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)), "Input Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 51, 55));
        jPanel3.setLayout(null);
        jPanel3.add(Kdsepatu1);
        Kdsepatu1.setBounds(160, 40, 154, 30);
        jPanel3.add(Nmbarang1);
        Nmbarang1.setBounds(160, 90, 154, 30);
        jPanel3.add(Jenissepatu1);
        Jenissepatu1.setBounds(160, 140, 154, 30);
        jPanel3.add(ukuran1);
        ukuran1.setBounds(470, 190, 80, 30);

        bg.add(dewasa1);
        dewasa1.setText("Dewasa");
        dewasa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dewasa1ActionPerformed(evt);
            }
        });
        jPanel3.add(dewasa1);
        dewasa1.setBounds(160, 190, 80, 30);

        bg.add(anak1);
        anak1.setText("Anak-anak");
        anak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anak1ActionPerformed(evt);
            }
        });
        jPanel3.add(anak1);
        anak1.setBounds(250, 190, 90, 30);
        jPanel3.add(Hargasepatu1);
        Hargasepatu1.setBounds(160, 240, 154, 30);
        jPanel3.add(Stoksepatu1);
        Stoksepatu1.setBounds(160, 280, 154, 30);
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 20, 550, 300);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)), "Tools", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 153, 0))); // NOI18N
        jPanel4.setLayout(null);

        Bttambah1.setText("Tambah");
        Bttambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bttambah1ActionPerformed(evt);
            }
        });
        jPanel4.add(Bttambah1);
        Bttambah1.setBounds(30, 50, 72, 25);

        Btubah1.setText("Ubah");
        Btubah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btubah1ActionPerformed(evt);
            }
        });
        jPanel4.add(Btubah1);
        Btubah1.setBounds(30, 120, 72, 25);

        Btsimpan1.setText("Simpan");
        Btsimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btsimpan1ActionPerformed(evt);
            }
        });
        jPanel4.add(Btsimpan1);
        Btsimpan1.setBounds(140, 50, 69, 25);

        Btupdate1.setText("Update");
        Btupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btupdate1ActionPerformed(evt);
            }
        });
        jPanel4.add(Btupdate1);
        Btupdate1.setBounds(140, 120, 69, 25);

        Btbatal1.setText("Batal");
        Btbatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btbatal1ActionPerformed(evt);
            }
        });
        jPanel4.add(Btbatal1);
        Btbatal1.setBounds(240, 50, 65, 25);

        Bthapus1.setText("Hapus");
        Bthapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bthapus1ActionPerformed(evt);
            }
        });
        jPanel4.add(Bthapus1);
        Bthapus1.setBounds(240, 120, 65, 25);

        jLabel8.setText("Cari Barang");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 210, 57, 15);

        Caribarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caribarang1ActionPerformed(evt);
            }
        });
        Caribarang1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Caribarang1KeyPressed(evt);
            }
        });
        jPanel4.add(Caribarang1);
        Caribarang1.setBounds(40, 250, 173, 19);

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(230, 250, 53, 25);
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 20, 380, 300);

        tb_sepatu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));
        tb_sepatu1.setForeground(new java.awt.Color(0, 153, 0));
        tb_sepatu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Sepatu", "Merk Sepatu", "Jenis Sepatu", "Ukuran Sepatu", "Tipe Sepatu", "Harga Sepatu", "Stok Sepatu"
            }
        ));
        jScrollPane2.setViewportView(tb_sepatu1);

        jDesktopPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 526, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 526, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtsimpanActionPerformed
        // TODO add your handling code here:
         Sepatu.setKode(Kdsepatu.getText());
        Sepatu.setNama(Nmbarang.getText());
        Sepatu.setJenis(Jenissepatu.getText());
        Sepatu.setUk(Long.parseLong(ukuran.getText()));
            if (dewasa.isSelected()) 
                Sepatu.setType(dewasa.getText());
            else
                Sepatu.setType(anak.getText());
        Sepatu.setStok(Long.parseLong(Stoksepatu.getText()));
        Sepatu.setHarga(Long.parseLong(Hargasepatu.getText()));
        
        Sepatu.simpan();
        bersih();
        nonaktif();
        tampil();
    }//GEN-LAST:event_BtsimpanActionPerformed

    private void BttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttambahActionPerformed
        // TODO add your handling code here:
        aktif();
        no_auto();
        Btbatal.setEnabled(true);
        Btsimpan.setEnabled(true);
        Nmbarang.grabFocus();
    }//GEN-LAST:event_BttambahActionPerformed

    private void BtubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtubahActionPerformed
        // TODO add your handling code here:
        aktif();
        Kdsepatu.setEnabled(false);
    }//GEN-LAST:event_BtubahActionPerformed

    private void BtbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtbatalActionPerformed
        // TODO add your handling code here:
        bersih();
        nonaktif();
        Bttambah.setEnabled(true);
    }//GEN-LAST:event_BtbatalActionPerformed

    private void BtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtupdateActionPerformed
        // TODO add your handling code here:
        aktif();
        Kdsepatu.setEnabled(false);
        Sepatu.getKode();
        Sepatu.setNama(Nmbarang.getText());
        Sepatu.setJenis(Jenissepatu.getText());

        if (dewasa.isSelected())
                Sepatu.setType(dewasa.getText());
            else
                Sepatu.setType(anak.getText());
                Sepatu.setUk(Long.parseLong(ukuran.getText()));
       Sepatu.setHarga(Long.parseLong(Hargasepatu.getText()));
       Sepatu.setStok(Long.parseLong(Stoksepatu.getText()));
       // Sepatu.setHarga(Long.parseLong(Hargasepatu.getText()));
       
       Sepatu.update();
        tampil();
        bersih();
        nonaktif();
    }//GEN-LAST:event_BtupdateActionPerformed

    private void CaribarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CaribarangKeyPressed
        // TODO add your handling code here:
     
        
    }//GEN-LAST:event_CaribarangKeyPressed

    private void CaribarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaribarangActionPerformed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_CaribarangActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        Sepatu.setKode(Caribarang.getText());
        Sepatu.cari();
        
        Kdsepatu.setText(Sepatu.getKode());
        Nmbarang.setText(Sepatu.getNama());
        Jenissepatu.setText(Sepatu.getJenis());
        ukuran.setText(Long.toString(Sepatu.uk));
        if (Sepatu.getJenis().equalsIgnoreCase("dewasa"))
                dewasa.setSelected(true);
            else
                anak.setSelected(true);
        Hargasepatu.setText(Long.toString(Sepatu.getHarga()));
        Stoksepatu.setText(Long.toString(Sepatu.getStok()));
        Btupdate.setEnabled(true);
        Btubah.setEnabled(true);
        Btbatal.setEnabled(true);
        Bthapus.setEnabled(true);
        Bttambah.setEnabled(false);
    }//GEN-LAST:event_cariActionPerformed

    private void BthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BthapusActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Ingin dihapus ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if (a==JOptionPane.YES_OPTION){
                Sepatu.hapus();
                bersih();
                tampil();              
            }else
                return;
    }//GEN-LAST:event_BthapusActionPerformed

    private void anakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anakActionPerformed
        // TODO add your handling code here:
        Sepatu.setJenis(anak.getText());
    }//GEN-LAST:event_anakActionPerformed

    private void dewasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dewasaActionPerformed
        // TODO add your handling code here:
        Sepatu.setType(dewasa.getText());
    }//GEN-LAST:event_dewasaActionPerformed

    private void dewasa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dewasa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dewasa1ActionPerformed

    private void anak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anak1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anak1ActionPerformed

    private void Bttambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bttambah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bttambah1ActionPerformed

    private void Btubah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btubah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btubah1ActionPerformed

    private void Btsimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btsimpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btsimpan1ActionPerformed

    private void Btupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btupdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btupdate1ActionPerformed

    private void Btbatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btbatal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btbatal1ActionPerformed

    private void Bthapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bthapus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bthapus1ActionPerformed

    private void Caribarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caribarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caribarang1ActionPerformed

    private void Caribarang1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Caribarang1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caribarang1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btbatal;
    private javax.swing.JButton Btbatal1;
    private javax.swing.JButton Bthapus;
    private javax.swing.JButton Bthapus1;
    private javax.swing.JButton Btsimpan;
    private javax.swing.JButton Btsimpan1;
    private javax.swing.JButton Bttambah;
    private javax.swing.JButton Bttambah1;
    private javax.swing.JButton Btubah;
    private javax.swing.JButton Btubah1;
    private javax.swing.JButton Btupdate;
    private javax.swing.JButton Btupdate1;
    private javax.swing.JTextField Caribarang;
    private javax.swing.JTextField Caribarang1;
    private javax.swing.JTextField Hargasepatu;
    private javax.swing.JTextField Hargasepatu1;
    private javax.swing.JTextField Jenissepatu;
    private javax.swing.JTextField Jenissepatu1;
    private javax.swing.JTextField Kdsepatu;
    private javax.swing.JTextField Kdsepatu1;
    private javax.swing.JTextField Nmbarang;
    private javax.swing.JTextField Nmbarang1;
    private javax.swing.JTextField Stoksepatu;
    private javax.swing.JTextField Stoksepatu1;
    private javax.swing.JRadioButton anak;
    private javax.swing.JRadioButton anak1;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JButton cari;
    private javax.swing.JRadioButton dewasa;
    private javax.swing.JRadioButton dewasa1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_sepatu;
    private javax.swing.JTable tb_sepatu1;
    private javax.swing.JTextField ukuran;
    private javax.swing.JTextField ukuran1;
    // End of variables declaration//GEN-END:variables
}
