/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class OrderUpdate extends javax.swing.JFrame {
    private String orderid;
     private String username;
    private String name;
    private String email;
    private String number;
    private String company;
    
    public OrderUpdate() {
        initComponents();
       
    }
    
     public OrderUpdate(String orderid,String username, String name, String email, String number, String company) {
        initComponents();
        this.orderid=orderid;
        this.username = username;
        this.name = name;
        this.email = email;
        this.number = number;
        this.company = company;
        orderId.setText(orderid);
        orderId.setEditable(false);
        batchno.setEditable(false);
        medname1.setEditable(false);
        companyname.setEditable(false);
        mfgdate.setEditable(false);
        exdate.setEditable(false);
        price.setEditable(false);
        type.setEditable(false);
         quantity.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        calculateTotal();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        calculateTotal();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        // Plain text components don't fire these events
        calculateTotal();
    }
});
        
    }
       private void calculateTotal() {
    try {
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db?" + "user=root&password=");

        Statement statement = conn.createStatement();

        // Retrieve quantity from the user input
        String qt = quantity.getText();
        String medname12 = medname1.getText();

        // Execute query to retrieve data
        ResultSet resultSet = statement.executeQuery("SELECT * FROM medicine WHERE Name='"+medname12+"'");

        if (resultSet.next()) {
            int availableQuantity = resultSet.getInt("quantity");
            double price1 = resultSet.getDouble("price");
            
            // Check if quantity entered by user is greater than available quantity
            if (Integer.parseInt(qt) > availableQuantity) {
                msg1.setText("Sorry! Not enough quantity available.");
            } else {
                // Check if quantity and price are provided
                if (qt.isEmpty() || price1 == 0.0) {
                    JOptionPane.showMessageDialog(null, "Fill Properly");
                } else {
                    try {
                        int q = Integer.parseInt(qt);
                        double total = q * price1;
                        String totalString = String.valueOf(total);
                        tprice.setText(totalString);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
        } else {
            msg1.setText("Sorry! Medicine not found.");
        }

        conn.close(); // Close connection
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        batchno = new javax.swing.JTextField();
        companyname = new javax.swing.JTextField();
        mfgdate = new javax.swing.JTextField();
        exdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        medname1 = new javax.swing.JTextField();
        msg1 = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        orderId = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Total Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, 100, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Update Your Order");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 160, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Name of the Medicine");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("MFG. Company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("MFG. Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 100, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Expiry date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, -1));

        batchno.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(batchno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 330, 40));

        companyname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(companyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 330, 40));

        mfgdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(mfgdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 330, 40));

        exdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(exdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 330, 40));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, 80, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Type of Medicine");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 150, -1));

        quantity.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 562, 280, 40));

        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 290, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Price per unit");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 120, -1));

        price.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 632, 290, 40));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 139, 50));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 121, 48));

        medname1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(medname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 330, 40));

        msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 270, 30));

        tprice.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 280, 40));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Batch no.");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, -1));

        orderId.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(orderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 230, 40));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setText("Order Id");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 90, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 90, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accountupdate.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         batchno.setText("");
        medname1.setText("");
        companyname.setText("");
        mfgdate.setText("");
        exdate.setText("");
        type.addItem("");
        price.setText("");
        quantity.setText("");
        tprice.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String od= orderId.getText();
        String bno= batchno.getText();
        String nm= medname1.getText();
        String cname= companyname.getText();
        String mDate= mfgdate.getText();
        String exp= exdate.getText();
        String tab= type.getSelectedItem().toString();
        String stock= quantity.getText();
        String p= price.getText();
        String tp= tprice.getText();

        if( bno.isEmpty() || nm.isEmpty() || cname.isEmpty() || mDate.isEmpty()||exp.isEmpty()||tab.isEmpty() || stock.isEmpty() || p.isEmpty() )
        {
            JOptionPane.showMessageDialog(null,"Fill Properly");
        }
        else
        {

            try
            {
                //connection
                Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db?" + "user=root&password=");

                //Queries
                String q1="UPDATE ordertbl SET batchNo='"+bno+"',name='"+nm+"',company='"+cname+"',mfgdate='"+mDate+"',expdate='"+exp+"',type='"+tab+"',quantity='"+stock+"',price='"+p+"',total='"+tp+"' where orderid='"+od+"'";
                //Prepeared Statement
                PreparedStatement pst1=conn.prepareStatement(q1);
                //Execute(insert/delete/edit)
                pst1.executeUpdate();
                //save changes(commit)
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                //inserted

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        } 
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String od=orderId.getText();
        try {
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db?"+ "user=root&password=");

            
            Statement statement = con.createStatement();

         
            ResultSet resultSet = statement.executeQuery("SELECT `orderid`,`batchno`,`name`, `company`,`mfgdate`,`expdate`,`type`,`price`,`quantity`,`total` FROM ordertbl where orderid='"+od+"'");

           
            while (resultSet.next()) {
                String item1= resultSet.getString("batchno");
                String item2= resultSet.getString("name");
                String item3= resultSet.getString("company");
                String item4= resultSet.getString("mfgdate");
                String item5=resultSet.getString("expdate");
                String item6= resultSet.getString("type");
                String item7= resultSet.getString("quantity");
                String item8= resultSet.getString("price");
                String item9= resultSet.getString("total");
                 
                 batchno.setText(item1);
                 medname1.setText(item2);
                 companyname.setText(item3);
                 mfgdate.setText(item4);
                 exdate.setText(item5);
                 type.addItem(item6);
                 quantity.setText(item7);
                 price.setText(item8);
                 tprice.setText(item9);
            }
           
            
           
            resultSet.close();
            statement.close();
            con.close();
            } catch (SQLException e) {
            e.printStackTrace();
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        View view=new View(username,name,email,number,company);
        view.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OrderUpdate().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchno;
    private javax.swing.JTextField companyname;
    private javax.swing.JTextField exdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medname1;
    private javax.swing.JTextField mfgdate;
    private javax.swing.JLabel msg1;
    private javax.swing.JTextField orderId;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField tprice;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
