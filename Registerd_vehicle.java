/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sad_viva;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.BalloonTipStyle;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.FadingUtils;

/**
 *
 * @author Inspiron 15
 */
public class Registerd_vehicle extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registerd_vehicle
     */
    public Registerd_vehicle() {
        initComponents();
        Brand();
        condition();
        enginetype();
        trnsmission();
        vehicletype();
        model();
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 20));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Registerd Number   -     ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 170, 30));

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Chassis Number       -");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 160, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Brand Name             -");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Brand" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Model                        -");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 193, 32));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Model Year               -");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 199, 193, 40));

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setFormat(2);
    try {
        dateChooserCombo1.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
    } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
        e1.printStackTrace();
    }
    getContentPane().add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 32));

    jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel8.setText("Condition                  -");
    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 180, 40));

    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Condition" }));
    getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, 31));

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
    getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 110, 0, 30));

    jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel11.setText("Engine Type             -");
    getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, 30));

    jButton2.setForeground(new java.awt.Color(255, 255, 153));
    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_item.png"))); // NOI18N
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 30, 30));

    jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Engine Type" }));
    getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 150, 30));

    jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel4.setText("Transmission           -");
    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 317, 160, 40));

    jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Transmission " }));
    getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, 30));

    jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel7.setText("Price (Rs)                  -");
    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 30));

    jTextField3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField3ActionPerformed(evt);
        }
    });
    getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 150, 30));

    jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel9.setText("Millage (Km)            - ");
    getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 403, 150, 30));
    getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 150, 30));

    jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 180, 160));

    jButton3.setBackground(new java.awt.Color(255, 255, 153));
    jButton3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
    jButton3.setForeground(new java.awt.Color(0, 153, 153));
    jButton3.setText("Upload");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 180, 20));

    jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Model" }));
    getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 30));

    jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Vehicle Type" }));
    jComboBox6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBox6ActionPerformed(evt);
        }
    });
    getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 20));

    jLabel32.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    jLabel32.setText("Vehicle Type            -");
    getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

    jProgressBar1.setForeground(new java.awt.Color(255, 51, 51));
    getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 180, -1));

    jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
    getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 350, 190));
    getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 180, 20));
    getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 180, 20));
    getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 180, 30));
    getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 180, 30));
    getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 180, 30));
    getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 180, 30));
    getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 180, 30));
    getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 180, 30));
    getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 180, 30));
    getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 180, 30));
    getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 180, 30));

    jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 153)), "Search Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
    getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 200, 420));

    jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 12));
    getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 580, 670));

    jLabel26.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
    jLabel26.setText("Brand Name");
    getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 100, 30));

    jLabel27.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
    jLabel27.setText("Registerd Number");
    getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 100, 30));

    jLabel28.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
    jLabel28.setText("Chassis Number");
    getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 100, 30));

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
    getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 120, 30));

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow-retweet.png"))); // NOI18N
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 30, 30));

    jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTextField7MouseClicked(evt);
        }
    });
    jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField7KeyReleased(evt);
        }
    });
    getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 120, 30));

    jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/database_server.png"))); // NOI18N
    getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 30, 30));

    jButton8.setBackground(new java.awt.Color(255, 255, 153));
    jButton8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
    jButton8.setText("Add  Data");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton8ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 160, 30));

    jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTextField8MouseClicked(evt);
        }
    });
    jTextField8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField8ActionPerformed(evt);
        }
    });
    jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextField8KeyReleased(evt);
        }
    });
    getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 120, 30));

    jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Trash.gif"))); // NOI18N
    getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 40, 30));

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 30, 30));

    jButton6.setBackground(new java.awt.Color(255, 255, 153));
    jButton6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
    jButton6.setText("Delete");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton6ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 160, 30));

    jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow-circle-double.png"))); // NOI18N
    getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 40, 30));

    jButton7.setBackground(new java.awt.Color(255, 255, 153));
    jButton7.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
    jButton7.setText("Update");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });
    getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 160, 30));

    jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 9));
    getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 510, 150));

    jTable1.setBackground(new java.awt.Color(204, 255, 204));
    jTable1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "vehicle type", "Registerd Number", "Chassis Number", "Brand Name", "Model", "Model Year", "Condition", "Engine Type", "Transmission", "Price(Rs)", "Millage(Km)", "Image"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTable1.setGridColor(new java.awt.Color(102, 102, 255));
    jTable1.setSelectionBackground(new java.awt.Color(255, 153, 153));
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 510, 520));

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        try {

            int row = jTable1.getSelectedRow();
            if (row != -1) {

                Jdbc.setData("delete from registerd_vehicles where reg_registerd_number ='" + jTable1.getValueAt(row, 1).toString() + "' ");

                JOptionPane.showMessageDialog(null, "Deleted !");
                dtm.removeRow(row);
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row from table");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String rp = path.replace('\\', '/');
            
            Jdbc.setData("INSERT INTO registerd_vehicles VALUES('" + jComboBox6.getSelectedItem() + "','" + jTextField1.getText() + "','" + jTextField2.getText() + "','" + jComboBox1.getSelectedItem() + "','" + jComboBox5.getSelectedItem() + "','" + dateChooserCombo1.getText().toString() + "','" + jComboBox2.getSelectedItem() + "','" + jComboBox3.getSelectedItem() + "','" + jComboBox4.getSelectedItem() + "','" + jTextField3.getText() + "','" + jTextField5.getText() + "','" + rp + "')");
            clear();
            JOptionPane.showMessageDialog(null, "Data is Save to Database !");
            

        } catch (com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e) {
             BTip.viewToolTip(jTextField1, "This Register Number Already Saved !");

        } catch (java.sql.SQLException e) {
              BTip.viewToolTip(jTextField5, "Fill all data Correctly Before Add Data");

        } catch (Exception ex) {
            ex.printStackTrace();

        }


    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
      
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
                    jLabel10.setIcon(new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH)));
                    jProgressBar1.setVisible(false);
                }
            }).start();

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        jTextField7.setVisible(false);
        jTextField8.setVisible(false);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        jTextField6.setVisible(false);
        jTextField8.setVisible(false);
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        jTextField6.setVisible(false);
        jTextField7.setVisible(false);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField6.setVisible(true);
        jTextField7.setVisible(true);
        jTextField8.setVisible(true);

        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField8.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Jdbc.getData("SELECT * FROM registerd_vehicles WHERE brand like'" + jTextField6.getText() + "%" + "'");
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
                v.add(rs.getString(12));

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Jdbc.getData("SELECT * FROM  registerd_vehicles WHERE reg_chassis_number='" + jTextField8.getText() + "'");
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
                v.add(rs.getString(12));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        try {
            ResultSet rs = Jdbc.getData("SELECT * FROM  registerd_vehicles WHERE reg_registerd_number='" + jTextField7.getText() + "'");
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
                v.add(rs.getString(12));
                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jLabel14.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jLabel15.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jLabel16.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        jLabel17.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        jLabel18.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        jLabel20.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
        jLabel19.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
        jLabel22.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
        jLabel24.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString());
        jLabel23.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString());
        jLabel33.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString());

        String n = jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString();
        String x = n.replace('/', '\\');

        if (new File(n).exists()) {
            jLabel12.setIcon(new ImageIcon(new ImageIcon(x).getImage().getScaledInstance(jLabel12.getWidth(), jLabel12.getHeight(), Image.SCALE_SMOOTH)));
        }else{
            BTip.viewToolTip(jLabel12, "Image Not Found Check Your Image Saved Folder or Upadate New Image");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

    private void Brand() {

    }

    private void condition() {
        jComboBox2.addItem("Brand New");
        jComboBox2.addItem("Used");
        jComboBox2.addItem("Reconditioned");

    }

    private void enginetype() {
        jComboBox3.addItem("Hybrid");
        jComboBox3.addItem("Electrical");
        jComboBox3.addItem("Normal");
    }

    private void trnsmission() {
        jComboBox4.addItem("Manual");
        jComboBox4.addItem("Automatic");
        jComboBox4.addItem("Tiptronic");
    }

    private void vehicletype() {

        jComboBox6.addItem("Van");
        jComboBox6.addItem("Bus");
        jComboBox6.addItem("Car");

        jComboBox6.addItem("Heavy-Duty Vehicles");
        jComboBox6.addItem("Others");
    }

    private void model() {

    }

    private void clear() {
       
    }
}