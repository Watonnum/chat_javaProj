
package chat_javaproj.Components;

import javax.swing.Timer;


public class rsuApp extends javax.swing.JFrame {

    /**
     * Creates new form rsuApp
     */
    public rsuApp() {
        initComponents();
    }

    String userMSG;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelNavigator = new javax.swing.JPanel();
        lbNavIcon = new javax.swing.JLabel();
        lbNavTitle = new javax.swing.JLabel();
        lbNavSignOut = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        PanelNavigator.setBackground(new java.awt.Color(204, 255, 255));

        lbNavIcon.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lbNavIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/nav32px.png"))); // NOI18N
        lbNavIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNavIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNavIconMouseExited(evt);
            }
        });

        lbNavTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbNavTitle.setText("Home");
        lbNavTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNavTitleMouseEntered(evt);
            }
        });

        lbNavSignOut.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbNavSignOut.setForeground(new java.awt.Color(51, 51, 255));
        lbNavSignOut.setText("Sign Out");
        lbNavSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNavSignOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNavSignOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNavSignOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelNavigatorLayout = new javax.swing.GroupLayout(PanelNavigator);
        PanelNavigator.setLayout(PanelNavigatorLayout);
        PanelNavigatorLayout.setHorizontalGroup(
            PanelNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavigatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNavIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 506, Short.MAX_VALUE)
                .addComponent(lbNavTitle)
                .addGap(499, 499, 499)
                .addComponent(lbNavSignOut)
                .addGap(17, 17, 17))
        );
        PanelNavigatorLayout.setVerticalGroup(
            PanelNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNavigatorLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(PanelNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNavIcon)
                    .addGroup(PanelNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNavSignOut)
                        .addComponent(lbNavTitle)))
                .addGap(10, 10, 10))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Date", "Division", "Phone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNavigator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbNavSignOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavSignOutMouseEntered
        // TODO add your handling code here:
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNavSignOut.setText("<html><u>Sign Out</u></html>");
        
    }//GEN-LAST:event_lbNavSignOutMouseEntered

    private void lbNavSignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavSignOutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        logIn login = new logIn();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_lbNavSignOutMouseClicked

    private void lbNavSignOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavSignOutMouseExited
        // TODO add your handling code here:
        lbNavSignOut.setText("Sign Out");
    }//GEN-LAST:event_lbNavSignOutMouseExited

    private void lbNavTitleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavTitleMouseEntered

    }//GEN-LAST:event_lbNavTitleMouseEntered

    private void lbNavIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavIconMouseEntered
        lbNavTitle.setText("Apps");
    }//GEN-LAST:event_lbNavIconMouseEntered

    private void lbNavIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNavIconMouseExited
        lbNavTitle.setText("Home");
    }//GEN-LAST:event_lbNavIconMouseExited

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
    private javax.swing.JPanel PanelNavigator;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbNavIcon;
    private javax.swing.JLabel lbNavSignOut;
    private javax.swing.JLabel lbNavTitle;
    // End of variables declaration//GEN-END:variables
}
