
package SocietyMaintenace;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame 
{
    

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        AddUserbutton = new javax.swing.JButton();
        Cancelbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Loginlabel = new javax.swing.JLabel();
        Passwordlabel = new javax.swing.JLabel();
        Loginfield = new javax.swing.JTextField();
        Passwordfield = new javax.swing.JPasswordField();
        Loginbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddUserbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        AddUserbutton.setText("ADD USER");
        AddUserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(AddUserbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, 47));

        Cancelbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Cancelbutton.setText("Cancel");
        Cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 150, 47));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN FORM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 888, 50));

        Loginlabel.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        Loginlabel.setForeground(new java.awt.Color(255, 255, 255));
        Loginlabel.setText("LOGIN");
        getContentPane().add(Loginlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 123, 105, 45));

        Passwordlabel.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        Passwordlabel.setForeground(new java.awt.Color(255, 255, 255));
        Passwordlabel.setText("PASSWORD");
        Passwordlabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Passwordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 186, 105, 43));

        Loginfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(Loginfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 125, 260, -1));

        Passwordfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(Passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 187, 260, -1));

        Loginbutton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Loginbutton.setText("Login");
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 150, 47));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divya Shah\\Documents\\GitWorkshop\\OneDrive\\Desktop\\pexels-pixabay-36717.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddUserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserbuttonActionPerformed
        // TODO add your handling code here:
        //Creating link Between Register and login form
        RegisterForm sc = new RegisterForm();
        sc.show();//--> to display RegisterForm
        dispose();
        
    }//GEN-LAST:event_AddUserbuttonActionPerformed

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
        // TODO add your handling code here:
        String username = Loginfield.getText();
        String password = String.valueOf(Passwordfield.getPassword());
        if (username.equals("")) 
        {
            JOptionPane.showMessageDialog(this, "First fill in User ID","Failed Test",JOptionPane.ERROR_MESSAGE);
        }
        else if (password.equals("")) 
        {
            JOptionPane.showMessageDialog(this, "First fill in Password","Failed Test",JOptionPane.ERROR_MESSAGE);  
        }
        else if (password.equals("123456") && username.equals("admin") ) 
        {
            JOptionPane.showMessageDialog(this,"Login Succesful","Success",JOptionPane.CLOSED_OPTION);
            dispose();
             MenuForm mf = new MenuForm();
             mf.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Incorrect User or Password","Try again",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_LoginbuttonActionPerformed

    private void CancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelbuttonActionPerformed
        dispose();
        exit(0);
    }//GEN-LAST:event_CancelbuttonActionPerformed

    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserbutton;
    private javax.swing.JButton Cancelbutton;
    private javax.swing.JButton Loginbutton;
    private javax.swing.JTextField Loginfield;
    private javax.swing.JLabel Loginlabel;
    private javax.swing.JPasswordField Passwordfield;
    private javax.swing.JLabel Passwordlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}