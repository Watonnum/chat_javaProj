/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_javaproj.Components;

import java.text.DecimalFormat;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.json.JSONObject;

/**
 *
 * @author ipae
 */
public class fetchAPI {
    
    public fetchAPI() throws Exception {
    }

    public void call(String res,JLabel lbContry1,JLabel lbContry2,JLabel lbContry3,JLabel lbContry4,JLabel lbContry5,JLabel lbContry6,JLabel lbContry7,JLabel lbContry8,JLabel lbContry9,JLabel lbPrice1,JLabel lbPrice2,JLabel lbPrice3,JLabel lbPrice4,JLabel lbPrice5,JLabel lbPrice6,JLabel lbPrice7,JLabel lbPrice8,JLabel lbPrice9) {
        JSONObject json = new JSONObject(res);
        
        // ตรวจสอบว่า API ส่งข้อมูลมาได้จริง
        if (!json.getBoolean("success")) {
            System.out.println("API Error: ไม่สามารถดึงข้อมูลได้");
            return;
        }

        JSONObject quotes = json.getJSONObject("quotes");
        

        double USDAUD = quotes.getDouble("USDAUD");
        lbContry1.setText(USDAUD+"");
        lbPrice1.setText("1 USD = " + USDAUD + " AUD");
        
        double USDCAD = quotes.getDouble("USDCAD");
        lbContry2.setText(USDCAD+"");
        lbPrice2.setText("1 USD = " + USDCAD + " CAD");
        
        double USDJPY = quotes.getDouble("USDJPY");
        lbContry3.setText(USDJPY+"");
        lbPrice3.setText("1 USD = " + USDJPY + " JPY");
        
        double USDINR = quotes.getDouble("USDINR");
        lbContry4.setText(USDINR+"");
        lbPrice4.setText("1 USD = " + USDINR + " INR");
        
        double USDKRW = quotes.getDouble("USDKRW");
        lbContry5.setText(USDKRW+"");
        lbPrice5.setText("1 USD = " + USDKRW + " KRW");
        
        double USDSGD = quotes.getDouble("USDSGD");
        lbContry6.setText(USDSGD+"");
        lbPrice6.setText("1 USD = " + USDSGD + " SGD");
        
        double USDTHB = quotes.getDouble("USDTHB");
        lbContry7.setText(USDTHB+"");
        lbPrice7.setText("1 USD = " + USDTHB + " THB");
        
        double USDBRL = quotes.getDouble("USDBRL");
        lbContry8.setText(USDBRL+"");
        lbPrice8.setText("1 USD = " + USDBRL + " BRL");
        
        double USDEUR = quotes.getDouble("USDEUR");
        lbContry9.setText(USDEUR+"");
        lbPrice9.setText("1 USD = " + USDEUR + " EUR");
        
    }

    public void changesFrom(String res, JComboBox User_cb1st, JComboBox User_cb2nd, JTextField User_txtUserInput,JLabel User_lbOutput,String contry) {
        JSONObject json = new JSONObject(res);
        
        // ตรวจสอบว่า API ส่งข้อมูลมาได้จริง
        if (!json.getBoolean("success")) {
            System.out.println("API Error: ไม่สามารถดึงข้อมูลได้");
            return;
        }

        double result = json.getDouble("result");
        System.out.println(result);
        
        User_lbOutput.setText(result + " " + contry);
    }
    //apiShoot
    
    public void changes(String res, JComboBox User_cb1st, JComboBox User_cb2nd, JTextField User_txtUserInput,JLabel User_lbOutput, String contry1, String contry2) {
        JSONObject json = new JSONObject(res);
        DecimalFormat f = new DecimalFormat("#,##0.00");
        
        // ตรวจสอบว่า API ส่งข้อมูลมาได้จริง
        if (!json.getBoolean("success")) {
            System.out.println("API Error: ไม่สามารถดึงข้อมูลได้");
            return;
        }

        JSONObject quotes = json.getJSONObject("quotes");
        

        double answer1 = quotes.getDouble("USD" + contry1);
        double answer2 = quotes.getDouble("USD" + contry2);
        double UserInput = Double.parseDouble(User_txtUserInput.getText());
        
        double temp = UserInput / answer1;
        double result = temp * answer2;
        
        User_lbOutput.setText(f.format(result) + " " + contry2);
    }
    //non-apiShoot
}
