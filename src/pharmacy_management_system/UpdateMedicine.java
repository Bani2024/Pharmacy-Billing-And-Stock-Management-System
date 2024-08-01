
package pharmacy_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class UpdateMedicine extends javax.swing.JFrame {

     
    
    public UpdateMedicine(){
    initComponents();
    }
    
    public UpdateMedicine(String medid,String batchNo,String Name,String company,String mfg_date,String exp_date,String type,String quantity,String price) {
        initComponents();
         jTextField1.setText(medid);
         jTextField2.setText(batchNo);
         jTextField3.setText(Name);
         jTextField4.setText(company);
         jTextField5.setText(mfg_date);
         jTextField6.setText(exp_date);
         jTextField7.setText(type);
         jTextField8.setText(quantity);
         jTextField9.setText(price);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Batch no.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 209, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Current stock");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 599, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Name of the Medicine");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 269, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Type of Medicine");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 539, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("MFG. Company");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 329, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("MFG. Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 389, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Expiry date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 459, -1, -1));

        jButton2.setBackground(new java.awt.Color(10, 105, 121));
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 750, 120, 50));

        jButton3.setBackground(new java.awt.Color(10, 105, 121));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 750, 120, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Price per unit");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 669, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Medicine Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 149, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 300, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 410, 40));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 267, 410, 40));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 327, 410, 40));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 387, 410, 40));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 457, 410, 40));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 410, 40));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 410, 40));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 656, 410, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 90, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/med.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String mid=jTextField1.getText();
        String bno=jTextField2.getText();
        String nm=jTextField3.getText();
        String cname=jTextField4.getText();
        String mDate=jTextField5.getText();
        String exp=jTextField6.getText();
        String tab=jTextField7.getText();
        String stock=jTextField8.getText();
        String p=jTextField9.getText();

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
                String q1="UPDATE medicine SET medid='"+mid+"',batchNo='"+bno+"',name='"+nm+"',company='"+cname+"',mfg_date='"+mDate+"',exp_date='"+exp+"',type='"+tab+"',quantity='"+stock+"',price='"+p+"' where medid='"+mid+"'";
                //Prepeared Statement
                PreparedStatement pst1=conn.prepareStatement(q1);
                //Execute(insert/delete/edit)
                pst1.executeUpdate();
                //save changes(commit)
                JOptionPane.showMessageDialog(null,"Successfully Inserted");
                //inserted

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         jTextField1.setText("");
         jTextField2.setText("");
         jTextField3.setText("");
         jTextField4.setText("");
         jTextField5.setText("");
         jTextField6.setText("");
         jTextField7.setText("");
         jTextField8.setText("");
         jTextField9.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String medid=jTextField1.getText();
        try {
            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db?"+ "user=root&password=");

            // Create a statement
            Statement statement = con.createStatement();

            // Execute query to retrieve data
            ResultSet resultSet = statement.executeQuery("SELECT `medid`,`batchno`,`Name`,`company`,`mfg_date`,`exp_date`,`type`,`quantity`,`price` FROM medicine where medid='"+medid+"'");

            // Populate the combo box with data from the result set
            while (resultSet.next()) {
                String item1= resultSet.getString("batchno");
                String item2= resultSet.getString("Name");
                String item3= resultSet.getString("company");
                String item4= resultSet.getString("mfg_date");
                String item5=resultSet.getString("exp_date");
                String item6= resultSet.getString("type");
                String item7= resultSet.getString("quantity");
                String item8= resultSet.getString("price");
                 
                 jTextField2.setText(item1);
                 jTextField3.setText(item2);
                 jTextField4.setText(item3);
                 jTextField5.setText(item4);
                 jTextField6.setText(item5);
                 jTextField7.setText(item6);
                 jTextField8.setText(item7);
                 jTextField9.setText(item8);
            }
           
            
            // Close resources
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MedDetails med=new MedDetails();
        med.setVisible(true);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
