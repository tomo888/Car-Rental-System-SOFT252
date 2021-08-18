/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_customer;

import models.VehicleManager;
import products.Car;

/**
 *
 * @author User
 */
public class CustomerVehicleDetails extends javax.swing.JFrame {
    VehicleManager vm = new VehicleManager();
    Car carSelected = vm.getCarList().get(CustomerShopMenu.rowSelected);
    public static int totalPrice;

    /**
     * Creates new form CustomerVehicleDetails
     */
    public CustomerVehicleDetails() {
        initComponents();
        MakeText.setText("Make: " + carSelected.getMake());
        ModelText.setText("Model: " + carSelected.getModel());
        PriceText.setText("Price: £" + Integer.toString(carSelected.getPrice()));
        RegistrationText.setText("Registration: " + carSelected.getRegDetails());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        MakeText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ModelText = new javax.swing.JLabel();
        PriceText = new javax.swing.JLabel();
        RegistrationText = new javax.swing.JLabel();
        DaysDropdownBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TotalPriceText = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        DaysButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MakeText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MakeText.setText("Make:");

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 24)); // NOI18N
        jLabel2.setText("Mutley Motor Hire");
        jLabel2.setToolTipText("");

        ModelText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ModelText.setText("Model:");

        PriceText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PriceText.setText("Price Per Day:");

        RegistrationText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RegistrationText.setText("Registration:");

        DaysDropdownBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        DaysDropdownBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaysDropdownBoxActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("How many days would you like to hire this vehicle?");

        TotalPriceText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TotalPriceText.setText("Total price:");

        BackButton.setText("<- Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        PaymentButton.setText("Payment ->");
        PaymentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymentButtonMouseClicked(evt);
            }
        });
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });

        DaysButton.setText("Confirm amount of days");
        DaysButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DaysButtonMouseClicked(evt);
            }
        });
        DaysButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaysButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(DaysDropdownBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DaysButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MakeText)
                                .addComponent(ModelText))
                            .addGap(130, 130, 130)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PriceText)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RegistrationText)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 19, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(TotalPriceText)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BackButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentButton))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MakeText)
                    .addComponent(RegistrationText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceText)
                    .addComponent(ModelText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DaysDropdownBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DaysButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TotalPriceText)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(PaymentButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void DaysDropdownBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaysDropdownBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaysDropdownBoxActionPerformed

    private void DaysButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaysButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DaysButtonActionPerformed

    private void DaysButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DaysButtonMouseClicked
        int daysSelected = DaysDropdownBox.getSelectedIndex();
        totalPrice = carSelected.getPrice() * (daysSelected + 1);
        TotalPriceText.setText("Total price: £" + totalPrice);
    }//GEN-LAST:event_DaysButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        CustomerShopMenu cShop = new CustomerShopMenu();
        cShop.setVisible(true);
        cShop.pack();
        cShop.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void PaymentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentButtonMouseClicked
        CustomerPayment cPayment = new CustomerPayment();
        cPayment.setVisible(true);
        cPayment.pack();
        cPayment.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_PaymentButtonMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerVehicleDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerVehicleDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton DaysButton;
    private javax.swing.JComboBox<String> DaysDropdownBox;
    private javax.swing.JLabel MakeText;
    private javax.swing.JLabel ModelText;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JLabel PriceText;
    private javax.swing.JLabel RegistrationText;
    private javax.swing.JLabel TotalPriceText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}