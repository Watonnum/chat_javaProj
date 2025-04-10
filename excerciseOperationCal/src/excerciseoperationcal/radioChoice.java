/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package excerciseoperationcal;

import javax.swing.JOptionPane;

/**
 *
 * @author ipae
 */
public class radioChoice extends javax.swing.JFrame {

    /**
     * Creates new form radioChoice
     */
    public radioChoice() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtField4 = new javax.swing.JTextField();
        lbOutput = new javax.swing.JLabel();
        lbTitle2 = new javax.swing.JLabel();
        lbNumber1 = new javax.swing.JLabel();
        txtField1 = new javax.swing.JTextField();
        lbNumber2 = new javax.swing.JLabel();
        txtField2 = new javax.swing.JTextField();
        radioPlus = new javax.swing.JRadioButton();
        radioMinus = new javax.swing.JRadioButton();
        radioMutiple = new javax.swing.JRadioButton();
        radioDivinde = new javax.swing.JRadioButton();
        radioMod = new javax.swing.JRadioButton();
        radioPow = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalculate.setText("Cal");
        btnCalculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtField4.setColumns(8);
        txtField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField4ActionPerformed(evt);
            }
        });

        lbOutput.setText("Output");

        lbTitle2.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        lbTitle2.setText("Calculator");
        lbTitle2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lbTitle2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTitle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTitle2MouseClicked(evt);
            }
        });

        lbNumber1.setText("Number 1");

        txtField1.setColumns(5);
        txtField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField1ActionPerformed(evt);
            }
        });

        lbNumber2.setText("Number 2");

        txtField2.setColumns(5);
        txtField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        buttonGroup1.add(radioPlus);
        radioPlus.setText("Plus");
        radioPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPlusActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioMinus);
        radioMinus.setText("Minus");
        radioMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMinusActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioMutiple);
        radioMutiple.setText("Mutiple");

        buttonGroup1.add(radioDivinde);
        radioDivinde.setText("Divinde");

        buttonGroup1.add(radioMod);
        radioMod.setText("Modulation");

        buttonGroup1.add(radioPow);
        radioPow.setText("Power");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalculate)
                            .addComponent(lbOutput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioPlus)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, Short.MAX_VALUE)
                                            .addComponent(lbTitle2)
                                            .addGap(7, 7, 7))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addComponent(radioMinus)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbNumber1)
                                        .addComponent(lbNumber2))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioDivinde)
                                .addGap(15, 15, 15)
                                .addComponent(radioMod)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(radioPow)
                                .addComponent(radioMutiple)))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbTitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumber1)
                    .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumber2)
                    .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPlus)
                    .addComponent(radioMinus)
                    .addComponent(radioMutiple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDivinde)
                    .addComponent(radioMod)
                    .addComponent(radioPow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbOutput))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnReset))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double userInput1 = Double.parseDouble(txtField1.getText());
        double userInput2 = Double.parseDouble(txtField2.getText());

        boolean plusOperator = radioPlus.isSelected();
        boolean minusOperator = radioMinus.isSelected();
        boolean multipleOperator = radioMutiple.isSelected();
        boolean divindeOperator = radioDivinde.isSelected();
        boolean modulusOperator = radioMod.isSelected();
        boolean powerOperator = radioPow.isSelected();

        if (plusOperator) {
            double answer = userInput1+userInput2;
            txtField4.setText(String.format("%.4f", answer));
        } else if (minusOperator) {
            double answer = userInput1-userInput2;
            txtField4.setText(String.format("%.4f", answer));
        } else if (multipleOperator) {
            double answer = userInput1*userInput2;
            txtField4.setText(String.format("%.4f", answer));
        } else if (divindeOperator) {
            double answer = userInput1/userInput2;
            txtField4.setText(String.format("%.4f", answer));
        } else if (modulusOperator) {
            double answer = userInput1%userInput2;
            txtField4.setText(String.format("%.4f", answer));
        } else if (powerOperator) {
            double answer = Math.pow(userInput1, userInput2);
            txtField4.setText(String.format("%.4f", answer));
        }

        else {
            JOptionPane.showMessageDialog(null, "Something wrong", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtField1.setText("");
        txtField2.setText("");
        txtField4.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField4ActionPerformed

    }//GEN-LAST:event_txtField4ActionPerformed

    private void lbTitle2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTitle2MouseClicked
        txtField1.requestFocus();
    }//GEN-LAST:event_lbTitle2MouseClicked

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed

    }//GEN-LAST:event_txtField1ActionPerformed

    private void radioMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMinusActionPerformed

    private void radioPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPlusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPlusActionPerformed

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
            java.util.logging.Logger.getLogger(radioChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(radioChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(radioChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(radioChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new radioChoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbNumber1;
    private javax.swing.JLabel lbNumber2;
    private javax.swing.JLabel lbOutput;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel lbTitle2;
    private javax.swing.JRadioButton radioDivinde;
    private javax.swing.JRadioButton radioMinus;
    private javax.swing.JRadioButton radioMod;
    private javax.swing.JRadioButton radioMutiple;
    private javax.swing.JRadioButton radioPlus;
    private javax.swing.JRadioButton radioPow;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    private javax.swing.JTextField txtField4;
    // End of variables declaration//GEN-END:variables
}
