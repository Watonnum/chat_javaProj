/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chat_javaproj;

/**
 *
 * @author ipae
 */
public class Chat_javaProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       logIn login = new logIn();
       
       Client cli = new Client();
       Server sv = new Server();
       
       
       login.setVisible(false);
       login.setLocationRelativeTo(null);
    }
    
}
