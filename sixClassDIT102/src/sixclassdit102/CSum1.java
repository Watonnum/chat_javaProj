/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sixclassdit102;

/**
 *
 * @author ipae
 */
public class CSum1 {
    int val1, val2;
    
    public CSum1() {
        val1 = 1;
        val2 = 10;
    }
    
    public CSum1(int start) {
        val1 = start;
        val2 = 10;
    }
    
    public CSum1(int start, int stop) {
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
