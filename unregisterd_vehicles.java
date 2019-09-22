/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad_viva;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.BalloonTip.AttachLocation;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Inspiron 15
 */
public class unregisterd_vehicles extends javax.swing.JInternalFrame {

    /**
     * Creates new form unregisterd_vehicles
     */
    public unregisterd_vehicles() {

        initComponents();
        vehicletype();
        condition();
        enginetype();
        trnsmission();
        brand();
        count();                                            
            
        jProgressBar1.setVisible(false);
    }
    static String path = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 20));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Brand Name                 -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 177, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Model                            -");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 177, 40));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Model Year                   -");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, 177, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Price  (Rs)                      -");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 177, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Condition                      -");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, 177, 40));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Engine Type                  -");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, 177, 50));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Transmission                -");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 292, 177, 30));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Millage (Km)                 -");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 369, 177, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 170, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 170, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Condition" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Engine Type" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 170, 30));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Transmission" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 170, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 170, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 170, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 160, 30));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 160, 26));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 85, 170, 38));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 410, 20));

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 410, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle Type" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 170, -1));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 424, 410, 190));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 170, 30));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Chassis Number           -");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 177, -1));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 170, 30));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 170, 30));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 170, 30));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 170, 30));
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/database_server.png"))); // NOI18N
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 446, 40, -1));
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 170, 30));

        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)), "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 180, 400));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Vehicle Type                 -");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 190, 40));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/document-text-image.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 494, 30, 40));

        jButton8.setBackground(new java.awt.Color(255, 255, 153));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delivery.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 40, 30));

        jButton9.setBackground(new java.awt.Color(255, 255, 153));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Taxi.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 40, 30));

        jButton7.setBackground(new java.awt.Color(255, 255, 153));
        jButton7.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton7.setText("Add Data");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 150, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton3.setText("  Vehicle Summery");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 150, 50));

        jLabel32.setFont(new java.awt.Font("DigifaceWide", 1, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 0));
        jLabel32.setText("    ");
        jLabel32.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 150, 100));
        jPanel1.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 670));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow-repeat-once.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 40, 40));

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel27.setText("Chassis Number");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 116, 90, 20));

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel26.setText("Brand Name");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 70, -1));

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel25.setText("Model Name");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 70, 30));

        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 140, 30));

        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 140, 30));

        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 140, 30));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Trash.gif"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow-circle-double.png"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 30, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 160, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 160, 30));

        jButton6.setBackground(new java.awt.Color(255, 255, 153));
        jButton6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton6.setText("Update");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 160, 30));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 9));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 460, 160));

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Type", "Chassis Number", "Brand Name", "Model", "Model Year", "Condition", "Engine Type", "Transmission", "Price (Rs)", "Millage (Km)", "Image"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(102, 102, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 460, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser f = new JFileChooser();
        f.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fil = new FileNameExtensionFilter("*.IMAGE", "jpeg");
        f.addChoosableFileFilter(fil);
        int r = f.showSaveDialog(null);
        if (r == f.APPROVE_OPTION) {
            File file = f.getSelectedFile();
            path = file.getAbsolutePath();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i <= 100; i++) {
                        jProgressBar1.setValue(i);
                        jProgressBar1.setVisible(true);

                        try {
                            Thread.sleep(20);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    jLabel15.setIcon(new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_SMOOTH)));
                    jProgressBar1.setVisible(false);
                }
            }).start();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        jTextField4.setVisible(false);
        jTextField6.setVisible(false);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        
          jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String rp = path.replace('\\', '/');
            Jdbc.setData("INSERT INTO unregisterd_vehicles VALUES('" + jComboBox1.getSelectedItem() + "','" + jTextField1.getText() + "','" + jComboBox2.getSelectedItem() + "','" + jComboBox3.getSelectedItem() + "','" + dateChooserCombo1.getText().toString() + "','" + jComboBox4.getSelectedItem() + "','" + jComboBox5.getSelectedItem() + "','" + jComboBox6.getSelectedItem() + "','" + jTextField2.getText() + "','" + jTextField3.getText() + "','" + rp + "')");
            JOptionPane.showMessageDialog(null, "Data is Save to Database !");
        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
           BTip.viewToolTip(jTextField1, "This Chassis Number Already Saved !");

        } catch (java.sql.SQLException e) {
           BTip.viewToolTip(jTextField3, "Fill all data Correctly Before Add Data");

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
         jComboBox3.removeAllItems();
        try {
            ResultSet rs = Jdbc.getData("select model_name from add_model where brand_name LIKE '%" + jComboBox2.getSelectedItem().toString() + "%'");
            while (rs.next()) {
                jComboBox3.addItem(rs.getString("model_name"));
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {

            int row = jTable1.getSelectedRow();
            if (row != -1) {

                Jdbc.setData("delete from unregisterd_vehicles where un_chassis_number ='" + jTable1.getValueAt(row, 1).toString() + "' ");

                JOptionPane.showMessageDialog(null, "Deleted");
                dtm.removeRow(row);
            } else {
               JOptionPane.showMessageDialog(null, "Please First Select Row From a Table");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Jdbc.getData("SELECT * FROM unregisterd_vehicles WHERE brand like'" + jTextField5.getText() + "%" + "'");
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField5KeyReleased
String imgp;
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jLabel11.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jLabel12.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jLabel13.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jLabel16.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jLabel17.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jLabel18.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jLabel19.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        jLabel20.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
        jLabel21.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
        jLabel22.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString());

        String n = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
        String x = n.replace('/', '\\');
        imgp=x;

        if (new File(n).exists()) {
            jLabel15.setIcon(new ImageIcon(new ImageIcon(x).getImage().getScaledInstance(jLabel15.getWidth(), jLabel15.getHeight(), Image.SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Image not Found Please Insert New Image Or Update Image");
        }


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Jdbc.getData("SELECT * FROM unregisterd_vehicles WHERE un_chassis_number='" + jTextField6.getText() + "'");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Jdbc.getData("SELECT * FROM unregisterd_vehicles WHERE model like'" + jTextField4.getText() + "%" + "'");
            while (rs.next()) {

                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                v.add(rs.getString(8));
                v.add(rs.getString(9));
                v.add(rs.getString(10));
                v.add(rs.getString(11));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      new add_brand().setVisible(true);
              
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       new add_model().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
   
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String path1 ="F:\\Diploma Level -1\\SAD\\Viva Project\\Reports\\Unregisterd_vehicle.jrxml";
        
        try {
            Map parms = new HashMap();
            parms.put("cha", jLabel12.getText());//definetly key is unic.
            parms.put("vt", jLabel11.getText());
            parms.put("bn", jLabel13.getText());
            parms.put("mo", jLabel16.getText());
            parms.put("my", jLabel17.getText());
            parms.put("co", jLabel18.getText());
            parms.put("et",jLabel19.getText());
            parms.put("tm", jLabel20.getText());
            parms.put("pr", jLabel21.getText());
            parms.put("ml", jLabel22.getText());
           parms.put("img",imgp);
           
            
            
            JREmptyDataSource dataSource = new JREmptyDataSource();
            JasperReport jr = JasperCompileManager.compileReport(path1);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, parms, dataSource);//set 2nd param map
            JasperViewer.viewReport(jasperPrint);
            //JasperPrintManager.printReport(jasperPrint, true);

        } catch (JRException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

    private void vehicletype() {
        jComboBox1.addItem("Van");
        jComboBox1.addItem("Bus");
        jComboBox1.addItem("Car");

        jComboBox1.addItem("Heavy-Duty Vehicles");
        jComboBox1.addItem("Others");
    }

    private void condition() {
        jComboBox4.addItem("Brand New");
        jComboBox4.addItem("Used");
        jComboBox4.addItem("Reconditioned");

    }

    private void enginetype() {
        jComboBox5.addItem("Hybrid");
        jComboBox5.addItem("Electrical");
        jComboBox5.addItem("Normal");
    }

    private void trnsmission() {
        jComboBox6.addItem("Manual");
        jComboBox6.addItem("Automatic");
        jComboBox6.addItem("Tiptronic");
    }

    private void brand() {
       try {
            ResultSet rs = Jdbc.getData("select brand_name from add_brand");
            while(rs.next()){
                jComboBox2.addItem(rs.getString("brand_name"));
            
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void count() {
       int i = 0;
        try {
            ResultSet rs = Jdbc.getData("select * from unregisterd_vehicles");
            while(rs.next()){
                
                   i=rs.getRow();
                    jLabel32.setText(Integer.toString(i));
                    
                
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}