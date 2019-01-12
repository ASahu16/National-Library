/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package national.library.Student_main;

import Database.dbconnection;
import javax.swing.JOptionPane;
import national.library.login_activity;

/**
 *
 * @author SAHU
 */
public class StuSetting extends javax.swing.JFrame {

    public String stud_id;
    public String stud_password;

    /**
     * Creates new form StuSetting
     */
    public StuSetting() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 3, 42));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons8_Delete_20px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 22, 22));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(240, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 204)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(0, 3, 42));
        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 3, 42));
        jLabel25.setText("Current Password");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton15.setBackground(new java.awt.Color(240, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/296561-128.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 100, 50));

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 3, 42));
        jLabel54.setText("New Password");
        jLabel54.setToolTipText("");
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 3, 42));
        jLabel56.setText("New Password");
        jLabel56.setToolTipText("");
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPasswordField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 3, 42));
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jPanel6.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 200, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPasswordField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(0, 3, 42));
        jPasswordField2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, -1));

        jPasswordField3.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPasswordField3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPasswordField3.setForeground(new java.awt.Color(0, 3, 42));
        jPasswordField3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jPanel6.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 450, 380));

        jPanel5.setBackground(new java.awt.Color(240, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 204)), "Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 204, 204))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 3, 42));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 3, 42));
        jLabel24.setText("Student ID");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 3, 42));
        jTextField11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jTextField11.setOpaque(false);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 200, -1));

        jButton14.setBackground(new java.awt.Color(240, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/296561-128.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, 50));

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 3, 42));
        jLabel53.setText("Name");
        jLabel53.setToolTipText("");
        jPanel5.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jTextField38.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(0, 3, 42));
        jTextField38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jTextField38.setOpaque(false);
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 200, -1));

        jLabel26.setBackground(new java.awt.Color(0, 3, 42));
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 3, 42));
        jLabel26.setText("Email");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 3, 42));
        jLabel55.setText("Current Password");
        jLabel55.setToolTipText("");
        jPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jTextField39.setBackground(new java.awt.Color(255, 255, 255, 0));
        jTextField39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField39.setForeground(new java.awt.Color(0, 3, 42));
        jTextField39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jTextField39.setOpaque(false);
        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, -1));

        jPasswordField4.setBackground(new java.awt.Color(255, 255, 255, 0));
        jPasswordField4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPasswordField4.setForeground(new java.awt.Color(0, 3, 42));
        jPasswordField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 3, 42), new java.awt.Color(0, 3, 42)));
        jPanel5.add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 200, -1));

        jLabel4.setText("* Student ID cannot be Changed");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 420, 380));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STU_res/Home.png"))); // NOI18N
        jLabel17.setToolTipText("Go to Home");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, -1));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 56)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/STU_res/logout.png"))); // NOI18N
        jLabel19.setToolTipText("");
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 650, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 56)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 3, 42));
        jLabel18.setText("Settings");
        jLabel18.setToolTipText("");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG/Back-to-School-PPT-Backgrounds.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 738));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1366, 738));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        Student_front sf = new Student_front();
        sf.stud_id = stud_id;
        sf.stud_password = stud_password;

        sf.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        //      jLabel17.setBackground(new java.awt.Color(127, 255, 212, 100));

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        //    jLabel17.setBackground(new java.awt.Color(255, 255, 255, 100));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        login_activity la = new login_activity();
        la.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try {
            String old_pass = jPasswordField1.getText();
            String n1_pass = jPasswordField2.getText();
            String n2_pass = jPasswordField3.getText();
            if (!old_pass.equals("")) {
                if (!n1_pass.equals("") || !n2_pass.equals("")) {
                    if (old_pass.equals(stud_password)) {
                        if (n1_pass.equals(n2_pass)) {

                            dbconnection db = new dbconnection();
                            db.stmt = db.con.createStatement();
                            db.stmt.executeUpdate("UPDATE student SET password = '" + n1_pass + "' WHERE id = '" + stud_id + "' ");
                            JOptionPane.showMessageDialog(this, "Password Update Successful");
                            jPasswordField1.setText("");
                            jPasswordField2.setText("");
                            jPasswordField3.setText("");

                            db.con.close();
                            db.stmt.close();

                            JOptionPane.showMessageDialog(this, "Due to password change\n   Session expired   \n  Please Login Again");
                            login_activity l = new login_activity();
                            l.setVisible(true);
                            this.dispose();

                        } else {
                            JOptionPane.showMessageDialog(this, "Password Mismatch");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect Old Password");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Enter New Password");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Enter Old Password");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased

    }//GEN-LAST:event_jTextField11KeyReleased

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        try {
            String name = jTextField38.getText();
            String email = jTextField39.getText();
            String pass = jPasswordField4.getText();
            if (!email.equals("") && !name.equals("")) {
                if (pass.equals(this.stud_password)) {
                    dbconnection db = new dbconnection();
                    db.stmt = db.con.createStatement();
                    db.stmt.executeUpdate("UPDATE student SET name = '" + name + "', email = '" + email + "' WHERE id = '" + stud_id + "'");
                    JOptionPane.showMessageDialog(this, "Update Successfull");
                    jTextField38.setText("");
                    jTextField39.setText("");
                    jPasswordField4.setText("");
                    db.con.close();
                    db.stmt.close();
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect Password");
                }
            } else {
                JOptionPane.showMessageDialog(this, "All Fields are Mandatory");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

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
            java.util.logging.Logger.getLogger(StuSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StuSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StuSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StuSetting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StuSetting().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    public javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    // End of variables declaration//GEN-END:variables
}