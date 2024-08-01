/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author USER
 */
public class Order extends javax.swing.JFrame {

    private String username;
    private String name;
    private String email;
    private String number;
    private String company;
    
    public Order() {
        initComponents();
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
      public Order(String username, String name, String email, String number, String company) {
        initComponents();
         this.username = username;
        this.name = name;
        this.email = email;
        this.number = number;
        this.company = company;
        msg.setText(username);
        msg.setVisible(false);
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
        ResultSet resultSet = statement.executeQuery("SELECT * FROM medicine WHERE Name ='"+medname12+"'");

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
        searchBar = new javax.swing.JTextField();
        companyname = new javax.swing.JTextField();
        mfgdate = new javax.swing.JTextField();
        exdate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        medname1 = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        msg1 = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        msg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Total Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 630, 100, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Batch no.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Name of the Medicine");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 180, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("MFG. Company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("MFG. Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Expiry date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 110, -1));

        batchno.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(batchno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 290, -1));

        searchBar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 380, 50));

        companyname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(companyname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 290, -1));

        mfgdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(mfgdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 290, -1));

        exdate.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(exdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 290, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Quantity");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 80, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Type of Medicine");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 160, -1));

        quantity.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, 280, -1));

        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 290, 40));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Price per unit");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, 120, -1));

        price.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 290, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search Medicine Name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 210, 50));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Order Now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 139, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 39, 49, 31));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 121, 48));

        medname1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(medname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 290, -1));

        message.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 460, 45));

        msg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, 270, 30));

        tprice.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        getContentPane().add(tprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 280, -1));
        getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 255, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accountupdate.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         searchBar.setText("");
         batchno.setText("");
         medname1.setText("");
         companyname.setText("");
         mfgdate.setText("");
         exdate.setText("");
         type.addItem("");
         price.setText("");
         quantity.setText("");
         tprice.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String searchItem=searchBar.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db?" + "user=root&password=");
            
              Statement statement = conn.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT `batchno`,`name`,`company`,`mfg_date`, `exp_date`,`type`,`price` from medicine where name LIKE '%"+searchItem+"%'");

            // Populate the combo box with data from the result set
            if (!resultSet.next()) {
        // If no results found, display "Not found" message
       message.setText("Sorry,no results found!try searching for something else");
    } else {
        // Populate the combo box with data from the result set
        do {
            String item1 = resultSet.getString("batchno");
            String item2 = resultSet.getString("name");
            String item3 = resultSet.getString("company");
            String item4 = resultSet.getString("mfg_date");
            String item5 = resultSet.getString("exp_date");
            String item6 = resultSet.getString("type");
            String item7 = resultSet.getString("price");
            batchno.setText(item1);
            medname1.setText(item2);
            companyname.setText(item3);
            mfgdate.setText(item4);
            exdate.setText(item5);
            type.addItem(item6);
            price.setText(item7);
        } while (resultSet.next());
    }
            

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String user=msg.getText();
        String bno=batchno.getText();
        String med=medname1.getText();
        String cname=companyname.getText();
        String m=mfgdate.getText();
        String exp=exdate.getText();
        String type1=type.getSelectedItem().toString();
        String q=quantity.getText();
        String p1=price.getText();
        
        String p=tprice.getText();
        String orderId="";
       
       
        
        
       
       if(bno.isEmpty() || med.isEmpty() || cname.isEmpty() ||m.isEmpty() || exp.isEmpty() || type1.isEmpty()||q.isEmpty()||p1.isEmpty()||p.isEmpty())
       {
       JOptionPane.showMessageDialog(null,"Fill Properly");  
       }
      else
       {
       
       try
        {
            
             orderId = String.format("%06d", new Random().nextInt(999999));
            //connection
           Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db?" + "user=root&password="); 
           
           String q11="select *  from ordertbl where username='"+user+"'";
           PreparedStatement pst = conn.prepareStatement(q11);
           ResultSet rs11 = pst.executeQuery();
           if(rs11.next())
           {
               JOptionPane.showMessageDialog(null,"Oops! It seems this medicine has already been ordered. Please check your order history or contact customer support for assistance.");
           }
           else
           {
            //Queries
            String q1="INSERT INTO ordertbl(orderid,username,batchno,name,company,mfgdate,expdate,type,quantity,price,total) VALUES ('"+orderId+"','"+user+"','"+bno+"','"+med+"','"+cname+"','"+m+"','"+exp+"','"+type1+"','"+q+"','"+p1+"','"+p+"')";
            //Prepeared Statement
              String q2 = "update medicine set  quantity=quantity - '"+q+"' WHERE Name = '"+med+"' ";
            PreparedStatement pst1=conn.prepareStatement(q1);
              PreparedStatement pst2=conn.prepareStatement(q2);
            //Execute(insert/delete/edit)
            pst1.executeUpdate();
             pst2.executeUpdate();
            //save changes(commit)
            JOptionPane.showMessageDialog(null,"Order Placed. Order ID:" + orderId);
            //inserted 
           }
        }
        catch(Exception e)
        {
              JOptionPane.showMessageDialog(null,e);      
        }
       } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Userdash user=new Userdash(username, name, email, number, company);
        user.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medname1;
    private javax.swing.JLabel message;
    private javax.swing.JTextField mfgdate;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTextField tprice;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
