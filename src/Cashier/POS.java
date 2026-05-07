
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cashier;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Hanisha
 */
public class POS extends javax.swing.JFrame {

    private Connection Con;
    PreparedStatement St;
    ResultSet rst;

    /**
     * Creates new form CartManage
     */
    public POS() {
        initComponents();
        Sqlconnector();
        loadcartmanageIntoTable();
        // Add mouse listener for the clear button
        jButtonclear.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButtonclearMouseClicked(evt);
        }
    });
        setImage();
    }
    
    void Sqlconnector() {
    try {
        // Ensure the connection is established
        Class.forName("com.mysql.cj.jdbc.Driver");
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homely_treats", "root", "1234");
        System.out.println("Database Connected");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(POS.class.getName()).log(Level.SEVERE, "Driver not found", ex);
    } catch (SQLException ex) {
        Logger.getLogger(POS.class.getName()).log(Level.SEVERE, "SQL error", ex);
    }
}
    
     public void init(){
        setImage();
    }
    
    public void setImage(){
        
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/whitebread.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/wheatbread.png"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/baguette.png"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/croissant.png"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/muffin.png"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/doughnut.png"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/cupcake.png"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/chocolatecake.png"));
        ImageIcon icon9 = new ImageIcon(getClass().getResource("/images/cheesecake.png"));
        ImageIcon icon10 = new ImageIcon(getClass().getResource("/images/chocolatechipcookie.png"));
        ImageIcon icon11 = new ImageIcon(getClass().getResource("/images/sugarcookie.png"));
        ImageIcon icon12 = new ImageIcon(getClass().getResource("/images/oatmealcookie.png"));
        ImageIcon icon13 = new ImageIcon(getClass().getResource("/images/applepie.png"));
        ImageIcon icon14 = new ImageIcon(getClass().getResource("/images/cherrypie.png"));
        ImageIcon icon15 = new ImageIcon(getClass().getResource("/images/lemonpie.png"));

        Image img1 = icon1.getImage().getScaledInstance(jLabelimage1.getWidth(),jLabelimage1.getHeight(),Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(jLabelimage2.getWidth(),jLabelimage2.getHeight(),Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(jLabelimage3.getWidth(),jLabelimage3.getHeight(),Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(jLabelimage4.getWidth(),jLabelimage4.getHeight(),Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(jLabelimage5.getWidth(),jLabelimage5.getHeight(),Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(jLabelimage6.getWidth(),jLabelimage6.getHeight(),Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(jLabelimage7.getWidth(),jLabelimage7.getHeight(),Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(jLabelimage8.getWidth(),jLabelimage8.getHeight(),Image.SCALE_SMOOTH);
        Image img9 = icon9.getImage().getScaledInstance(jLabelimage9.getWidth(),jLabelimage9.getHeight(),Image.SCALE_SMOOTH);
        Image img10 = icon10.getImage().getScaledInstance(jLabelimage10.getWidth(),jLabelimage10.getHeight(),Image.SCALE_SMOOTH);
        Image img11 = icon11.getImage().getScaledInstance(jLabelimage11.getWidth(),jLabelimage11.getHeight(),Image.SCALE_SMOOTH);
        Image img12 = icon12.getImage().getScaledInstance(jLabelimage12.getWidth(),jLabelimage12.getHeight(),Image.SCALE_SMOOTH);
        Image img13  = icon13.getImage().getScaledInstance(jLabelimage13.getWidth(),jLabelimage13.getHeight(),Image.SCALE_SMOOTH);
        Image img14 = icon14.getImage().getScaledInstance(jLabelimage14.getWidth(),jLabelimage14.getHeight(),Image.SCALE_SMOOTH);
        Image img15 = icon15.getImage().getScaledInstance(jLabelimage15.getWidth(),jLabelimage15.getHeight(),Image.SCALE_SMOOTH);
        
        jLabelimage1.setIcon(new ImageIcon(img1));
        jLabelimage2.setIcon(new ImageIcon(img2));
        jLabelimage3.setIcon(new ImageIcon(img3));
        jLabelimage4.setIcon(new ImageIcon(img4));
        jLabelimage5.setIcon(new ImageIcon(img5));
        jLabelimage6.setIcon(new ImageIcon(img6));
        jLabelimage7.setIcon(new ImageIcon(img7));
        jLabelimage8.setIcon(new ImageIcon(img8));
        jLabelimage9.setIcon(new ImageIcon(img9));
        jLabelimage10.setIcon(new ImageIcon(img10));
        jLabelimage11.setIcon(new ImageIcon(img11));
        jLabelimage12.setIcon(new ImageIcon(img12));
        jLabelimage13.setIcon(new ImageIcon(img13));
        jLabelimage14.setIcon(new ImageIcon(img14));
        jLabelimage15.setIcon(new ImageIcon(img15));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        jLabelimage2 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jButtonadd2 = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel25 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        jLabelimage7 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jSpinner7 = new javax.swing.JSpinner();
        jPanel26 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabelimage9 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jButtonadd9 = new javax.swing.JButton();
        jSpinner9 = new javax.swing.JSpinner();
        jPanel27 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        jLabelimage14 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jButtonadd14 = new javax.swing.JButton();
        jSpinner14 = new javax.swing.JSpinner();
        jPanel28 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabelimage11 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jButtonadd11 = new javax.swing.JButton();
        jSpinner11 = new javax.swing.JSpinner();
        jPanel29 = new javax.swing.JPanel();
        jLabel180 = new javax.swing.JLabel();
        jLabelimage10 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jButtonadd10 = new javax.swing.JButton();
        jSpinner10 = new javax.swing.JSpinner();
        jPanel30 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jLabelimage5 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jButtonadd5 = new javax.swing.JButton();
        jSpinner5 = new javax.swing.JSpinner();
        jPanel31 = new javax.swing.JPanel();
        jLabel190 = new javax.swing.JLabel();
        jLabelimage12 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jButtonadd12 = new javax.swing.JButton();
        jSpinner12 = new javax.swing.JSpinner();
        jPanel32 = new javax.swing.JPanel();
        jLabel195 = new javax.swing.JLabel();
        jLabelimage6 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jButtonadd6 = new javax.swing.JButton();
        jSpinner6 = new javax.swing.JSpinner();
        jPanel33 = new javax.swing.JPanel();
        jLabel200 = new javax.swing.JLabel();
        jLabelimage4 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jButtonadd4 = new javax.swing.JButton();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel34 = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        jLabelimage3 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jButtonadd3 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel35 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        jLabelimage13 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jButtonadd13 = new javax.swing.JButton();
        jSpinner13 = new javax.swing.JSpinner();
        jPanel36 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jLabelimage8 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jButtonadd8 = new javax.swing.JButton();
        jSpinner8 = new javax.swing.JSpinner();
        jPanel37 = new javax.swing.JPanel();
        jLabel220 = new javax.swing.JLabel();
        jLabelimage15 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jButtonadd15 = new javax.swing.JButton();
        jSpinner15 = new javax.swing.JSpinner();
        jPanel23 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jLabelimage1 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButtonadd1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablecartmanage = new javax.swing.JTable();
        jLabeltotal = new javax.swing.JLabel();
        jLabeldiscount = new javax.swing.JLabel();
        jTextFieldtotal = new javax.swing.JTextField();
        jTextFielddiscount = new javax.swing.JTextField();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jLabelamount = new javax.swing.JLabel();
        jTextFieldamount = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButtonok2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 22)); // NOI18N
        jLabel1.setText("Homely Treats");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel24.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage2.setText("photo");
        jPanel24.add(jLabelimage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel158.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel158.setText("Wheat Bread");
        jPanel24.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        jLabel159.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel159.setText("RM 2.00");
        jPanel24.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd2.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd2.setText("Add");
        jButtonadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd2ActionPerformed(evt);
            }
        });
        jPanel24.add(jButtonadd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel24.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, 160));

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage7.setText("photo");
        jPanel25.add(jLabelimage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel163.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("Cupcake");
        jPanel25.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 60, 20));

        jLabel164.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel164.setText("RM 2.00");
        jPanel25.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 189, 43));
        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel25.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel25.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 130, 160));

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel26.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage9.setText("photo");
        jPanel26.add(jLabelimage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel168.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("Cheese Cake");
        jPanel26.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        jLabel169.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel169.setText("RM 3.00");
        jPanel26.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd9.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd9.setText("Add");
        jButtonadd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd9ActionPerformed(evt);
            }
        });
        jPanel26.add(jButtonadd9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel26.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 130, 160));

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel27.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage14.setText("photo");
        jPanel27.add(jLabelimage14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel173.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel173.setText("Cherry Pie");
        jPanel27.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        jLabel174.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel174.setText("RM 3.00");
        jPanel27.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd14.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd14.setText("Add");
        jButtonadd14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd14ActionPerformed(evt);
            }
        });
        jPanel27.add(jButtonadd14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel27.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 130, 160));

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel28.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage11.setText("photo");
        jPanel28.add(jLabelimage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel178.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel178.setText("Sugar Cookie");
        jPanel28.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 80, -1));

        jLabel179.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel179.setText("RM 1.00");
        jPanel28.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd11.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd11.setText("Add");
        jButtonadd11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd11ActionPerformed(evt);
            }
        });
        jPanel28.add(jButtonadd11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel28.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 130, 160));

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel29.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage10.setText("photo");
        jPanel29.add(jLabelimage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel183.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setText("Chocolate Chip Cookie");
        jPanel29.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, -1));

        jLabel184.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel184.setText("RM 1.25");
        jPanel29.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd10.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd10.setText("Add");
        jButtonadd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd10ActionPerformed(evt);
            }
        });
        jPanel29.add(jButtonadd10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel29.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 130, 160));

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage5.setText("photo");
        jPanel30.add(jLabelimage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel188.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel188.setText("Muffin");
        jPanel30.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, -1));

        jLabel189.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel189.setText("RM 1.00");
        jPanel30.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd5.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd5.setText("Add");
        jButtonadd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd5ActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonadd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel30.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 130, 160));

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel31.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage12.setText("photo");
        jPanel31.add(jLabelimage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel193.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel193.setText("Oatmeal Cookie");
        jPanel31.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jLabel194.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel194.setText("RM 1.00");
        jPanel31.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd12.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd12.setText("Add");
        jButtonadd12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd12ActionPerformed(evt);
            }
        });
        jPanel31.add(jButtonadd12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel31.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 130, 160));

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel32.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage6.setText("photo");
        jPanel32.add(jLabelimage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel198.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel198.setText("Doughnut");
        jPanel32.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        jLabel199.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel199.setText("RM 0.99");
        jPanel32.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd6.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd6.setText("Add");
        jButtonadd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd6ActionPerformed(evt);
            }
        });
        jPanel32.add(jButtonadd6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel32.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 130, 160));

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel33.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage4.setText("photo");
        jPanel33.add(jLabelimage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel203.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel203.setText("Croisant");
        jPanel33.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, -1));

        jLabel204.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel204.setText("RM 1.75");
        jPanel33.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd4.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd4.setText("Add");
        jButtonadd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd4ActionPerformed(evt);
            }
        });
        jPanel33.add(jButtonadd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel33.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 130, 160));

        jPanel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel34.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage3.setText("photo");
        jPanel34.add(jLabelimage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel208.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel208.setText("Baguette");
        jPanel34.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, -1));

        jLabel209.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel209.setText("RM 2.50");
        jPanel34.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd3.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd3.setText("Add");
        jButtonadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd3ActionPerformed(evt);
            }
        });
        jPanel34.add(jButtonadd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel34.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 130, 160));

        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel35.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage13.setText("photo");
        jPanel35.add(jLabelimage13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel213.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("Apple Pie");
        jPanel35.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        jLabel214.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel214.setText("RM 2.80");
        jPanel35.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd13.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd13.setText("Add");
        jButtonadd13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd13ActionPerformed(evt);
            }
        });
        jPanel35.add(jButtonadd13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel35.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 130, 160));

        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel36.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage8.setText("photo");
        jPanel36.add(jLabelimage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel218.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel218.setText("Chocolate Cake");
        jPanel36.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, -1));

        jLabel219.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel219.setText("RM 3.50");
        jPanel36.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd8.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd8.setText("Add");
        jButtonadd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd8ActionPerformed(evt);
            }
        });
        jPanel36.add(jButtonadd8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel36.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 130, 160));

        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel37.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage15.setText("photo");
        jPanel37.add(jLabelimage15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel223.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel223.setText("Lemon Pie");
        jPanel37.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        jLabel224.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel224.setText("RM 2.50");
        jPanel37.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jButtonadd15.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd15.setText("Add");
        jButtonadd15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd15ActionPerformed(evt);
            }
        });
        jPanel37.add(jButtonadd15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jSpinner15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel37.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jPanel7.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 130, 160));

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel23.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, -1, -1));

        jLabelimage1.setText("photo");
        jPanel23.add(jLabelimage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 70));

        jLabel155.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("White Bread");
        jPanel23.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        jLabel156.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel156.setText("RM 1.50");
        jPanel23.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel23.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 60, -1));

        jButtonadd1.setBackground(new java.awt.Color(0, 189, 43));
        jButtonadd1.setText("Add");
        jButtonadd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonadd1MouseClicked(evt);
            }
        });
        jButtonadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadd1ActionPerformed(evt);
            }
        });
        jPanel23.add(jButtonadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 60, 20));

        jPanel7.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 160));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 690, 510));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("     Menu Items");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 690, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablecartmanage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTablecartmanage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Quantity", "Price (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablecartmanage);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 250));

        jLabeltotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabeltotal.setText("Total: ");
        jPanel1.add(jLabeltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 80, 30));

        jLabeldiscount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabeldiscount.setText("Discount");
        jPanel1.add(jLabeldiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 30));

        jTextFieldtotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldtotal.setText("RM");
        jTextFieldtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtotalActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 110, -1));

        jTextFielddiscount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFielddiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddiscountActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFielddiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 110, -1));

        jButtondelete.setBackground(new java.awt.Color(215, 224, 225));
        jButtondelete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtondelete.setText("Delete");
        jButtondelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtondeleteMouseClicked(evt);
            }
        });
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 80, -1));

        jButtonclear.setBackground(new java.awt.Color(215, 224, 225));
        jButtonclear.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonclear.setText("Clear");
        jButtonclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonclearMouseClicked(evt);
            }
        });
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 80, -1));

        jLabelamount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelamount.setText("Amount");
        jPanel1.add(jLabelamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 80, 30));

        jTextFieldamount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextFieldamount.setText("RM ");
        jTextFieldamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldamountActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 110, 30));

        print.setBackground(new java.awt.Color(204, 102, 0));
        print.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print.setText("Print");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 80, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 300, 510));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonok2.setBackground(new java.awt.Color(153, 129, 45));
        jButtonok2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonok2.setText("Back");
        jButtonok2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonok2MouseClicked(evt);
            }
        });
        jButtonok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonok2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonok2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 100, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTextFielddiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddiscountActionPerformed
    jTextFielddiscount.setText("RM");  // Discount TextField
    
    }//GEN-LAST:event_jTextFielddiscountActionPerformed

    private void jButtondeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondeleteMouseClicked

        
    }//GEN-LAST:event_jButtondeleteMouseClicked

    private void jButtonclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonclearMouseClicked
      // Clear all rows from the cart table
    DefaultTableModel model = (DefaultTableModel) jTablecartmanage.getModel();
    model.setRowCount(0); // Remove all rows from the table

    // Optionally, reset the total, discount, and amount fields
    jTextFieldtotal.setText("RM"); // Reset total field
    jTextFielddiscount.setText("RM"); // Reset discount field
    jTextFieldamount.setText("RM"); // Reset final amount field
    }//GEN-LAST:event_jButtonclearMouseClicked

    private void jButtonadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd2ActionPerformed
        addItemToCart("Wheat Bread", 2.00, (int) jSpinner2.getValue());
    }//GEN-LAST:event_jButtonadd2ActionPerformed

    private void jButtonadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd3ActionPerformed
        addItemToCart("Baguette", 2.50, (int) jSpinner3.getValue());
    }//GEN-LAST:event_jButtonadd3ActionPerformed

    private void jButtonadd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd4ActionPerformed
       addItemToCart("Croissant", 1.75, (int) jSpinner4.getValue());
    }//GEN-LAST:event_jButtonadd4ActionPerformed

    private void jButtonadd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd5ActionPerformed
        addItemToCart("Muffin", 1.00, (int) jSpinner5.getValue());
    }//GEN-LAST:event_jButtonadd5ActionPerformed

    private void jButtonadd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd6ActionPerformed
        addItemToCart("Doughnut", 0.99, (int) jSpinner6.getValue());
    }//GEN-LAST:event_jButtonadd6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        addItemToCart("Cupcake", 2.00, (int) jSpinner7.getValue());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonadd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd8ActionPerformed
        addItemToCart("Chocolate Cake", 3.50, (int) jSpinner8.getValue());
    }//GEN-LAST:event_jButtonadd8ActionPerformed

    private void jButtonadd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd9ActionPerformed
        addItemToCart("Cheesecake", 3.00, (int) jSpinner9.getValue());
    }//GEN-LAST:event_jButtonadd9ActionPerformed

    private void jButtonadd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd10ActionPerformed
        addItemToCart("Chocolate Chip Cookie", 1.25, (int) jSpinner10.getValue());
    }//GEN-LAST:event_jButtonadd10ActionPerformed

    private void jButtonadd11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd11ActionPerformed
        addItemToCart("Sugar Cookie", 1.00, (int) jSpinner11.getValue());
    }//GEN-LAST:event_jButtonadd11ActionPerformed

    private void jButtonadd12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd12ActionPerformed
        addItemToCart("Oatmeal Cookie", 1.00, (int) jSpinner12.getValue());
    }//GEN-LAST:event_jButtonadd12ActionPerformed

    private void jButtonadd13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd13ActionPerformed
        addItemToCart("Apple Pie", 2.80, (int) jSpinner13.getValue());
    }//GEN-LAST:event_jButtonadd13ActionPerformed

    private void jButtonadd14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd14ActionPerformed
        addItemToCart("Cherry Pie", 3.00, (int) jSpinner14.getValue());
    }//GEN-LAST:event_jButtonadd14ActionPerformed

    private void jButtonadd15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd15ActionPerformed
        addItemToCart("Lemon Pie", 2.50, (int) jSpinner15.getValue());
    }//GEN-LAST:event_jButtonadd15ActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        int rowIndex = jTablecartmanage.getSelectedRow();
    if (rowIndex != -1) {
        DefaultTableModel model = (DefaultTableModel) jTablecartmanage.getModel();
        model.removeRow(rowIndex); // Remove the selected row
        calculateTotalAndTax(); // Recalculate the total and tax
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.");
    }
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
    // Clear all rows from the cart table
    DefaultTableModel model = (DefaultTableModel) jTablecartmanage.getModel();
    model.setRowCount(0); // Remove all rows from the table

    // Optionally, reset the total, discount, and amount fields to default values
    jTextFieldtotal.setText("RM"); // Reset total field
    jTextFielddiscount.setText("RM"); // Reset discount field
    jTextFieldamount.setText("RM"); // Reset final amount field
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jTextFieldtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtotalActionPerformed

    private void jTextFieldamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldamountActionPerformed
       jTextFieldamount.setText("RM");  // Amount after discount and tax 
    }//GEN-LAST:event_jTextFieldamountActionPerformed

    private void jButtonok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonok2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonok2ActionPerformed

    private void jButtonok2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonok2MouseClicked
        new Mainpage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonok2MouseClicked

    private void jButtonadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadd1ActionPerformed
        addItemToCart("White Bread", 1.50, (int) jSpinner1.getValue());
    }//GEN-LAST:event_jButtonadd1ActionPerformed

    private void jButtonadd1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonadd1MouseClicked

    }//GEN-LAST:event_jButtonadd1MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
       
    }//GEN-LAST:event_printActionPerformed

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked

    DefaultTableModel model = (DefaultTableModel) jTablecartmanage.getModel();

    // Prepare receipt content
    StringBuilder receiptContent = new StringBuilder("Receipt\n-----------------------\n");
    double totalAmount = 0.0;
    double discountAmount = 0.0;

    // Validate and parse discount amount
    try {
        discountAmount = Double.parseDouble(jTextFielddiscount.getText().replace("RM", "").trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid discount amount. Please enter a valid number.");
        return;
    }

    try {
        // Iterate through each item in the cart
        for (int i = 0; i < model.getRowCount(); i++) {
            String itemName = model.getValueAt(i, 0).toString();
            int quantity = Integer.parseInt(model.getValueAt(i, 1).toString());
            double price = Double.parseDouble(model.getValueAt(i, 2).toString());
            double itemTotal = price * quantity;

            // Fetch product_id and cost price from the products table
            String productQuery = "SELECT product_id, price FROM products WHERE product_name = ?";
            PreparedStatement productStmt = Con.prepareStatement(productQuery);
            productStmt.setString(1, itemName);
            ResultSet productResult = productStmt.executeQuery();

            if (productResult.next()) {
                int productId = productResult.getInt("product_id");
                double costPrice = productResult.getDouble("price");

                // Insert transaction details into the transactions table
                String transactionQuery = "INSERT INTO transactions (product_id, product_name, quantity, total_price, cost_price) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement transactionStmt = Con.prepareStatement(transactionQuery);
                transactionStmt.setInt(1, productId);
                transactionStmt.setString(2, itemName);
                transactionStmt.setInt(3, quantity);
                transactionStmt.setDouble(4, itemTotal);
                transactionStmt.setDouble(5, costPrice * quantity);
                transactionStmt.executeUpdate();

                // Append details to the receipt
                receiptContent.append(String.format("%s x%d: RM%.2f\n", itemName, quantity, itemTotal));
                totalAmount += itemTotal;

                transactionStmt.close();
            } else {
                JOptionPane.showMessageDialog(this, "Product not found in the database: " + itemName);
            }
            productResult.close();
            productStmt.close();
        }

        // Add totals to the receipt
        receiptContent.append("-----------------------\n");
        receiptContent.append(String.format("Total: RM%.2f\n", totalAmount));
        receiptContent.append(String.format("Discount: RM%.2f\n", discountAmount));
        receiptContent.append(String.format("Final Amount: RM%.2f\n", totalAmount - discountAmount));
        receiptContent.append("-----------------------\n");

        // Display the receipt in a popup
        JTextArea textArea = new JTextArea(receiptContent.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 300));

        JOptionPane.showMessageDialog(
            this,
            scrollPane,
            "Receipt",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Clear the cart
        model.setRowCount(0);
        jTextFieldtotal.setText("RM");
        jTextFielddiscount.setText("RM");
        jTextFieldamount.setText("RM");

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving transaction: " + ex.getMessage());
    }

    }//GEN-LAST:event_printMouseClicked

    
    private void addItemToCart(String name, double price, int quantity) {
    if (quantity > 0) {
        DefaultTableModel model = (DefaultTableModel) jTablecartmanage.getModel();
        boolean itemFound = false;
        // Check if the item is already in the cart
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(name)) {
                int existingQuantity = (int) model.getValueAt(i, 1);
                model.setValueAt(existingQuantity + quantity, i, 1);  // Update quantity
                itemFound = true;
                break;
            }
        }
        // If item doesn't exist, add it to the table
        if (!itemFound) {
            model.addRow(new Object[]{name, quantity, price}); // Add new item
        }
        calculateTotalAndTax(); // Recalculate the total and tax
    }
}

    private void loadcartmanageIntoTable() {
    try {
        String query = "SELECT * FROM cartmanage";  // Update the query according to your DB structure
        St = Con.prepareStatement(query);
        rst = St.executeQuery();
        
        DefaultTableModel d = (DefaultTableModel) jTablecartmanage.getModel();
        d.setRowCount(0); // Clear existing data

        while (rst.next()) {
            Vector vc = new Vector();
            vc.add(rst.getString("name"));
            vc.add(rst.getString("quantity"));
            vc.add(rst.getString("price"));
            d.addRow(vc);
        }
        
        // Refresh the table
        jTablecartmanage.repaint();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}

   private void calculateTotalAndTax() {
    double total = 0;
    double totalDiscount = 0;

    try {
        for (int i = 0; i < jTablecartmanage.getRowCount(); i++) {
            String itemName = jTablecartmanage.getValueAt(i, 0).toString();
            int quantity = Integer.parseInt(jTablecartmanage.getValueAt(i, 1).toString());
            double price = Double.parseDouble(jTablecartmanage.getValueAt(i, 2).toString());

            double itemTotal = price * quantity;

            String query = "SELECT discount_value FROM managediscount WHERE product_name = ?";
            PreparedStatement st = Con.prepareStatement(query);
            st.setString(1, itemName);
            ResultSet rs = st.executeQuery();

            double discountValue = 0;
            if (rs.next()) {
                discountValue = rs.getDouble("discount_value");
            }

            double itemDiscount = itemTotal * (discountValue / 100);
            totalDiscount += itemDiscount;
            total += itemTotal - itemDiscount;

            rs.close();
            st.close();
        }

        double tax = total * 0.10;
        double finalAmount = total + tax;

        jTextFieldtotal.setText("RM " + String.format("%.2f", total));
        jTextFielddiscount.setText("RM " + String.format("%.2f", totalDiscount));
        jTextFieldamount.setText("RM " + String.format("%.2f", finalAmount));
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
    }
}


    
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonadd1;
    private javax.swing.JButton jButtonadd10;
    private javax.swing.JButton jButtonadd11;
    private javax.swing.JButton jButtonadd12;
    private javax.swing.JButton jButtonadd13;
    private javax.swing.JButton jButtonadd14;
    private javax.swing.JButton jButtonadd15;
    private javax.swing.JButton jButtonadd2;
    private javax.swing.JButton jButtonadd3;
    private javax.swing.JButton jButtonadd4;
    private javax.swing.JButton jButtonadd5;
    private javax.swing.JButton jButtonadd6;
    private javax.swing.JButton jButtonadd8;
    private javax.swing.JButton jButtonadd9;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonok2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelamount;
    private javax.swing.JLabel jLabeldiscount;
    private javax.swing.JLabel jLabelimage1;
    private javax.swing.JLabel jLabelimage10;
    private javax.swing.JLabel jLabelimage11;
    private javax.swing.JLabel jLabelimage12;
    private javax.swing.JLabel jLabelimage13;
    private javax.swing.JLabel jLabelimage14;
    private javax.swing.JLabel jLabelimage15;
    private javax.swing.JLabel jLabelimage2;
    private javax.swing.JLabel jLabelimage3;
    private javax.swing.JLabel jLabelimage4;
    private javax.swing.JLabel jLabelimage5;
    private javax.swing.JLabel jLabelimage6;
    private javax.swing.JLabel jLabelimage7;
    private javax.swing.JLabel jLabelimage8;
    private javax.swing.JLabel jLabelimage9;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTable jTablecartmanage;
    private javax.swing.JTextField jTextFieldamount;
    private javax.swing.JTextField jTextFielddiscount;
    private javax.swing.JTextField jTextFieldtotal;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
