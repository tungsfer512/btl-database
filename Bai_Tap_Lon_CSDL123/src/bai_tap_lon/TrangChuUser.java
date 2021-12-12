/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nhuan's computer
 */
public class TrangChuUser extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuUser
     */
    public TrangChuUser() {
        setLocation(this.getHeight() + 200, this.getWidth());
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

        jPanel1 = new javax.swing.JPanel();
        goiybaitap = new javax.swing.JButton();
        trungtamgan = new javax.swing.JButton();
        nhaptt = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        lichsu = new javax.swing.JButton();
        ttnguoidung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủi người dùng");

        jPanel1.setLayout(null);

        goiybaitap.setBackground(new java.awt.Color(255, 102, 0));
        goiybaitap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        goiybaitap.setForeground(new java.awt.Color(255, 255, 255));
        goiybaitap.setText("Gợi ý bài tập và dinh dưỡng");
        goiybaitap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goiybaitapActionPerformed(evt);
            }
        });
        jPanel1.add(goiybaitap);
        goiybaitap.setBounds(610, 310, 260, 40);

        trungtamgan.setBackground(new java.awt.Color(255, 102, 0));
        trungtamgan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trungtamgan.setForeground(new java.awt.Color(255, 255, 255));
        trungtamgan.setText("Trung tâm gần bạn");
        trungtamgan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trungtamganActionPerformed(evt);
            }
        });
        jPanel1.add(trungtamgan);
        trungtamgan.setBounds(610, 600, 260, 40);

        nhaptt.setBackground(new java.awt.Color(255, 102, 0));
        nhaptt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nhaptt.setForeground(new java.awt.Color(255, 255, 255));
        nhaptt.setText("Nhập thông tin hàng ngày");
        nhaptt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapttActionPerformed(evt);
            }
        });
        jPanel1.add(nhaptt);
        nhaptt.setBounds(610, 530, 260, 40);

        thoat.setBackground(new java.awt.Color(255, 102, 0));
        thoat.setForeground(new java.awt.Color(255, 255, 255));
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        jPanel1.add(thoat);
        thoat.setBounds(460, 670, 70, 30);

        lichsu.setBackground(new java.awt.Color(255, 102, 0));
        lichsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lichsu.setForeground(new java.awt.Color(255, 255, 255));
        lichsu.setText("Lịch sử nhập thông tin");
        lichsu.setActionCommand("Lịch sử");
        lichsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lichsuActionPerformed(evt);
            }
        });
        jPanel1.add(lichsu);
        lichsu.setBounds(610, 390, 260, 40);

        ttnguoidung.setBackground(new java.awt.Color(255, 102, 0));
        ttnguoidung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ttnguoidung.setForeground(new java.awt.Color(255, 255, 255));
        ttnguoidung.setText("Thông tin người dùng");
        ttnguoidung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttnguoidungActionPerformed(evt);
            }
        });
        jPanel1.add(ttnguoidung);
        ttnguoidung.setBounds(610, 460, 260, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai_tap_lon/App theo dõi sức khỏe.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 940, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //ấn welcome để trở về welcome
    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        int dk=JOptionPane.showConfirmDialog(this,"Ban co muon thoat", "Thanh Cong", JOptionPane.YES_NO_OPTION);
        if(dk!=JOptionPane.YES_OPTION)
            return;
        Welcome wel=new Welcome();
        wel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void ttnguoidungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttnguoidungActionPerformed

        try {
            CSDL.statement_hien_thi_thong_tin_nguoi_dung();
        } catch (IOException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            // TODO add your handling code here:
            
            HienThiThongTinNguoiDung infoUser = new HienThiThongTinNguoiDung();
            infoUser.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ttnguoidungActionPerformed

    private void goiybaitapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goiybaitapActionPerformed
        try {
            // TODO add your handling code here:
            GoiYCheDoLuyenTap ltdd = new GoiYCheDoLuyenTap();
            ltdd.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_goiybaitapActionPerformed

    private void lichsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lichsuActionPerformed
        LSThemThongTin lsttt=new LSThemThongTin();
        lsttt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lichsuActionPerformed

    private void nhapttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapttActionPerformed
        // TODO add your handling code here:
        Nhap_Thong_Tin_Hang_Ngay thongtin=new Nhap_Thong_Tin_Hang_Ngay();
            thongtin.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_nhapttActionPerformed

    private void trungtamganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trungtamganActionPerformed
        // TODO add your handling code here:
        TrungTamGanBan center = new TrungTamGanBan();
        center.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trungtamganActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goiybaitap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lichsu;
    private javax.swing.JButton nhaptt;
    private javax.swing.JButton thoat;
    private javax.swing.JButton trungtamgan;
    private javax.swing.JButton ttnguoidung;
    // End of variables declaration//GEN-END:variables
}
