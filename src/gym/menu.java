package gym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vipul Rajput
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        newrecord = new javax.swing.JButton();
        checking = new javax.swing.JButton();
        updation = new javax.swing.JButton();
        display = new javax.swing.JButton();
        checking1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 240, 190);

        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(970, 0, 40, 40);

        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(900, 0, 40, 40);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/image/nextstep.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 194);

        jScrollPane1.setEnabled(false);
        jScrollPane1.setWheelScrollingEnabled(false);

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(4);
        jTextArea1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("          WELCOME\n                  TO\n       ADMIN PANEL");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 220, 520, 240);

        newrecord.setBackground(new java.awt.Color(255, 51, 0));
        newrecord.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        newrecord.setForeground(new java.awt.Color(255, 204, 0));
        newrecord.setText("NEW RECORD");
        newrecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newrecordActionPerformed(evt);
            }
        });
        jPanel1.add(newrecord);
        newrecord.setBounds(0, 490, 270, 70);

        checking.setBackground(new java.awt.Color(255, 51, 0));
        checking.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checking.setForeground(new java.awt.Color(255, 204, 0));
        checking.setText("BIRTHDAYS!!");
        checking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingActionPerformed(evt);
            }
        });
        jPanel1.add(checking);
        checking.setBounds(260, 610, 510, 100);

        updation.setBackground(new java.awt.Color(255, 51, 0));
        updation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        updation.setForeground(new java.awt.Color(255, 204, 0));
        updation.setText("UPDATION OF FEE");
        updation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updationActionPerformed(evt);
            }
        });
        jPanel1.add(updation);
        updation.setBounds(520, 490, 240, 70);

        display.setBackground(new java.awt.Color(255, 51, 0));
        display.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 204, 0));
        display.setText("DISPLAY RECORDS");
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display);
        display.setBounds(760, 490, 260, 70);

        checking1.setBackground(new java.awt.Color(255, 51, 0));
        checking1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        checking1.setForeground(new java.awt.Color(255, 204, 0));
        checking1.setText("CHECK FOR DUES");
        checking1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checking1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checking1ActionPerformed(evt);
            }
        });
        jPanel1.add(checking1);
        checking1.setBounds(270, 490, 250, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new startgym().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(startgym.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void newrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newrecordActionPerformed
        setVisible(false);
        try {
            new newrecord().setVisible(true);// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newrecordActionPerformed

    private void checkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingActionPerformed
              setVisible(false);
        try {
            new birthday().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkingActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        setVisible(false);
        try {
            new display().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_displayActionPerformed

    private void updationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updationActionPerformed
        setVisible(false);
        try {
            new updation().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updationActionPerformed

    private void checking1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checking1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try {
            new checking().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checking1ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checking;
    private javax.swing.JButton checking1;
    private javax.swing.JButton display;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton newrecord;
    private javax.swing.JButton updation;
    // End of variables declaration//GEN-END:variables


}
