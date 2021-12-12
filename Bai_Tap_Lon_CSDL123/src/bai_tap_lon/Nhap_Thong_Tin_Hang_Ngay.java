/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

/**
 *
 * @author tanh admin dz
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.Calendar;
import java.time.*;
import java.awt.event.*; 
import java.awt.*;  
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Nhap_Thong_Tin_Hang_Ngay extends javax.swing.JFrame {
    public Nhap_Thong_Tin_Hang_Ngay() {
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
        Can_nang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nhap_can_nang = new javax.swing.JTextField();
        nhap_chieu_cao = new javax.swing.JTextField();
        luu_thong_tin = new javax.swing.JButton();
        quay_lai = new javax.swing.JButton();
        hien_thi_bmi = new javax.swing.JLabel();
        Backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Can_nang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Can_nang.setForeground(new java.awt.Color(255, 255, 255));
        Can_nang.setText("Cân nặng");
        jPanel1.add(Can_nang);
        Can_nang.setBounds(220, 240, 90, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chiều cao");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 340, 100, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BMI");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 460, 40, 22);

        nhap_can_nang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nhap_can_nang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhap_can_nangActionPerformed(evt);
            }
        });
        jPanel1.add(nhap_can_nang);
        nhap_can_nang.setBounds(370, 230, 290, 40);

        nhap_chieu_cao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nhap_chieu_cao.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nhap_chieu_caoInputMethodTextChanged(evt);
            }
        });
        nhap_chieu_cao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhap_chieu_caoActionPerformed(evt);
            }
        });
        jPanel1.add(nhap_chieu_cao);
        nhap_chieu_cao.setBounds(370, 330, 290, 40);

        luu_thong_tin.setBackground(new java.awt.Color(255, 102, 0));
        luu_thong_tin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        luu_thong_tin.setText("Lưu thông tin");
        luu_thong_tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luu_thong_tinActionPerformed(evt);
            }
        });
        jPanel1.add(luu_thong_tin);
        luu_thong_tin.setBounds(730, 610, 140, 50);

        quay_lai.setBackground(new java.awt.Color(255, 102, 0));
        quay_lai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        quay_lai.setText("Quay lại");
        quay_lai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quay_laiActionPerformed(evt);
            }
        });
        jPanel1.add(quay_lai);
        quay_lai.setBounds(180, 615, 130, 50);

        hien_thi_bmi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hien_thi_bmi.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(hien_thi_bmi);
        hien_thi_bmi.setBounds(380, 450, 210, 40);

        Backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai_tap_lon/NHập thông tin hằng ngày.png"))); // NOI18N
        jPanel1.add(Backgroud);
        Backgroud.setBounds(0, 0, 940, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nhap_can_nangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhap_can_nangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhap_can_nangActionPerformed
    //lay time
    private String getTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }
    //lay bmi
    private String getBMI(){
        double can_nang=Double.valueOf(nhap_can_nang.getText());
        double chieu_cao=Double.valueOf(nhap_chieu_cao.getText());
        double bmi=(can_nang)/(chieu_cao * chieu_cao / 10000);
        return String.valueOf(bmi);
    }
    //lay the trang
    private String TheTrang(){
        Double bmi=Double.valueOf(this.getBMI());
        if(bmi>40) return "Béo phì độ III";
        else if(bmi>=35) return "Béo phì độ II";
        else if(bmi>=30) return "Béo phì độ I";
        else if(bmi>=25) return "Thừa cân";
        else if(bmi>=18.5) return "Bình thường";
        else if(bmi>=17) return "Gầy độ 1";
        else if(bmi>=16) return "Gầy độ 2";
        else return "Gầy độ 3";
    }
    
    //luu thong tin hang ngay
    private void luu_thong_tinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luu_thong_tinActionPerformed
        // TODO add your handling code here:
        int dk=JOptionPane.showConfirmDialog(this,"Bạn có muốn lưu thông tin","Đồng ý",JOptionPane.YES_NO_CANCEL_OPTION);
        if(dk!=JOptionPane.YES_OPTION) return;
        String s="";
        try {
            s = CSDL.ReadIDFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nhap_Thong_Tin_Hang_Ngay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Nhap_Thong_Tin_Hang_Ngay.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.println(s);
        if(CSDL.insert_into_nhap_thong_tin_hang_ngay(s, getTime(), nhap_can_nang.getText(), nhap_chieu_cao.getText(), getBMI(), TheTrang())){
            TrangChuUser trangchu=new TrangChuUser();
            trangchu.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Mời bạn nhập lại thông tin");
        }
    }//GEN-LAST:event_luu_thong_tinActionPerformed

    private void quay_laiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quay_laiActionPerformed
        // TODO add your handling code here:
        TrangChuUser trangchu=new TrangChuUser();
            trangchu.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_quay_laiActionPerformed

    private void nhap_chieu_caoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhap_chieu_caoActionPerformed
        // TODO add your handling code here:
        try{  
        hien_thi_bmi.setText(getBMI());  
        }catch(Exception ex){System.out.println(ex);}  
    }//GEN-LAST:event_nhap_chieu_caoActionPerformed

    private void nhap_chieu_caoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nhap_chieu_caoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_nhap_chieu_caoInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Hang_Ngay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Hang_Ngay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Hang_Ngay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nhap_Thong_Tin_Hang_Ngay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nhap_Thong_Tin_Hang_Ngay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgroud;
    private javax.swing.JLabel Can_nang;
    private javax.swing.JLabel hien_thi_bmi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton luu_thong_tin;
    private javax.swing.JTextField nhap_can_nang;
    private javax.swing.JTextField nhap_chieu_cao;
    private javax.swing.JButton quay_lai;
    // End of variables declaration//GEN-END:variables
}
