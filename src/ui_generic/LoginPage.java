/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.UserManager;
import users.Customer;
import ui_customer.CustomerMenu;
import ui_admin.AdminMenu;
import users.Admin;
import ui_generic.SignupPage;
import models.UserManager;
import models.VehicleManager;
import products.Car;
/**
 *
 * @author User
 */
public class LoginPage extends javax.swing.JFrame {
    public static Customer customerLoggedIn;
    public static Admin adminLoggedIn;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        System.out.println(UserManager.getInstance().getCustomerList());
        char[] defaultPassword = new char[8];
        defaultPassword[0] = 'p';
        defaultPassword[1] = 'a';
        defaultPassword[2] = 's';
        defaultPassword[3] = 's';
        defaultPassword[4] = 'w';
        defaultPassword[5] = 'o';
        defaultPassword[6] = 'r';
        defaultPassword[7] = 'd';
        if (UserManager.getInstance().getAdminList().isEmpty()) {
            Admin masterAccount = new Admin("Master", "Admin", "@DefaultAdmin", defaultPassword);
            UserManager.getInstance().getAdminList().add(masterAccount);
        }
        
        if (UserManager.getInstance().getCustomerList().isEmpty()) {
            Customer testAccount = new Customer("Master", "Admin", "q", defaultPassword, 1, "q", null);
            UserManager.getInstance().getCustomerList().add(testAccount);
        }
        
        if (VehicleManager.getInstance().getCarList().isEmpty()) {
            Car testCar = new Car(false, 9999, "31/12/99", null, "test", "car", "8888");
            VehicleManager.getInstance().getCarList().add(testCar);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        NotificationText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jButtonAccountCreation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel1.setText("Mutley Motor Hire");
        jLabel1.setToolTipText("");

        NotificationText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NotificationText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NotificationText.setText("Welcome! Please login or create an account.");
        NotificationText.setFocusable(false);
        NotificationText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        jUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonAccountCreation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAccountCreation.setText("Haven't got an account? Register here!");
        jButtonAccountCreation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAccountCreationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(NotificationText)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jPassword))
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAccountCreation)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(NotificationText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonAccountCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccountCreationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAccountCreationMouseClicked
        SignupPage signP = new SignupPage();
        signP.setVisible(true);
        signP.pack();
        signP.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonAccountCreationMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String usernameInput = jUsername.getText();
        char[] passwordInput = jPassword.getPassword();
        boolean validDetails = false;
        
        if (usernameInput.charAt(0) == '@') {
            for(Admin a : UserManager.getInstance().getAdminList()) {
                if (a.getLoginName().equals(usernameInput)) {
                    if (Arrays.equals(a.getPassword(), passwordInput)) {
                        validDetails = true;
                        adminLoggedIn = a;
                        AdminMenu aMenu = new AdminMenu();
                        aMenu.setVisible(true);
                        aMenu.pack();
                        aMenu.setLocationRelativeTo(null);
                        this.dispose();
                    }
                }
            }
        }
        
        
        for(Customer u : UserManager.getInstance().getCustomerList()) {
            if (u.getLoginName().equals(usernameInput)) {
                if (Arrays.equals(u.getPassword(), passwordInput)) {
                    validDetails = true;
                    customerLoggedIn = u;
                    CustomerMenu cMenu = new CustomerMenu();
                    cMenu.setVisible(true);
                    cMenu.pack();
                    cMenu.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }
        
        if (validDetails == false) {
            NotificationText.setText("Your details are invalid.");
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NotificationText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAccountCreation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jUsername;
    // End of variables declaration//GEN-END:variables
}
