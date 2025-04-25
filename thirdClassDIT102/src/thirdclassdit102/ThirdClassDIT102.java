/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thirdclassdit102;

/**
 *
 * @author ipae
 */
public class ThirdClassDIT102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        randomChar OP1 = new randomChar();
        randomLowerUpperCase OP2 = new randomLowerUpperCase();
        threeChoice OP3 = new threeChoice();
        checkBoxChoice OP4 = new checkBoxChoice();
        
        OP1.setLocation(820,300);
        OP1.setVisible(false);
        
        OP2.setLocation(820,300);
        OP2.setVisible(false);
        
        OP3.setLocation(820,300);
        OP3.setVisible(true);
        
        OP4.setLocation(820,300);
        OP4.setVisible(false);
    }
    
}
