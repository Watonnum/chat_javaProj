/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sixclassdit102;

/**
 *
 * @author ipae
 */
public class CSum {
    int val1, val2;
    
    public CSum(int start, int stop) {
        val1 = start;
        val2 = stop;
    }
    
    int showOutput() {
        int sum = 0;
        
        for (int i = val1; i<=val2;i++) {
            sum += i;
        }
        return sum;
    }
}
