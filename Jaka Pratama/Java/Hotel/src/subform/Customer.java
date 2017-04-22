/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Kerusakan.java
 *
 * Created on May 15, 2013, 10:14:49 PM
 */
package subform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import koneksi.koneksi;

/**
 *
 * @author Ahmad Jamal
 */
public class Customer extends javax.swing.JInternalFrame {
    Statement stt;
    ResultSet rss;
    DefaultTableModel model;
    int id;
    public Customer() {
        initComponents();
        tabelKerusakan();
        loadtabel();
        btnbatal.setVisible(false);
    }

public void loadtabel(){
    Connection con = new koneksi().getCn();
    String sql = "SELECT * FROM customer ORDER BY id";
    try{
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        while(rss.next()){
            Object[] o = new Object[3];
                o[0] = rss.getString("id");
                o[1] = rss.getString("nama");
                o[2] = rss.getString("no_ktp");
                model.addRow(o);
        }
        rss.close();
    }catch(Exception e){
            e.printStackTrace();
    }
}
public void ambilid(){
Connection con = new koneksi().getCn();
    String sql = "SELECT * FROM customer";
    try{
        stt = con.createStatement();
        rss = stt.executeQuery(sql);
        if(rss.last()){
            id = rss.getInt(1)+1;
        }
        rss.close();
    }catch(Exception e){
            e.printStackTrace();
    }
}
public void id(int id){
this.id = id;
}
public void tabelKerusakan(){
    model = new DefaultTableModel();
    tblkerusakan.setModel(model);
    model.addColumn("ID");
    model.addColumn("Nama Customer");
    model.addColumn("No KTP");
    aturKolom();
}
public void aturKolom(){ 
    TableColumn column;
    tblkerusakan.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
    column = tblkerusakan.getColumnModel().getColumn(0); 
    column.setPreferredWidth(50);
    column = tblkerusakan.getColumnModel().getColumn(1); 
    column.setPreferredWidth(300);
    column = tblkerusakan.getColumnModel().getColumn(1); 
    column.setPreferredWidth(100);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtjenis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkerusakan = new javax.swing.JTable();
        btnhapus = new javax.swing.JButton();
        btnbaru = new javax.swing.JButton();
        btnubahn = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        txtjenis1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(535, 510));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        txtjenis.setEnabled(false);

        jLabel2.setText("Nama Customer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("Jenis Permasalahan Kerusakan Notebook");

        tblkerusakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nama CUstomer", "No KTP"
            }
        ));
        tblkerusakan.setName("tblkerusakan"); // NOI18N
        tblkerusakan.setRowHeight(20);
        tblkerusakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkerusakanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkerusakan);

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Trash-can-icon.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/File-New-icon.png"))); // NOI18N
        btnbaru.setText("Baru");
        btnbaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbaruActionPerformed(evt);
            }
        });

        btnubahn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Actions-document-edit-icon.png"))); // NOI18N
        btnubahn.setText("Ubah");
        btnubahn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnubahn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahnActionPerformed(evt);
            }
        });

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save-icon.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.setEnabled(false);
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/no-icon.png"))); // NOI18N
        btnbatal.setText("Batal");
        btnbatal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbatal.setPreferredSize(new java.awt.Dimension(83, 25));
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        txtjenis1.setEnabled(false);

        jLabel4.setText("No KTP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnbaru, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnubahn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsimpan)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtjenis)
                    .addComponent(txtjenis1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjenis1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbaru)
                    .addComponent(btnubahn)
                    .addComponent(btnsimpan)
                    .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
Connection con = new koneksi().getCn();try
        {
            String nama_customer = txtjenis.getText();
            String no_ktp = txtjenis1.getText();
                
            if(txtjenis.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            }
            else {
            
            String sql="insert into customer (nama ,no_ktp) values('"+nama_customer+"','"+no_ktp+"')";
            PreparedStatement p = con.prepareStatement(sql);
               
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil masuk","Pesan",JOptionPane.INFORMATION_MESSAGE);
            tabelKerusakan();
            loadtabel();
            clear();
            btnbatal.setVisible(false);
            btnhapus.setVisible(true);
            btnubahn.setEnabled(true);
            btnsimpan.setEnabled(false);
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Gagal Simpan");
            e.printStackTrace();
        }
}//GEN-LAST:event_btnsimpanActionPerformed

private void tblkerusakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkerusakanMouseClicked
    int row=tblkerusakan.getSelectedRow();
    txtjenis.setText((String)tblkerusakan.getValueAt(row, 1));
    txtjenis1.setText((String)tblkerusakan.getValueAt(row, 2));
    txtjenis.setEnabled(true);
    txtjenis1.setEnabled(true);
    btnsimpan.setEnabled(false);
}//GEN-LAST:event_tblkerusakanMouseClicked

private void btnubahnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahnActionPerformed
    Connection con = new koneksi().getCn();
    int row=tblkerusakan.getSelectedRow();
    try
        {   
            if(row==-1){
                JOptionPane.showMessageDialog(this, "Pilih salah satu tabel","Pesan",JOptionPane.WARNING_MESSAGE);
            }else{
                String idp = tblkerusakan.getModel().getValueAt(row,0).toString();
                String nama_customer = txtjenis.getText();
                String no_ktp  = txtjenis1.getText();
                String sql="UPDATE customer SET  nama ='"+nama_customer+"', no_ktp='"+no_ktp+"'  WHERE id='"+idp+"'";         
                PreparedStatement p = con.prepareStatement(sql);
                p.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil diubah","Pesan",JOptionPane.INFORMATION_MESSAGE);
                tabelKerusakan();
                loadtabel();
                clear();
                txtjenis.setEnabled(false);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Gagal Ubah");
            e.printStackTrace();
        }
}//GEN-LAST:event_btnubahnActionPerformed

private void btnbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbaruActionPerformed
btnsimpan.setEnabled(true);
btnhapus.setVisible(false);
btnubahn.setEnabled(false);
btnbatal.setVisible(true);
txtjenis.setEnabled(true);
txtjenis1.setEnabled(true);
clear();
}//GEN-LAST:event_btnbaruActionPerformed
private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed

    Connection con = new koneksi().getCn();
    int row=tblkerusakan.getSelectedRow();
    try
        {   if(row==-1){
                JOptionPane.showMessageDialog(this, "Pilih salah satu tabel untuk dihapus","Pesan",JOptionPane.WARNING_MESSAGE);
            }else{
                String idp = tblkerusakan.getModel().getValueAt(row,0).toString();
                String sql="DELETE FROM customer WHERE id = '"+idp+"'";
                int kom=JOptionPane.showConfirmDialog(null, "Apa Anda yakin ingin menghapus salah satu data?","Konfirmasi penghapusan",JOptionPane.YES_NO_OPTION);
                if(kom==JOptionPane.YES_OPTION){
                    stt = con.createStatement();
                    stt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus","Pesan",JOptionPane.INFORMATION_MESSAGE);
                    tabelKerusakan();
                    loadtabel();
                    clear();
                    txtjenis.setEnabled(false);
            }
            }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
}//GEN-LAST:event_btnhapusActionPerformed

private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
clear();
btnubahn.setEnabled(true);
btnhapus.setVisible(true);
btnbatal.setVisible(false);
btnsimpan.setEnabled(false);
txtjenis.setEnabled(false);
}//GEN-LAST:event_btnbatalActionPerformed

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated

}//GEN-LAST:event_formInternalFrameActivated
public void clear(){
    txtjenis.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbaru;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubahn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblkerusakan;
    private javax.swing.JTextField txtjenis;
    private javax.swing.JTextField txtjenis1;
    // End of variables declaration//GEN-END:variables
}
