/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Manager;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Nouf
 */
public class FinanceManageM extends javax.swing.JFrame {

    // Database connection and PreparedStatement (if needed)
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    /**
     * Creates new form FinanceManageM
     */
    public FinanceManageM() {
        initComponents();
        Sqlconnector();
        populateTextAreas(); 
        setImage();
    }

    private Connection Con;
    PreparedStatement St;
    ResultSet rst;

   void  Sqlconnector(){
      try {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/homely_treats", "root", "1234");
          System.out.println("Database Connected");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(FinanceManageM.class.getName()).log(Level.SEVERE, "Driver not found", ex);
    } catch (SQLException ex) {
        Logger.getLogger(FinanceManageM.class.getName()).log(Level.SEVERE, "SQL error", ex);
    }

    }
   
   public void setImage(){
        
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/Images/rb_2149149924.png"));
        Image img1 = icon1.getImage().getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
        pic.setIcon(new ImageIcon(img1));


   }
   
   private int getTotalOrders() {
        try {
            String query = "SELECT COUNT(*) AS total_orders FROM orders";
            pst = Con.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt("total_orders");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FinanceManageM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private double getTotalRevenue() {
        try {
            String query = "SELECT SUM(total_price) AS total_revenue FROM transactions";
            pst = Con.prepareStatement(query);
            rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getDouble("total_revenue");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FinanceManageM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }

    private double getTotalExpenses() {
        double ingredientExpenses = 0.0;
        double discountExpenses = 0.0;

        try {
            // Ingredient expenses
            String ingredientQuery = "SELECT SUM(ingredient_quantity * Cost_perunit) AS ingredient_expenses FROM ingredients";
            pst = Con.prepareStatement(ingredientQuery);
            rs = pst.executeQuery();
            if (rs.next()) {
                ingredientExpenses = rs.getDouble("ingredient_expenses");
            }

            // Discount expenses
            String discountQuery = "SELECT SUM(discount_value) AS discount_expenses FROM managediscount";
            pst = Con.prepareStatement(discountQuery);
            rs = pst.executeQuery();
            if (rs.next()) {
                discountExpenses = rs.getDouble("discount_expenses");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FinanceManageM.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ingredientExpenses + discountExpenses;
    }

    private double getTotalSales() {
    try {
        String query = "SELECT SUM(quantity * cost_price) AS total_sales FROM transactions";
        pst = Con.prepareStatement(query);
        rs = pst.executeQuery();

        if (rs.next()) {
            return rs.getDouble("total_sales");
        }
    } catch (SQLException ex) {
        Logger.getLogger(FinanceManageM.class.getName()).log(Level.SEVERE, null, ex);
    }
    return 0.0;
}

   private void populateTextAreas() {
    int totalOrders = getTotalOrders();
    double totalRevenue = getTotalRevenue();
    double totalExpenses = getTotalExpenses();
    double totalSales = getTotalSales();

    // Update JTextAreas with the calculated values
    TA1.setText("Total Orders: " + totalOrders);
    TA2.setText("Total Revenue: $" + String.format("%.2f", totalRevenue));
    TA3.setText("Total Sales: $" + String.format("%.2f", totalSales));
    TA4.setText("Total Expenses: $" + String.format("%.2f", totalExpenses));
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
        jLabel2 = new javax.swing.JLabel();
        backBR = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TA4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TA3 = new javax.swing.JTextArea();
        pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Finance Dashboard");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        backBR.setBackground(new java.awt.Color(255, 255, 255));
        backBR.setFont(new java.awt.Font("Aparajita", 1, 14)); // NOI18N
        backBR.setForeground(new java.awt.Color(0, 0, 0));
        backBR.setText("X");
        backBR.setBorder(null);
        backBR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBRMouseClicked(evt);
            }
        });
        backBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBRActionPerformed(evt);
            }
        });
        jPanel1.add(backBR, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 930, 20));

        TA1.setBackground(new java.awt.Color(204, 204, 204));
        TA1.setColumns(20);
        TA1.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        TA1.setForeground(new java.awt.Color(0, 0, 0));
        TA1.setWrapStyleWord(true);
        TA1.setAlignmentX(0.1F);
        TA1.setAutoscrolls(false);
        TA1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TA1.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TA1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 260, 90));

        TA2.setBackground(new java.awt.Color(204, 204, 204));
        TA2.setColumns(20);
        TA2.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        TA2.setForeground(new java.awt.Color(0, 0, 0));
        TA2.setWrapStyleWord(true);
        TA2.setAlignmentX(0.1F);
        TA2.setAutoscrolls(false);
        TA2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TA2.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TA2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 260, 90));

        TA4.setBackground(new java.awt.Color(204, 204, 204));
        TA4.setColumns(20);
        TA4.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        TA4.setForeground(new java.awt.Color(0, 0, 0));
        TA4.setWrapStyleWord(true);
        TA4.setAlignmentX(0.1F);
        TA4.setAutoscrolls(false);
        TA4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TA4.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(TA4);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 260, 90));

        TA3.setBackground(new java.awt.Color(204, 204, 204));
        TA3.setColumns(20);
        TA3.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        TA3.setForeground(new java.awt.Color(0, 0, 0));
        TA3.setWrapStyleWord(true);
        TA3.setAlignmentX(0.1F);
        TA3.setAutoscrolls(false);
        TA3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TA3.setCaretColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(TA3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 260, 90));
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 450, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 750, 570));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBRActionPerformed

    private void backBRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBRMouseClicked
        new ManagerDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBRMouseClicked

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
            java.util.logging.Logger.getLogger(FinanceManageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinanceManageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinanceManageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinanceManageM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinanceManageM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA1;
    private javax.swing.JTextArea TA2;
    private javax.swing.JTextArea TA3;
    private javax.swing.JTextArea TA4;
    private javax.swing.JButton backBR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
