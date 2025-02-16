/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excerciseoperationcal;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ipae
 */
public class ExcerciseOperationCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperationCalculate_ifElse OP1 = new OperationCalculate_ifElse();
        OperationCalculate_switch OP2 = new OperationCalculate_switch();
        comboBox OP3 = new comboBox();
        radioChoice OP4 = new radioChoice();
        checkBox OP5 = new checkBox();
        checkBox2 OP6 = new checkBox2();
        frmRandom OP7 = new frmRandom();
        randomSumOutput OP8 = new randomSumOutput();
        randomSumOutput2 OP9 = new randomSumOutput2();
        
        
        OP1.setLocation(820,300);
        OP1.setVisible(false);
        
        OP2.setLocation(820,300);
        OP2.setVisible(false);
        
        OP3.setLocation(820,300);
        OP3.setVisible(false);
        
        OP4.setLocation(820,300);
        OP4.setVisible(false);
        
        OP5.setLocation(820,300);
        OP5.setVisible(false);
        
        OP6.setLocation(820,300);
        OP6.setVisible(false);
        
        OP7.setLocation(820,300);
        OP7.setVisible(false);
        
        OP8.setLocation(820,300);
        OP8.setVisible(false);
        
        OP9.setLocation(820,300);
        OP9.setVisible(true);
        
        //popUpCompliment();
    }


    private static void popUpCompliment() {
        Random rnd = new Random();
        String[] compliments = {
            "Excellent", 
            "Amazing", 
            "Outstanding", 
            "Fantastic", 
            "Incredible", 
            "Awesome", 
            "Brilliant", 
            "Remarkable", 
            "Superb", 
            "Impressive"
        };
        
        JOptionPane.showConfirmDialog(null, compliments[rnd.nextInt(compliments.length)], "Compliment", JOptionPane.CLOSED_OPTION);
        
        while (JOptionPane.CLOSED_OPTION == -1) {
        JOptionPane.showConfirmDialog(null, compliments[rnd.nextInt(compliments.length)], "Compliment", JOptionPane.CLOSED_OPTION);
        }
        
    }
    
}
