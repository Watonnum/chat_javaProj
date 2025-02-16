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
public class comboBox extends javax.swing.JFrame {

    /**
     * Creates new form comboBox
     */
    public comboBox() {
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

        btnCalculate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtField4 = new javax.swing.JTextField();
        lbOutput = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbNumber1 = new javax.swing.JLabel();
        txtField1 = new javax.swing.JTextField();
        lbNumber2 = new javax.swing.JLabel();
        txtField2 = new javax.swing.JTextField();
        lbOperator = new javax.swing.JLabel();
        cbBoxOperator = new javax.swing.JComboBox<>();

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

        lbTitle.setFont(new java.awt.Font("Academy Engraved LET", 1, 18)); // NOI18N
        lbTitle.setText("Calculator");
        lbTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lbTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTitleMouseClicked(evt);
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

        lbOperator.setText("Operator");

        cbBoxOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/", "%", "^" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNumber1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbOperator, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumber2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtField1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbBoxOperator, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalculate)
                            .addComponent(lbOutput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumber1)
                    .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumber2)
                    .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOperator)
                    .addComponent(cbBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
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
        double userInput1 = Double.parseDouble(txtField1.getText()); // pull value1
        double userInput2 = Double.parseDouble(txtField2.getText()); // pull value2

        switch((String) cbBoxOperator.getSelectedItem()){
            case "+" -> {
                double answer = userInput1+userInput2;
                txtField4.setText(String.format("%.4f", answer));
                break;
            }
            case "-" -> {
                double answer = userInput1-userInput2;
                txtField4.setText(String.format("%.4f", answer));
                break;
            }
            case "*" -> {
                double answer = userInput1*userInput2;
                txtField4.setText(String.format("%.4f", answer));
                break;
            }
            case "/" -> {
                double answer = userInput1/userInput2;
                txtField4.setText(String.format("%.4f", answer));
                break;
            }
            case "%" -> {
                double answer = userInput1%userInput2;
                txtField4.setText(String.format("%.4f", answer));
                break;
            }
            case "^" -> {
                double answer = Math.pow(userInput1, userInput2);
                txtField4.setText(String.format("%.4f", answer));
                break;
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Operator wrong type, try agian.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtField1.setText("");
        txtField2.setText("");
        txtField4.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField4ActionPerformed

    }//GEN-LAST:event_txtField4ActionPerformed

    private void lbTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTitleMouseClicked
        txtField1.requestFocus();
    }//GEN-LAST:event_lbTitleMouseClicked

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed

    }//GEN-LAST:event_txtField1ActionPerformed

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
            java.util.logging.Logger.getLogger(comboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbBoxOperator;
    private javax.swing.JLabel lbNumber1;
    private javax.swing.JLabel lbNumber2;
    private javax.swing.JLabel lbOperator;
    private javax.swing.JLabel lbOutput;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    private javax.swing.JTextField txtField4;
    // End of variables declaration//GEN-END:variables
}
