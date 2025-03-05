package chat_javaproj.Components;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


public class logIn extends javax.swing.JFrame {
    
    public logIn() {
        initComponents();
//        jPanel1.setBackground(Color.decode("#202020"));
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsername = new CustomTextField(20);
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new CustomPasswordField(20);
        lbHelp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setColumns(20);
        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtUsername.setActionCommand("<Not Set>");
        txtUsername.setBorder(null);
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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 230, 28));

        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnExit.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        lbTitle.setFont(new java.awt.Font("Waseem", 0, 36)); // NOI18N
        lbTitle.setText("Sign In");
        jPanel1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lbUsername.setText("Username");
        jPanel1.add(lbUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lbPassword.setText("Password");
        jPanel1.add(lbPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.setPreferredSize(new java.awt.Dimension(64, 28));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 230, 29));

        lbHelp.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        lbHelp.setForeground(new java.awt.Color(51, 51, 255));
        lbHelp.setText("Need help?");
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
        jPanel1.add(lbHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/usernameIcon_24px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/passwordlock_24px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // ***--------Bordor Color---------****
    Border borderW= BorderFactory.createLineBorder(Color.WHITE, 5);
    Border borderR= BorderFactory.createLineBorder(Color.RED, 2);
    Border borderTouch= BorderFactory.createLineBorder(Color.BLACK, 2);
    
    // ***--------Variable-------------***
    String Input = "",InputPW = "";
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Input = txtUsername.getText();
        InputPW = txtPassword.getText();
        if ((Input.length() + InputPW.length()) == 20) {
            this.setVisible(false);
            System.out.println("Here");
            loadingComponent loadingCom = new loadingComponent();
            loadingCom.setVisible(true);
            
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

    }//GEN-LAST:event_txtUsernameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased

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
        lbHelp.setText("<html><u>Need help?</u></html>");
    }//GEN-LAST:event_lbHelpMouseEntered

    private void lbHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseExited
        lbHelp.setText("Need help?");
    }//GEN-LAST:event_lbHelpMouseExited

    private void lbHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseClicked
        try {
                    Desktop.getDesktop().browse(new URI("https://www.rsu.ac.th/"));
                } 
        catch (Exception ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_lbHelpMouseClicked

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbHelp;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

        //**--custom function--**
    
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
