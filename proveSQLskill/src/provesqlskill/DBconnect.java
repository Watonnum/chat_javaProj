/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provesqlskill;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ipae
 */
public class DBconnect {
    private Connection conn;
    private Statement st;
    private String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
    private String username = "root";
    private String password = "poopae2524";
    
    public ResultSet getConnect(String query) {
        ResultSet rs;
        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch (Exception e) {
            rs = null;
        }
        
        System.out.println("DBconnect.getConnect 's Method log :" + rs);
        return rs;
    }
    
    public boolean execute(String query) {
        boolean rs;
        try {
            conn = DriverManager.getConnection(url);
            st = conn.createStatement();
            st.execute(query);
            rs = true;
        } catch (Exception e) {
            rs = false;
        }
        
        System.out.println("DBconnect.execute 's Method log (true/false) :" + rs);
        return rs;
    }
    
    public void close() {
        try {
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error DBconnect : something went wrong. Please check your private's value Database -> class DBconnect.java","Error Messenger",JOptionPane.ERROR);
        }
        
    }
}
