package chat_javaproj;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class logIn extends javax.swing.JFrame {
    // call another app
    rsuApp app = new rsuApp();
    
    public logIn() {
        initComponents();
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPic = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lbHelp = new javax.swing.JLabel();
        iconUsername = new javax.swing.JLabel();
        iconUsername1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/rsuIcon.png"))); // NOI18N
        lbPic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtUsername.setColumns(20);
        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Silom", 0, 24)); // NOI18N
        lbTitle.setText("RSU Login");

        lbUsername.setText("Username");

        lbPassword.setText("Password");

        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, new java.awt.Color(255, 255, 255)));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        lbHelp.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        lbHelp.setForeground(new java.awt.Color(51, 51, 255));
        lbHelp.setText("need help?");
        lbHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbHelpMouseExited(evt);
            }
        });

        iconUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/user.png"))); // NOI18N
        iconUsername.setLabelFor(txtUsername);
        iconUsername.setAlignmentX(100.0F);

        iconUsername1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/pass.png"))); // NOI18N
        iconUsername1.setLabelFor(txtPassword);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(lbPic))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHelp)
                                    .addComponent(btnLogin)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(iconUsername1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbPassword)
                                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(iconUsername)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbUsername)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbPic, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle)
                .addGap(21, 21, 21)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconUsername1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHelp)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // ***--------Bordor Color---------****
    Border borderW= BorderFactory.createLineBorder(Color.WHITE, 5);
    Border borderR= BorderFactory.createLineBorder(Color.RED, 2);
    Border borderTouch= BorderFactory.createLineBorder(Color.BLACK, 2);
    
    // ***--------Variable-------------***
    String Input = "",InputPW = "";
    
    int i = 0; //for test log
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Input = txtUsername.getText();
        InputPW = txtPassword.getText();
        if ((Input.length() + InputPW.length()) == 20) {
            this.setVisible(false);
            app.setVisible(true);
            app.setLocationRelativeTo(this);
            
        } else {
           JOptionPane.showConfirmDialog(null, "not found 404", "Warning", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
           
           if(Input.length() == 7) {
               txtPassword.requestFocus();
           } else {
               txtUsername.requestFocus();
           }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    
    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped

    }//GEN-LAST:event_txtUsernameKeyTyped

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        Input = txtUsername.getText();
        validationInput(Input);
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        InputPW = txtPassword.getText();
        validationInputPW(InputPW);
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        Input = txtUsername.getText();
        boolean on_off = Input.isEmpty();
        
        if (on_off) {
            txtUsername.setBorder(borderTouch);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        Input = txtPassword.getText();
        boolean on_off = Input.isEmpty();
        
        if (on_off) {
            txtPassword.setBorder(borderTouch);
        }
    }//GEN-LAST:event_txtPasswordFocusGained

    private void lbHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseEntered
        lbHelp.setText("<html><u>need help?</u></html>");
    }//GEN-LAST:event_lbHelpMouseEntered

    private void lbHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseExited
        lbHelp.setText("need help?");
    }//GEN-LAST:event_lbHelpMouseExited

    private void lbHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseClicked
        try {
                    Desktop.getDesktop().browse(new URI("https://www.rsu.ac.th/"));
                } 
        catch (Exception ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_lbHelpMouseClicked

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JLabel iconUsername1;
    private javax.swing.JLabel lbHelp;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPic;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

        
    private void validationInput(String Input) {
        String input = Input;
        
        int lengthInput = input.length();
        
        if (lengthInput == 7) {         //6708767
            txtUsername.setBorder(borderW);
        } 
        else
        txtUsername.setBorder(borderR);
    }

    private void validationInputPW(String InputPW) {
        String input = InputPW;
        
        int lengthInput = input.length();
        
        if (lengthInput == 13) {         // 1200901241039
            txtPassword.setBorder(borderW);
        } 
        else
        txtPassword.setBorder(borderR);
    }
}
