/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vipul Rajput
 */
public class updation extends javax.swing.JFrame {

    Connection con;
        Statement st;
    public updation() throws ClassNotFoundException {
        initComponents();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","1234");
            st= con.createStatement();
            
        
        } catch (SQLException ex) {
              System.out.println("connectivity failed");
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.setLayout(null);

        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(900, 0, 40, 40);

        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(970, 0, 40, 40);

        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 240, 190);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/image/nextstep.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 194);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID         :");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 300, 220, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DUE DATE  :");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 420, 220, 40);

        t3.setBackground(new java.awt.Color(102, 102, 102));
        t3.setForeground(new java.awt.Color(255, 102, 0));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3);
        t3.setBounds(450, 300, 220, 40);

        t5.setBackground(new java.awt.Color(102, 102, 102));
        t5.setForeground(new java.awt.Color(255, 102, 0));
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5);
        t5.setBounds(450, 420, 220, 40);

        back.setBackground(new java.awt.Color(255, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 102, 0));
        back.setText("BACK");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(470, 620, 120, 40);

        submit.setBackground(new java.awt.Color(255, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 102, 0));
        submit.setText("SUBMIT");
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(300, 620, 130, 40);

        jLabel8.setForeground(new java.awt.Color(255, 103, 0));
        jLabel8.setText("(YYYY-MM-DD)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(680, 440, 90, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setState(startgym.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new startgym().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        int ph=Integer.parseInt(t3.getText());
        String d2=t5.getText();
        int i;
        try {
            i = st.executeUpdate("UPDATE records SET dues = '"+d2+"' WHERE `id` = "+ph+"");
            if(i>0)
            JOptionPane.showMessageDialog(null, "RECORD UPDATED!!!!", "CONGRATULATION", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(updation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(updation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new updation().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(updation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
