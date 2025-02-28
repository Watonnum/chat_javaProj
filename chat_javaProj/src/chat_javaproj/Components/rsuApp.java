
package chat_javaproj.Components;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import javax.swing.ImageIcon;


public class rsuApp extends javax.swing.JFrame {

    /**
     * Creates new form rsuApp
     */
    public rsuApp() {
        initComponents();
         txtSearching.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNotification = new javax.swing.JLabel();
        lbSearching = new javax.swing.JLabel();
        lbMessenger = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        txtSearching = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnUsers = new javax.swing.JPanel();
        lbUsers = new javax.swing.JLabel();
        pnOverview = new javax.swing.JPanel();
        lbOverview = new javax.swing.JLabel();
        pnChart = new javax.swing.JPanel();
        lbChart = new javax.swing.JLabel();
        pnSetting = new javax.swing.JPanel();
        lbSetting = new javax.swing.JLabel();
        pnLogout = new javax.swing.JPanel();
        lbLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(204, 0, 51));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/icons8_menu_48px_1.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        jPanel16.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 17, -1, 37));

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("l");
        jPanel16.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 17, -1, 37));

        jLabel2.setFont(new java.awt.Font("K2D", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ipae_");
        jPanel16.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 17, -1, 37));

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("l");
        jPanel16.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 3, -1, -1));

        jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("l");
        jPanel16.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 0, -1, 66));

        lbNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/bell_26px.png"))); // NOI18N
        lbNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNotificationMouseEntered(evt);
            }
        });
        jPanel16.add(lbNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 23, -1, -1));

        lbSearching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/search_26px.png"))); // NOI18N
        lbSearching.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSearchingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSearchingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSearchingMouseExited(evt);
            }
        });
        jPanel16.add(lbSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 17, -1, 37));

        lbMessenger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/group_message_26px.png"))); // NOI18N
        lbMessenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbMessengerMouseEntered(evt);
            }
        });
        jPanel16.add(lbMessenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 22, -1, -1));

        lbAccount.setFont(new java.awt.Font("Lao MN", 1, 18)); // NOI18N
        lbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/male_user_50px.png"))); // NOI18N
        lbAccount.setText("Watanyu onnum");
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAccountMouseEntered(evt);
            }
        });
        jPanel16.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        txtSearching.setColumns(20);
        txtSearching.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchingActionPerformed(evt);
            }
        });
        jPanel16.add(txtSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 250, 30));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        pnUsers.setBackground(new java.awt.Color(0, 0, 0));
        pnUsers.setForeground(new java.awt.Color(127, 127, 127));
        pnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnUsersMouseExited(evt);
            }
        });
        pnUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsers.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbUsers.setForeground(new java.awt.Color(255, 255, 255));
        lbUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/add_user_group_woman_man_24px.png"))); // NOI18N
        lbUsers.setText(" Users");
        pnUsers.add(lbUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        pnOverview.setBackground(new java.awt.Color(0, 0, 0));
        pnOverview.setForeground(new java.awt.Color(204, 204, 204));
        pnOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnOverviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnOverviewMouseExited(evt);
            }
        });
        pnOverview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbOverview.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbOverview.setForeground(new java.awt.Color(255, 255, 255));
        lbOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/home_24px.png"))); // NOI18N
        lbOverview.setText(" Overview");
        pnOverview.add(lbOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 50));

        pnChart.setBackground(new java.awt.Color(0, 0, 0));
        pnChart.setForeground(new java.awt.Color(127, 127, 127));
        pnChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnChartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnChartMouseExited(evt);
            }
        });
        pnChart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbChart.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbChart.setForeground(new java.awt.Color(255, 255, 255));
        lbChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/account_24px.png"))); // NOI18N
        lbChart.setText(" Chart");
        pnChart.add(lbChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        pnSetting.setBackground(new java.awt.Color(0, 0, 0));
        pnSetting.setForeground(new java.awt.Color(127, 127, 127));
        pnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnSettingMouseExited(evt);
            }
        });
        pnSetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSetting.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbSetting.setForeground(new java.awt.Color(255, 255, 255));
        lbSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/edit_property_24px.png"))); // NOI18N
        lbSetting.setText(" Setting");
        pnSetting.add(lbSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        pnLogout.setBackground(new java.awt.Color(0, 0, 0));
        pnLogout.setForeground(new java.awt.Color(127, 127, 127));
        pnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnLogoutMouseExited(evt);
            }
        });
        pnLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/sort_window_24px.png"))); // NOI18N
        lbLogout.setText("Logout");
        pnLogout.add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnOverview, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(pnChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(pnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(pnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 740));

        setSize(new java.awt.Dimension(1440, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnOverviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMouseEntered
        // TODO add your handling code here:
        pnOverview.setBackground(Color.WHITE);
        lbOverview.setForeground(Color.BLACK);
        pnOverview.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnOverviewMouseEntered

    private void pnOverviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMouseExited
        // TODO add your handling code here:
        pnOverview.setBackground(Color.BLACK);
        lbOverview.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnOverviewMouseExited

    private void pnUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMouseEntered
        // TODO add your handling code here:
        pnUsers.setBackground(Color.WHITE);
        lbUsers.setForeground(Color.BLACK);
        pnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnUsersMouseEntered

    private void pnUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMouseExited
        // TODO add your handling code here:
        pnUsers.setBackground(Color.BLACK);
        lbUsers.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnUsersMouseExited

    private void pnChartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMouseEntered
        // TODO add your handling code here:
        pnChart.setBackground(Color.WHITE);
        lbChart.setForeground(Color.BLACK);
        pnChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnChartMouseEntered

    private void pnChartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMouseExited
        // TODO add your handling code here:
        pnChart.setBackground(Color.BLACK);
        lbChart.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnChartMouseExited

    private void pnSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseEntered
        // TODO add your handling code here:
        pnSetting.setBackground(Color.WHITE);
        lbSetting.setForeground(Color.BLACK);
        pnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnSettingMouseEntered

    private void pnSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseExited
        // TODO add your handling code here:
        pnSetting.setBackground(Color.BLACK);
        lbSetting.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnSettingMouseExited

    private void pnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseEntered
        // TODO add your handling code here:
        pnLogout.setBackground(Color.getHSBColor(0, 0, 30));
        lbLogout.setForeground(Color.BLACK);
        pnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnLogoutMouseEntered

    private void pnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseExited
        // TODO add your handling code here:
        pnLogout.setBackground(Color.BLACK);
        lbLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnLogoutMouseExited

    private void pnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseClicked
        // TODO add your handling code here:
        logIn end = new logIn();
        end.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnLogoutMouseClicked
  
    private void lbSearchingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchingMouseEntered
        lbSearching.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbSearchingMouseEntered

    private void lbSearchingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchingMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbSearchingMouseExited

    private void lbNotificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNotificationMouseEntered
        // TODO add your handling code here:
        lbNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbNotificationMouseEntered

    private void lbMessengerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMessengerMouseEntered
        // TODO add your handling code here:
        lbMessenger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbMessengerMouseEntered

    private void lbAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseEntered
        // TODO add your handling code here:
        lbAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbAccountMouseEntered

    private void txtSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchingActionPerformed

    private void lbSearchingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchingMouseClicked
        // TODO add your handling code here:
         txtSearching.setVisible(true);
         txtSearching.requestFocus();
    }//GEN-LAST:event_lbSearchingMouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel13MouseEntered

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
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rsuApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbChart;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbMessenger;
    private javax.swing.JLabel lbNotification;
    private javax.swing.JLabel lbOverview;
    private javax.swing.JLabel lbSearching;
    private javax.swing.JLabel lbSetting;
    private javax.swing.JLabel lbUsers;
    private javax.swing.JPanel pnChart;
    private javax.swing.JPanel pnLogout;
    private javax.swing.JPanel pnOverview;
    private javax.swing.JPanel pnSetting;
    private javax.swing.JPanel pnUsers;
    private javax.swing.JTextField txtSearching;
    // End of variables declaration//GEN-END:variables


}
