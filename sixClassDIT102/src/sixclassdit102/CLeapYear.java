/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sixclassdit102;

/**
 *
 * @author ipae
 */
public class CLeapYear {
    
    int year;
    
    public CLeapYear(int y) {
        year = y;
        
    }
    
    String LeapYear() {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return " is leap year.";
        } else {
            return year + " is not leap year.";
        }
    }
}
