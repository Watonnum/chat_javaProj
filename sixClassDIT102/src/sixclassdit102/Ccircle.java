/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sixclassdit102;

/**
 *
 * @author ipae
 */
public class Ccircle {
    //variable
    double radius;
    
    //Constructor
    public Ccircle(double r) {
        radius = r;
        
        
    }
    //area method
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    //Circonference method
    double Circonference() {
        return 2 * (Math.PI) * radius;
    }
}
