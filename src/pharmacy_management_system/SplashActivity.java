/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy_management_system;



public class SplashActivity extends javax.swing.JFrame {
   
 
    public SplashActivity() {
        initComponents();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        progress1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 506, -1, -1));

        progressBar.setBackground(new java.awt.Color(20, 203, 234));
        progressBar.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 870, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please Wait...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 440, -1, -1));

        progress1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        progress1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(progress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 468, 80, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/splash.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
     
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
            java.util.logging.Logger.getLogger(SplashActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

         SplashActivity log=new SplashActivity();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                log.setVisible(true);
            
            }
            
        });
        ChoiceActivity ca =new ChoiceActivity();
         try{
                for(int i=0;i<=100;i++){
                Thread.sleep(40);
                log.progressBar.setValue(i);
                log.progress1.setText(i+"%");
                }
               }catch(Exception e){
                        e.printStackTrace();
                        }
         log.setVisible(false);
         ca.setVisible(true);
         log.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel progress1;
    private javax.swing.JProgressBar progressBar;
    // End of variables declaration//GEN-END:variables
}
