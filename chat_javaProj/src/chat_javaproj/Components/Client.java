/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat_javaproj.Components;

import java.net.Socket;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ipae
 */
public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferReader = null;
        BufferedWriter bufferWriter = null;
        
        try {
            socket = new Socket("localhost",1234 );
            
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            
            bufferReader = new BufferedReader(inputStreamReader);
            bufferWriter = new BufferedWriter(outputStreamWriter);
            
            Scanner  sc = new Scanner(System.in);
            
            while (true) {
                String msgToSend = sc.nextLine();
                
                bufferWriter.write(msgToSend);
                bufferWriter.newLine();
                bufferWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if(socket != null)
                    socket.close();
                if(inputStreamReader != null)
                    inputStreamReader.close();
                if(outputStreamWriter != null)
                    outputStreamWriter.close();
                if(bufferReader != null)
                    bufferReader.close();
                if(bufferWriter != null)
                    bufferWriter.close();
                    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
