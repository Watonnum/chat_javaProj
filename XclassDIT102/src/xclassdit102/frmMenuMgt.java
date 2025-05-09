/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package xclassdit102;

import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author ipae
 */
public class frmMenuMgt extends javax.swing.JFrame {

    
    File myObj;
String data = "";
String petName = "";

    /**
     * Creates new form frmMenuMgt
     */
    public frmMenuMgt() {
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

        jLabel1 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMenuID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMenuName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPicture = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLink = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnWrite2File = new javax.swing.JButton();
        btnShowOutput = new javax.swing.JButton();
        btnShowPicture = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        Pic = new javax.swing.JLabel();
        txtLabelPic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Location");

        txtLocation.setColumns(20);
        txtLocation.setText("/Users/ipae/JavaField/DIT102/XclassDIT102/src/xclassdit102/menu.txt");

        jButton1.setText("Create File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("MenuID");

        txtMenuID.setColumns(14);

        jLabel3.setText("Menu Name");

        txtMenuName.setColumns(14);

        jLabel4.setText("Picture");

        txtPicture.setColumns(14);
        txtPicture.setText("burger.png");
        txtPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPictureActionPerformed(evt);
            }
        });

        jLabel5.setText("Link");

        txtLink.setColumns(14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnWrite2File.setText("Write to File");
        btnWrite2File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWrite2FileActionPerformed(evt);
            }
        });

        btnShowOutput.setText("Show Output");
        btnShowOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOutputActionPerformed(evt);
            }
        });

        btnShowPicture.setText("Show Picture");
        btnShowPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPictureActionPerformed(evt);
            }
        });

        btnOpenFile.setText("Open FIle");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        Pic.setText("jLabel6");
        Pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PicMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PicMouseEntered(evt);
            }
        });

        txtLabelPic.setColumns(8);
        txtLabelPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabelPicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(61, 61, 61)
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMenuID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPicture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenuName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnShowOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnWrite2File, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnOpenFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLabelPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMenuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtLabelPic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnWrite2File)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowOutput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowPicture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpenFile))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fc = new JFileChooser();
int returnValue = fc.showSaveDialog(this);
if(returnValue == JFileChooser.APPROVE_OPTION)
{
File file = fc.getSelectedFile();
txtLocation.setText(file.getAbsolutePath());
try {
File myObj = new File(txtLocation.getText());
if (myObj.createNewFile()) {
JOptionPane.showMessageDialog(rootPane, "File created: " + myObj.getName());
} else {
JOptionPane.showMessageDialog(rootPane, "File already exists.");
}
} catch (Exception e) {
JOptionPane.showMessageDialog(rootPane, "An error occurred.");
e.printStackTrace();
}
}
else
JOptionPane.showMessageDialog(rootPane, "Create File Command cancelled by user");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnWrite2FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWrite2FileActionPerformed
        // TODO add your handling code here:
        
        try {
FileWriter writer = new FileWriter(txtLocation.getText(), true);
BufferedWriter bufferedWriter = new BufferedWriter(writer);
bufferedWriter.newLine();

bufferedWriter.write(txtMenuID.getText() + "," + txtMenuName.getText()
+ "," + txtPicture.getText()+ "," + txtLink.getText());
String x = txtPicture.getText();
int indx = x.lastIndexOf('\\');
petName = x.substring(indx+1);
txtLabelPic.setText(petName);
bufferedWriter.close();

} catch (IOException e) {
e.printStackTrace();
JOptionPane.showMessageDialog(rootPane, "An error occurred.");
}
    }//GEN-LAST:event_btnWrite2FileActionPerformed

    private void btnShowPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPictureActionPerformed
        // TODO add your handling code here:
        ImageIcon myimg = new
        ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
        txtPicture.getText())));

        Image img1 = myimg.getImage();
        Image img2 = img1.getScaledInstance(Pic.getWidth(), Pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        Pic.setIcon(i);
    }//GEN-LAST:event_btnShowPictureActionPerformed

    private void txtPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPictureActionPerformed

    private void txtLabelPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabelPicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabelPicActionPerformed

    private void btnShowOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOutputActionPerformed
        // TODO add your handling code here:
        
        try {
File myObj = new File(txtLocation.getText());
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
data += myReader.nextLine()+ "\n";
}
myReader.close();
jTextArea1.setText(data);
} catch (FileNotFoundException e) {
JOptionPane.showMessageDialog(rootPane, "An error occurred.");
}
    }//GEN-LAST:event_btnShowOutputActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        // TODO add your handling code here:
        
        File file;
try
{
file = new File(txtLocation.getText());

if(!Desktop.isDesktopSupported()){
JOptionPane.showMessageDialog(null,"Desktop is not supported");
return;
}

Desktop desktop = Desktop.getDesktop();
if(file.exists()) desktop.open(file);
}
catch(Exception e) {
}

    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void PicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PicMouseEntered
        // TODO add your handling code here:
        Pic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_PicMouseEntered

    private void PicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PicMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://www.rsu.ac.th/"));

            } catch (IOException | URISyntaxException e1) {
                e1.printStackTrace();
        }
        
    }//GEN-LAST:event_PicMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenuMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuMgt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuMgt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pic;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnShowOutput;
    private javax.swing.JButton btnShowPicture;
    private javax.swing.JButton btnWrite2File;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtLabelPic;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMenuID;
    private javax.swing.JTextField txtMenuName;
    private javax.swing.JTextField txtPicture;
    // End of variables declaration//GEN-END:variables
}
