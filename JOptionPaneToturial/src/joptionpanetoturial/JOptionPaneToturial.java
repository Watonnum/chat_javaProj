/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpanetoturial;

import javax.swing.JOptionPane;



/**
 *
 * @author ipae
 */
public class JOptionPaneToturial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //loopGay();
            practiceLoopGay();
            //threeOption();
            
    }

    private static void loopGay() {
        boolean status = true;
            while (status) {
            int answer = JOptionPane.showConfirmDialog(null, "Are you Gay?","Question",JOptionPane.YES_NO_OPTION);
            switch(answer) {
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Finally, you are!!.");
                    status = false;
                }
                case 1 -> {
                    System.out.println("Gay");
                    break;
                }
                case -1 -> { //this's close button.they could return -1.
                    JOptionPane.showMessageDialog(null, "Go back response our question untill done.", "Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    private static void threeOption() {
        String[] array = {"IDK","Never","Absulutely"};
        int answer = JOptionPane.showOptionDialog(null, "You'r awesome", "secret message", JOptionPane.YES_NO_OPTION, 1, null, array, 0);
        System.out.println(answer);
    }

    private static void practiceLoopGay() {
            boolean stateShow = true;
            int ndChance = 1;
            
            while(stateShow) {
                
            int answer = JOptionPane.showConfirmDialog(null, "Are you gay ?","Question from system ?#>.", JOptionPane.YES_NO_OPTION);
            
            switch(answer) {
                case 0 -> {
                JOptionPane.showMessageDialog(null, "Ahh! that's cringe, I already known that dude.");
                //stateShow = false;
                System.exit(0); // immedetely closed program command. take instead above line cuz it's quickly more than one.
            }
                
                case 1 -> {
                    System.out.println(ndChance);
                    if (ndChance == 1) {
                        JOptionPane.showMessageDialog(null, "Answer a question by the truth... so, again ?","Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Again!","Warning", JOptionPane.WARNING_MESSAGE);
                    }
                    
                    ndChance++;
                  }
                
                case -1 -> {
                    JOptionPane.showMessageDialog(null, "Nahhh. get back!!", "Warning attention", JOptionPane.ERROR_MESSAGE,null);
                    }
                
                }
            }
    }
    
}
