/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;

import static bai_tap_lon.CSDL.jdbcConnection;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.naming.directory.SearchResult;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class LSThemTrungTam extends javax.swing.JFrame {

    /**
     * Creates new form LSThemTrungTam
     */
    public LSThemTrungTam() {
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
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        Backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(50, 660, 70, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDAdmin", "IDTrungTam", "date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 260, 789, 370);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    To");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 180, 50, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("    From");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 180, 60, 40);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(790, 180, 70, 40);

        jDateChooser3.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooser3);
        jDateChooser3.setBounds(150, 180, 270, 40);

        jDateChooser4.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(jDateChooser4);
        jDateChooser4.setBounds(520, 180, 250, 40);

        Backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai_tap_lon/L???ch S??? c???p Nh???t L???i khuy??n.png"))); // NOI18N
        jPanel1.add(Backgroud);
        Backgroud.setBounds(0, 0, 940, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TrangChuAdmin tt = new TrangChuAdmin();
        tt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
     public boolean checkdate(String s1, String s2, String date){
        String[] tmp1 = s1.split("-");
        String[] tmp2 = s2.split("-");
        String[] tmp = date.split("-");
        if(Integer.valueOf(tmp1[2]) ==  Integer.valueOf(tmp2[2])){
            if(Integer.valueOf(tmp1[1]) == Integer.valueOf(tmp2[1])){
                if(Integer.valueOf(tmp1[0]) == Integer.valueOf(tmp2[0])){
                    return Integer.valueOf(tmp[0]) == Integer.valueOf(tmp1[0]) 
                            && Integer.valueOf(tmp[1]) == Integer.valueOf(tmp1[1])
                            && Integer.valueOf(tmp[2]) == Integer.valueOf(tmp1[2]);
                }
                return Integer.valueOf(tmp1[0]) <= Integer.valueOf(tmp[0]) && Integer.valueOf(tmp[0]) <= Integer.valueOf(tmp2[0])
                        && Integer.valueOf(tmp[1]) == Integer.valueOf(tmp1[1])
                        && Integer.valueOf(tmp[2]) == Integer.valueOf(tmp1[2]);
            }
            return Integer.valueOf(tmp1[0]) <= Integer.valueOf(tmp[0]) && Integer.valueOf(tmp[0]) <= Integer.valueOf(tmp2[0])
                    && Integer.valueOf(tmp1[1]) <= Integer.valueOf(tmp[1]) && Integer.valueOf(tmp[1]) <= Integer.valueOf(tmp2[1])
                    && Integer.valueOf(tmp[2]) == Integer.valueOf(tmp1[2]);
        }
        return Integer.valueOf(tmp1[0]) <= Integer.valueOf(tmp[0]) && Integer.valueOf(tmp[0]) <= Integer.valueOf(tmp2[0])
                    && Integer.valueOf(tmp1[1]) <= Integer.valueOf(tmp[1]) && Integer.valueOf(tmp[1]) <= Integer.valueOf(tmp2[1])
                    && Integer.valueOf(tmp1[2]) <= Integer.valueOf(tmp[2]) && Integer.valueOf(tmp[2]) <= Integer.valueOf(tmp2[2]);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tableModel;
        JButton btn = new JButton("Find");
        //        String x = "01-11-2021 21:46:51";
        //        x = x.substring(0, 10);
        //        System.out.println(x);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String s1 = df.format(jDateChooser3.getDate());
        System.out.println(s1);
        String s2 = df.format(jDateChooser4.getDate());
        System.out.println(s2);
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        try{
            Statement sta=(Statement) jdbcConnection().createStatement();
            String select="SELECT * FROM capnhattrungtam; ";
            ResultSet re=sta.executeQuery(select);
            while (re.next()) {
                String id=re.getString("IDAdmin");
                String idtt=re.getString("IDTrungTam");
                String[] date=re.getString("NgayCapNhat").split("\\s+");
                if (checkdate(s1, s2, date[0])){
                    tableModel.addRow(new Object[] {id, idtt, date[0]});
                }
//                                System.out.println(id+" "+idtt+" "+date);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LSThemTrungTam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LSThemTrungTam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LSThemTrungTam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LSThemTrungTam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LSThemTrungTam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgroud;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
