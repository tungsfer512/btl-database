/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import static bai_tap_lon.CSDL.jdbcConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nhuan's computer
 */
public class TrangChuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuAdmin
     */
    public TrangChuAdmin() {
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
        loikhuyen = new javax.swing.JButton();
        trungtam = new javax.swing.JButton();
        lstungtam = new javax.swing.JButton();
        lsloikhuyen = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ quản trị viên");

        jPanel1.setLayout(null);

        loikhuyen.setBackground(new java.awt.Color(255, 102, 0));
        loikhuyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loikhuyen.setForeground(new java.awt.Color(255, 255, 255));
        loikhuyen.setText("Thêm lời khuyên");
        loikhuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loikhuyenActionPerformed(evt);
            }
        });
        jPanel1.add(loikhuyen);
        loikhuyen.setBounds(600, 240, 310, 60);

        trungtam.setBackground(new java.awt.Color(255, 102, 0));
        trungtam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        trungtam.setForeground(new java.awt.Color(255, 255, 255));
        trungtam.setText("Thêm trung tâm");
        trungtam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trungtamActionPerformed(evt);
            }
        });
        jPanel1.add(trungtam);
        trungtam.setBounds(600, 330, 310, 60);

        lstungtam.setBackground(new java.awt.Color(255, 102, 0));
        lstungtam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstungtam.setForeground(new java.awt.Color(255, 255, 255));
        lstungtam.setText("Lịch sử thêm trung tâm");
        lstungtam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstungtamActionPerformed(evt);
            }
        });
        jPanel1.add(lstungtam);
        lstungtam.setBounds(600, 420, 310, 60);

        lsloikhuyen.setBackground(new java.awt.Color(255, 102, 0));
        lsloikhuyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lsloikhuyen.setForeground(new java.awt.Color(255, 255, 255));
        lsloikhuyen.setText("Lịch sử thêm lời khuyên");
        lsloikhuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lsloikhuyenActionPerformed(evt);
            }
        });
        jPanel1.add(lsloikhuyen);
        lsloikhuyen.setBounds(600, 510, 310, 60);

        thoat.setBackground(new java.awt.Color(255, 102, 0));
        thoat.setForeground(new java.awt.Color(255, 255, 255));
        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        jPanel1.add(thoat);
        thoat.setBounds(470, 660, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai_tap_lon/Admin.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, -10, 940, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ấn welcome để trở về welcome
    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        Welcome wel = new Welcome();
        wel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_thoatActionPerformed

    private void lstungtamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstungtamActionPerformed
        LSThemTrungTam lsttt = new LSThemTrungTam();
        lsttt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lstungtamActionPerformed

    private void lsloikhuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lsloikhuyenActionPerformed
        LSThemLoiKhuyen lstlk = new LSThemLoiKhuyen();
        lstlk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lsloikhuyenActionPerformed

    private void trungtamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trungtamActionPerformed
        // TODO add your handling code here:
        Them_Trung_Tam them=new Them_Trung_Tam();
        them.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trungtamActionPerformed

    private void loikhuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loikhuyenActionPerformed
        // TODO add your handling code here:
        Nhap_Loi_Khuyen them=new Nhap_Loi_Khuyen();
        them.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loikhuyenActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuAdmin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loikhuyen;
    private javax.swing.JButton lsloikhuyen;
    private javax.swing.JButton lstungtam;
    private javax.swing.JButton thoat;
    private javax.swing.JButton trungtam;
    // End of variables declaration//GEN-END:variables
}
