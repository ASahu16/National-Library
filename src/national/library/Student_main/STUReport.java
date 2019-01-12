/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package national.library.Student_main;

import Database.dbconnection;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import national.library.login_activity;

/**
 *
 * @author SAHU
 */
public class STUReport extends javax.swing.JFrame {

    public String stud_id;
    public String stud_password;

    /**
     * Creates new form STUReport
     */
    public STUReport() {
        initComponents();
        BookInformation.setVisible(true);
        TranscationHistory.setVisible(false);

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
        BookInformation = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        TranscationHistory = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
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

        BookInformation.setBackground(new java.awt.Color(0, 204, 204));
        BookInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Infomation Report", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(126, 196, 198))); // NOI18N
        BookInformation.setOpaque(false);
        BookInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 3, 42));
        jLabel47.setText("ISBN No.");
        jLabel47.setToolTipText("");
        BookInformation.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 3, 42));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 3, 42)));
        jTextField13.setOpaque(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        BookInformation.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 40));

        jButton16.setBackground(new java.awt.Color(204, 240, 230));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton16.setText("Generate By ISBN");
        jButton16.setToolTipText("");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        BookInformation.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 40));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 3, 42));
        jLabel48.setText("Bookshelf");
        jLabel48.setToolTipText("");
        BookInformation.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextField14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(0, 3, 42));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 3, 42)));
        jTextField14.setOpaque(false);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        BookInformation.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 40));

        jButton17.setBackground(new java.awt.Color(204, 240, 230));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton17.setText("Generate By Bookshelf");
        jButton17.setToolTipText("");
        jButton17.setBorder(null);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        BookInformation.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 170, 40));

        jButton18.setBackground(new java.awt.Color(204, 240, 230));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton18.setText("Generate All Book Information");
        jButton18.setToolTipText("");
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        BookInformation.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 690, 40));
        BookInformation.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 10));

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(126, 196, 198), 1, true));

        jTable8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(126, 196, 198), 1, true));
        jTable8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Accession ", "Book Title", "Author Name", "Edition", "Bookshelf No.", "Row", "Column", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setGridColor(new java.awt.Color(0, 255, 255));
        jTable8.setSelectionBackground(new java.awt.Color(240, 255, 255));
        jTable8.setSelectionForeground(new java.awt.Color(0, 3, 42));
        jScrollPane8.setViewportView(jTable8);

        BookInformation.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 740, 330));

        jPanel2.add(BookInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 990, 470));

        TranscationHistory.setBackground(new java.awt.Color(0, 204, 204));
        TranscationHistory.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaction History Report", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(126, 196, 198))); // NOI18N
        TranscationHistory.setOpaque(false);
        TranscationHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 3, 42));
        jLabel49.setText("Transaction From :");
        jLabel49.setToolTipText("");
        TranscationHistory.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 3, 42));
        jLabel50.setText("Transaction To :");
        jLabel50.setToolTipText("");
        TranscationHistory.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(126, 196, 198), 1, true));

        jTable7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(126, 196, 198), 1, true));
        jTable7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " ID", "Name", "Accession No.", "ISBN No.", "Date", "Transaction Type", "Late Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setGridColor(new java.awt.Color(0, 255, 255));
        jTable7.setSelectionBackground(new java.awt.Color(240, 255, 255));
        jTable7.setSelectionForeground(new java.awt.Color(0, 3, 42));
        jScrollPane7.setViewportView(jTable7);

        TranscationHistory.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 950, 340));

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TranscationHistory.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 180, 30));

        jDateChooser2.setDateFormatString("dd/MM/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TranscationHistory.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 180, 30));

        jButton4.setText("GET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        TranscationHistory.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jPanel2.add(TranscationHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 990, 470));

        jLabel28.setBackground(new java.awt.Color(126, 196, 198));
        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 3, 42));
        jLabel28.setText("   Generate : ");
        jLabel28.setToolTipText("");
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 30));

        jLabel24.setBackground(new java.awt.Color(204, 240, 230));
        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 3, 42));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Book Information ");
        jLabel24.setToolTipText("");
        jLabel24.setOpaque(true);
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 320, 200, 30));

        jLabel25.setBackground(new java.awt.Color(204, 240, 230));
        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 3, 42));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Transaction History ");
        jLabel25.setToolTipText("");
        jLabel25.setOpaque(true);
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 380, 200, 30));

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
        jLabel18.setText("Generate Report");
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

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        BookInformation.setVisible(true);
        TranscationHistory.setVisible(false);
        jTextField13.setText("");
        jTextField14.setText("");
        DefaultTableModel t = (DefaultTableModel) jTable8.getModel();
        t.getDataVector().removeAllElements();
        t.setRowCount(0);
        jTable8.setRowHeight(25);

    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setFont(new Font("Dialog", Font.PLAIN, 20));
        jLabel24.setBackground(new Color(127, 255, 212));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setBackground(new Color(205, 240, 230));
        jLabel24.setFont(new Font("Dialog", Font.PLAIN, 18));
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        try {
            BookInformation.setVisible(false);
            TranscationHistory.setVisible(true);
            jDateChooser1.setDate(null);
            jDateChooser2.setDate(null);

            String stu_id;
            String stu_name;
            String accession;
            String isbn;
            String date;
            String type;
            String latefee;

            dbconnection db = new dbconnection();
            db.stmt = db.con.createStatement();
            db.rst = db.stmt.executeQuery("SELECT * from transaction_history WHERE stu_id='" + this.stud_id + "'");

            DefaultTableModel t = (DefaultTableModel) jTable7.getModel();
            t.getDataVector().removeAllElements();
            jTable7.setRowHeight(25);
            while (db.rst.next()) {

                stu_id = db.rst.getString(1);
                stu_name = db.rst.getString(2);
                accession = db.rst.getString(3);
                isbn = db.rst.getString(4);
                date = db.rst.getString(5);
                type = db.rst.getString(6);
                latefee = db.rst.getString(7);
                Object content[] = {stu_id, stu_name, accession, isbn, date, type, latefee};
                t.addRow(content);

            }

            db.con.close();
            db.stmt.close();
            db.rst.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        jLabel25.setBackground(new Color(127, 255, 212));
        jLabel25.setFont(new Font("Dialog", Font.PLAIN, 20));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        jLabel25.setBackground(new Color(205, 240, 230));
        jLabel25.setFont(new Font("Dialog", Font.PLAIN, 18));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseExited

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

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            int c = 0;
            String accession;
            String cl_accession;
            String isbn = jTextField13.getText();
            String book_title;
            String authorname;
            String edition;
            String bookshelf;
            String b_row;
            String b_column;
            String availability;
            String borrowed_time;

            String Query = "SELECT * FROM book_collection where isbn='" + isbn + "'";

            dbconnection db = new dbconnection();
            db.stmt = db.con.createStatement();
            db.rst = db.stmt.executeQuery(Query);
            DefaultTableModel t = (DefaultTableModel) jTable8.getModel();
            t.getDataVector().removeAllElements();
            jTable8.setRowHeight(25);
            while (db.rst.next()) {

                accession = db.rst.getString(1);
                cl_accession = db.rst.getString(2);
                isbn = db.rst.getString(3);
                book_title = db.rst.getString(4);
                authorname = db.rst.getString(5);
                edition = db.rst.getString(6);
                bookshelf = db.rst.getString(7);
                b_row = db.rst.getString(8);
                b_column = db.rst.getString(9);
                availability = db.rst.getString(10);
                borrowed_time = db.rst.getString(11);

                Object content[] = {accession, book_title, authorname, edition, bookshelf, b_row, b_column, availability};
                t.addRow(content);
                c = 1;
            }
            if (c == 0) {
                JOptionPane.showMessageDialog(this, "ISBN Number not Found");
            }

            db.con.close();
            db.stmt.close();
            db.rst.close();

        } catch (Exception e) {
            e.getMessage();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            int c = 0;
            String accession;
            String cl_accession;
            String isbn;
            String book_title;
            String authorname;
            String edition;
            String bookshelf = jTextField14.getText();
            String b_row;
            String b_column;
            String availability;
            String borrowed_time;

            String Query = "SELECT * FROM book_collection where bookshelf='" + bookshelf + "'";

            dbconnection db = new dbconnection();
            db.stmt = db.con.createStatement();
            db.rst = db.stmt.executeQuery(Query);
            DefaultTableModel t = (DefaultTableModel) jTable8.getModel();
            t.getDataVector().removeAllElements();
            jTable8.setRowHeight(25);
            while (db.rst.next()) {

                accession = db.rst.getString(1);
                cl_accession = db.rst.getString(2);
                isbn = db.rst.getString(3);
                book_title = db.rst.getString(4);
                authorname = db.rst.getString(5);
                edition = db.rst.getString(6);
                bookshelf = db.rst.getString(7);
                b_row = db.rst.getString(8);
                b_column = db.rst.getString(9);
                availability = db.rst.getString(10);
                borrowed_time = db.rst.getString(11);

                Object content[] = {accession, book_title, authorname, edition, bookshelf, b_row, b_column, availability};
                t.addRow(content);
                c = 1;
            }
            if (c == 0) {
                JOptionPane.showMessageDialog(this, "Invalid Bookshelf");
            }

            db.con.close();
            db.stmt.close();
            db.rst.close();

        } catch (Exception e) {
            e.getMessage();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            String accession;
            String cl_accession;
            String isbn;
            String book_title;
            String authorname;
            String edition;
            String bookshelf;
            String b_row;
            String b_column;
            String availability;
            String borrowed_time;

            String Query = "SELECT * FROM book_collection";

            dbconnection db = new dbconnection();
            db.stmt = db.con.createStatement();
            db.rst = db.stmt.executeQuery(Query);
            DefaultTableModel t = (DefaultTableModel) jTable8.getModel();
            t.getDataVector().removeAllElements();
            jTable8.setRowHeight(25);
            while (db.rst.next()) {

                accession = db.rst.getString(1);
                cl_accession = db.rst.getString(2);
                isbn = db.rst.getString(3);
                book_title = db.rst.getString(4);
                authorname = db.rst.getString(5);
                edition = db.rst.getString(6);
                bookshelf = db.rst.getString(7);
                b_row = db.rst.getString(8);
                b_column = db.rst.getString(9);
                availability = db.rst.getString(10);
                borrowed_time = db.rst.getString(11);

                Object content[] = {accession, book_title, authorname, edition, bookshelf, b_row, b_column, availability};
                t.addRow(content);
            }

            db.con.close();
            db.stmt.close();
            db.rst.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = jDateChooser1.getDate();
        Date d2 = jDateChooser2.getDate();

        try {

            String stu_id;
            String stu_name;
            String accession;
            String isbn;
            String db_date;
            String type;
            String latefee;

            dbconnection db = new dbconnection();
            db.stmt = db.con.createStatement();
            db.rst = db.stmt.executeQuery("SELECT * from transaction_history WHERE stu_id='" + this.stud_id + "'");

            DefaultTableModel t = (DefaultTableModel) jTable7.getModel();
            t.getDataVector().removeAllElements();
            jTable7.setRowHeight(25);
            while (db.rst.next()) {

                stu_id = db.rst.getString(1);
                stu_name = db.rst.getString(2);
                accession = db.rst.getString(3);
                isbn = db.rst.getString(4);
                db_date = db.rst.getString(5);
                type = db.rst.getString(6);
                latefee = db.rst.getString(7);

                Date ret_date = new SimpleDateFormat("dd/MM/yyyy").parse(db_date);

                if (ret_date.after(d1) && ret_date.before(d2)) {

                    Object content[] = {stu_id, stu_name, accession, isbn, db_date, type, latefee};
                    t.addRow(content);
                }
            }

            db.con.close();
            db.stmt.close();
            db.rst.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(STUReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STUReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STUReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STUReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STUReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BookInformation;
    private javax.swing.JPanel TranscationHistory;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    // End of variables declaration//GEN-END:variables
}
