/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package thirdclassdit102;

import java.util.Random;

/**
 *
 * @author ipae
 */
public class threeChoice extends javax.swing.JFrame {

    /**
     * Creates new form threeChoice
     */
    public threeChoice() {
        initComponents();
    }

    Random rnd = new Random();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rad1 = new javax.swing.JRadioButton();
        rad2 = new javax.swing.JRadioButton();
        txtField3 = new javax.swing.JTextField();
        lbLOP = new javax.swing.JLabel();
        btnRandom = new javax.swing.JToggleButton();
        txtField4 = new javax.swing.JTextField();
        lbResult = new javax.swing.JLabel();
        rad3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(rad1);
        rad1.setText("Number 0-9");

        buttonGroup1.add(rad2);
        rad2.setText("Character a-z, A-Z");

        txtField3.setColumns(10);
        txtField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField3ActionPerformed(evt);
            }
        });

        lbLOP.setText("Lenght of Password");

        btnRandom.setText("Random");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        txtField4.setColumns(10);

        lbResult.setText("Result");

        buttonGroup1.add(rad3);
        rad3.setText("Character and Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnRandom)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbLOP)
                                .addGap(18, 18, 18)
                                .addComponent(txtField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbResult)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rad1)
                            .addComponent(rad2)
                            .addComponent(rad3))
                        .addGap(106, 106, 106))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rad1)
                .addGap(28, 28, 28)
                .addComponent(rad2)
                .addGap(35, 35, 35)
                .addComponent(rad3)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLOP))
                .addGap(18, 18, 18)
                .addComponent(btnRandom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbResult))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField3ActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        int len = Integer.parseInt(txtField3.getText());
        
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String data2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String ans = "";

        if (rad1.isSelected()) {

            StringBuilder randomString = new StringBuilder();

            for (int i = 0; i < len; i++) {
                char random =(char) (rnd.nextInt(10) + '0');
                randomString.append(random);
            }

            txtField4.setText(randomString + "");

        } else if (rad2.isSelected()) {

            for (int i = 0; i < len; i++) {
                ans += data.charAt(rnd.nextInt(data.length()));
            }

            txtField4.setText(ans);

        } else if (rad3.isSelected()) {
            
            for (int i = 0; i < len; i++) {
                ans += data2.charAt(rnd.nextInt(data2.length()));
            }
            
            txtField4.setText(ans);
        }
    }//GEN-LAST:event_btnRandomActionPerformed

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
            java.util.logging.Logger.getLogger(threeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(threeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(threeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(threeChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new threeChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnRandom;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbLOP;
    private javax.swing.JLabel lbResult;
    private javax.swing.JRadioButton rad1;
    private javax.swing.JRadioButton rad2;
    private javax.swing.JRadioButton rad3;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    private javax.swing.JTextField txtField3;
    private javax.swing.JTextField txtField4;
    // End of variables declaration//GEN-END:variables
}
