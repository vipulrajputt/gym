/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Vipul Rajput
 */
public class startgym extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();
    public startgym() {
        initComponents();
        slideshow();
    }
        public void slideshow()
    {
        new Thread()
        {   
            int count=0,i=0;
            @Override
            public void run()
            {
                try
                {
                while(i==0)
                    {
                        switch(count)
                        {
                            case 0:
                                ImageIcon ii=new ImageIcon(getClass().getResource("/gym/image/1.jpg"));
                                ImageIcon ii1=new ImageIcon(getClass().getResource("/gym/image/2.jpg"));
                                slide1.setIcon(ii1);
                                slide.setIcon(ii);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1024, 0, 20, 8, slide1);
                                ac.jLabelXLeft(0, -1024, 20, 8, slide);
                                
                                count=1;
                                break;
                            case 1:
                                ii1=new ImageIcon(getClass().getResource("/gym/image/2.jpg"));
                                slide1.setIcon(ii1);
                                Thread.sleep(7000);
                                ac.jLabelXRight(0, 1024, 20, 8, slide1);
                                ac.jLabelXRight(-1024,0, 20, 8, slide);
                                                                
                                count=2;
                                break;
                            case 2:
                                ImageIcon ii2=new ImageIcon(getClass().getResource("/gym/image/3.jpg"));
                                slide.setIcon(ii2);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1024, 0, 20, 8, slide1);
                                ac.jLabelXLeft(0, -1024, 20, 8, slide);
                              
                                count=3;
                                break;
                            case 3:
                                ImageIcon ii3=new ImageIcon(getClass().getResource("/gym/image/4.jpg"));
                                slide1.setIcon(ii3);
                                Thread.sleep(7000);
                                ac.jLabelXRight(0, 1024, 20, 8, slide1);
                                ac.jLabelXRight(-1024,0, 20, 8, slide);
                                
                                
                                count=4;
                                break;
                            case 4:
                                ImageIcon ii4=new ImageIcon(getClass().getResource("/gym/image/5.jpg"));
                                slide.setIcon(ii4);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1024, 0, 20, 8, slide1);
                                ac.jLabelXLeft(0, -1024, 20, 8, slide);
                                
                                
                                count=5;
                               
                                break;
                            case 5:
                                 ImageIcon ii5=new ImageIcon(getClass().getResource("/gym/image/6.jpg"));
                                slide1.setIcon(ii5);
                                Thread.sleep(7000);
                                ac.jLabelXRight(0, 1024, 20, 8, slide1);
                                ac.jLabelXRight(-1024,0, 20, 8, slide);
                                
                                
                                count=6;
                                break;
                            case 6:
                                 ImageIcon ii6=new ImageIcon(getClass().getResource("/gym/image/7.jpg"));
                                slide.setIcon(ii6);
                                Thread.sleep(7000);
                                ac.jLabelXLeft(1024, 0, 20, 8, slide1);
                                ac.jLabelXLeft(0, -1024, 20, 8, slide);
                                
                                count=7; 
                                break;
                               case 7:
                                ImageIcon ii7=new ImageIcon(getClass().getResource("/gym/image/8.jpg"));
                                slide1.setIcon(ii7);
                                Thread.sleep(7000);                                
                            

                                ac.jLabelXRight(0, 1024, 20, 8, slide1);
                                ac.jLabelXRight(-1024,0, 20, 8, slide);
                                
                                
                                count=0;
                                break;
                             
                              
                             }
                    }
                }catch(Exception e){}
            }
        
        }.start();
    }@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        aboutus = new javax.swing.JButton();
        offer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        contactus = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        order = new javax.swing.JButton();
        slide = new javax.swing.JLabel();
        slide1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 720));
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

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/image/nextstep.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 190);

        aboutus.setBackground(new java.awt.Color(255, 153, 0));
        aboutus.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        aboutus.setForeground(new java.awt.Color(255, 0, 0));
        aboutus.setText("ABOUT US");
        aboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutusMouseExited(evt);
            }
        });
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });
        jPanel1.add(aboutus);
        aboutus.setBounds(0, 370, 260, 60);

        offer.setBackground(new java.awt.Color(255, 153, 0));
        offer.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        offer.setForeground(new java.awt.Color(255, 0, 0));
        offer.setText("OFFERS");
        offer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        offer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                offerMouseExited(evt);
            }
        });
        offer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offerActionPerformed(evt);
            }
        });
        jPanel1.add(offer);
        offer.setBounds(260, 370, 260, 60);

        jScrollPane1.setOpaque(false);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(0, 0, 0));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setLineWrap(true);
        text.setRows(5);
        text.setText("\t               WELCOME\n\t                   TO \n\t      NEXT STEP FITNESS CLUB\n");
        text.setToolTipText("");
        text.setWrapStyleWord(true);
        text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 51, 51), null, new java.awt.Color(255, 255, 153)));
        text.setCaretColor(new java.awt.Color(255, 255, 255));
        text.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(text);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 430, 620, 220);

        contactus.setBackground(new java.awt.Color(255, 153, 0));
        contactus.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        contactus.setForeground(new java.awt.Color(255, 0, 0));
        contactus.setText("CONTACT US");
        contactus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contactusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contactusMouseExited(evt);
            }
        });
        contactus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusActionPerformed(evt);
            }
        });
        jPanel1.add(contactus);
        contactus.setBounds(520, 370, 270, 60);

        admin.setBackground(new java.awt.Color(255, 153, 0));
        admin.setFont(new java.awt.Font("Death Hector", 2, 18)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 0, 0));
        admin.setText("ADMIN");
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin);
        admin.setBounds(790, 370, 230, 60);

        order.setBackground(new java.awt.Color(255, 153, 0));
        order.setFont(new java.awt.Font("Death Hector", 3, 36)); // NOI18N
        order.setForeground(new java.awt.Color(255, 0, 0));
        order.setText("EXERCISE DESCRIPTION");
        order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                orderMouseExited(evt);
            }
        });
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        jPanel1.add(order);
        order.setBounds(0, 650, 1030, 70);

        slide.setMaximumSize(new java.awt.Dimension(1024, 720));
        slide.setMinimumSize(new java.awt.Dimension(1024, 720));
        slide.setPreferredSize(new java.awt.Dimension(1024, 720));
        slide.setRequestFocusEnabled(false);
        jPanel1.add(slide);
        slide.setBounds(0, 0, 1024, 720);

        slide1.setMaximumSize(new java.awt.Dimension(1024, 720));
        slide1.setMinimumSize(new java.awt.Dimension(1024, 720));
        slide1.setPreferredSize(new java.awt.Dimension(1024, 720));
        jPanel1.add(slide1);
        slide1.setBounds(1024, 0, 1024, 720);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1024, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setState(startgym.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void aboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseEntered
        aboutus.setBackground(new Color(255,255,0));
    }//GEN-LAST:event_aboutusMouseEntered

    private void aboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutusMouseExited
        aboutus.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_aboutusMouseExited

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        text.setText("At THE GYM, our mission is to provide you with the ultimate fitness experience, one that focuses on your specific fitness needs, helps you achieve the results you are after and invigorates your soul. We guarantee the highest quality equipment and training programs available, an expert staff, special amenities that are often not found in other health clubs, attentive service and truly sophisticated surroundings. Our every Fitness training center is committed to being a unique Fitness training center in india.");
    }//GEN-LAST:event_aboutusActionPerformed

    private void offerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerMouseEntered
        offer.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_offerMouseEntered

    private void offerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offerMouseExited
        offer.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_offerMouseExited

    private void offerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offerActionPerformed
        text.setText("\n 1.10% OFF ON 3 MONTH ADVANCE FEE.\n2.20% OFF ON 6 MONTH ADVANCE FEE.\n3.30% OFF ON 12 MONTH ADVANCE FEE.");
    }//GEN-LAST:event_offerActionPerformed

    private void contactusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusMouseEntered
        contactus.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_contactusMouseEntered

    private void contactusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactusMouseExited
        contactus.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_contactusMouseExited

    private void contactusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusActionPerformed
        text.setText("For More Queries : \n contact : PRADEEP DHAWAN.\n            KARAN SINGH.\n            9999459774\n            9773722925");
    }//GEN-LAST:event_contactusActionPerformed

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        admin.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        admin.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseExited

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        setVisible(false);
      new admin_1().setVisible(true);        
    }//GEN-LAST:event_adminActionPerformed

    private void orderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseEntered
         order.setBackground(new Color(255,255,0));        // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseEntered

    private void orderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMouseExited
        order.setBackground(new Color(255,153,0));        // TODO add your handling code here:
    }//GEN-LAST:event_orderMouseExited

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        setVisible(false);
        new exercise().setVisible(true);
        
    }//GEN-LAST:event_orderActionPerformed

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
            java.util.logging.Logger.getLogger(startgym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startgym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startgym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startgym.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startgym().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus;
    private javax.swing.JButton admin;
    private javax.swing.JButton contactus;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton offer;
    private javax.swing.JButton order;
    private javax.swing.JLabel slide;
    private javax.swing.JLabel slide1;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
