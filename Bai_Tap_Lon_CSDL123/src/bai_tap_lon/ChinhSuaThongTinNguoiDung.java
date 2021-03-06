/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tungb
 */
public class ChinhSuaThongTinNguoiDung extends javax.swing.JFrame {

    private Vector<String> info;
    
    /**
     * Creates new form ChinhSuaThongTinNguoiDung
     */
    public ChinhSuaThongTinNguoiDung() throws IOException, ParseException, SQLException {
        setLocation(this.getHeight() + 200, this.getWidth());
        initComponents();
        setInfo();
    }

    
    private void setInfo() throws IOException, ParseException, SQLException {
        this.info = new Vector<>();
        info.addAll(CSDL.statement_hien_thi_thong_tin_nguoi_dung());
        this.hoDemEdit.setText(this.info.get(1));
        this.tenEdit.setText(this.info.get(2));
        Date date = new SimpleDateFormat("dd-MM-yyyy").parse(this.info.get(3));
        this.dobEdit.setDate(date);
        this.addressEdit.setText(this.info.get(4));
        this.phoneEdit.setText(this.info.get(5));
        
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
        ten = new javax.swing.JLabel();
        hoDem = new javax.swing.JLabel();
        ngaySinh = new javax.swing.JLabel();
        diaChi = new javax.swing.JLabel();
        sdt = new javax.swing.JLabel();
        hoDemEdit = new javax.swing.JTextField();
        addressEdit = new javax.swing.JTextField();
        phoneEdit = new javax.swing.JTextField();
        tenEdit = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        dobEdit = new com.toedter.calendar.JDateChooser();
        back = new javax.swing.JButton();
        Backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        ten.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ten.setForeground(new java.awt.Color(255, 255, 255));
        ten.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ten.setText("T??n");
        jPanel1.add(ten);
        ten.setBounds(90, 280, 110, 33);

        hoDem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hoDem.setForeground(new java.awt.Color(255, 255, 255));
        hoDem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hoDem.setText("H??? ?????m");
        jPanel1.add(hoDem);
        hoDem.setBounds(90, 220, 110, 33);

        ngaySinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ngaySinh.setForeground(new java.awt.Color(255, 255, 255));
        ngaySinh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ngaySinh.setText("Ng??y Sinh");
        jPanel1.add(ngaySinh);
        ngaySinh.setBounds(90, 350, 110, 33);

        diaChi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        diaChi.setForeground(new java.awt.Color(255, 255, 255));
        diaChi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        diaChi.setText("?????a Ch???");
        jPanel1.add(diaChi);
        diaChi.setBounds(90, 410, 110, 33);

        sdt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sdt.setForeground(new java.awt.Color(255, 255, 255));
        sdt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sdt.setText("S??? ??i???n Tho???i");
        jPanel1.add(sdt);
        sdt.setBounds(90, 480, 110, 33);

        hoDemEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hoDemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoDemEditActionPerformed(evt);
            }
        });
        jPanel1.add(hoDemEdit);
        hoDemEdit.setBounds(230, 220, 625, 33);

        addressEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(addressEdit);
        addressEdit.setBounds(230, 410, 625, 33);

        phoneEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(phoneEdit);
        phoneEdit.setBounds(230, 480, 625, 33);

        tenEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(tenEdit);
        tenEdit.setBounds(230, 280, 625, 33);

        save.setBackground(new java.awt.Color(230, 94, 48));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("L??u Th??ng Tin");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(740, 630, 120, 41);

        dobEdit.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(dobEdit);
        dobEdit.setBounds(230, 350, 625, 33);

        back.setBackground(new java.awt.Color(255, 102, 0));
        back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back.setText("Back");
        back.setMaximumSize(new java.awt.Dimension(72, 33));
        back.setMinimumSize(new java.awt.Dimension(72, 33));
        back.setPreferredSize(new java.awt.Dimension(72, 33));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(60, 640, 80, 30);

        Backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai_tap_lon/Th??ng tin c???a b???n.png"))); // NOI18N
        jPanel1.add(Backgroud);
        Backgroud.setBounds(0, 0, 940, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hoDemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoDemEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoDemEditActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            // TODO add your handling code here:
            String hodem = this.hoDemEdit.getText();
            String ten = this.tenEdit.getText();
            Date dob = this.dobEdit.getDate();
            String pattern = "dd-MM-yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(dob);
            String address = this.addressEdit.getText();
            String phone = this.phoneEdit.getText();
//            System.out.println(hodem+" "+ten+" "+dob+" "+address+" "+phone );
            CSDL.statement_sua_thong_tin_nguoi_dung(hodem, ten, date, address, phone);
        } catch (IOException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            HienThiThongTinNguoiDung te = new HienThiThongTinNguoiDung();
            te.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        try {
            // TODO add your handling code here:
            HienThiThongTinNguoiDung te = new HienThiThongTinNguoiDung();
            te.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChinhSuaThongTinNguoiDung().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ChinhSuaThongTinNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgroud;
    private javax.swing.JTextField addressEdit;
    private javax.swing.JButton back;
    private javax.swing.JLabel diaChi;
    private com.toedter.calendar.JDateChooser dobEdit;
    private javax.swing.JLabel hoDem;
    private javax.swing.JTextField hoDemEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel ngaySinh;
    private javax.swing.JTextField phoneEdit;
    private javax.swing.JButton save;
    private javax.swing.JLabel sdt;
    private javax.swing.JLabel ten;
    private javax.swing.JTextField tenEdit;
    // End of variables declaration//GEN-END:variables
}
