
package chat_javaproj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferReader = null;
        BufferedWriter bufferWriter = null;
        ServerSocket serverSocket = null;
        
        serverSocket = new ServerSocket(1234);
        
        while(true) {
    
            try {
                socket = serverSocket.accept();
                
                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                bufferReader = new BufferedReader(inputStreamReader);
                bufferWriter = new BufferedWriter(outputStreamWriter);
                
                while(true) {
                    String msgFromClient = bufferReader.readLine();
                    
                    System.out.println("Client : " + msgFromClient);
                    
                    bufferWriter.write("MSG Received");
                    bufferWriter.newLine();
                    bufferWriter.flush();
                    
                    if (msgFromClient.equalsIgnoreCase("Bye")) {
                        break;
                    }
                }
                
                socket.close();
                inputStreamReader.close();
                outputStreamWriter.close();
                bufferReader.close();
                bufferWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
}
    }
}
