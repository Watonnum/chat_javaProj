/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_javaproj.Components;

import javax.swing.JLabel;
import org.json.JSONObject;

/**
 *
 * @author ipae
 */
public class fetchAPI {
    
    public fetchAPI() throws Exception {
    }

    public void call(String res, JLabel lbContry1,JLabel lbContry2,JLabel lbContry3,JLabel lbContry4,JLabel lbContry5,JLabel lbContry6,JLabel lbContry7,JLabel lbContry8,JLabel lbContry9,JLabel lbPrice1,JLabel lbPrice2,JLabel lbPrice3,JLabel lbPrice4,JLabel lbPrice5,JLabel lbPrice6,JLabel lbPrice7,JLabel lbPrice8,JLabel lbPrice9) {
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

      
}
