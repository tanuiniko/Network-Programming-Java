package socketProgramming.TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPEchoServer{
    private static ServerSocket serverSocket;
    private static final int port =1024;
    
    public static void main(String[] args) {
        System.err.println("OPENING PORT...\n");
        try {
            serverSocket=new ServerSocket(port);
        } catch (IOException e) {
            System.err.println("Unable to attach to port.");
            System.exit(1);
        }
        do{
            handleClient();
        }while(true);
    }

    private static void handleClient(){
        Socket link = null;
        try {
            link=serverSocket.accept();
            Scanner input = new Scanner(link.getInputStream());
            PrintWriter output = new PrintWriter(link.getOutputStream(),true);
            int numMessages = 0;
            String message = input.nextLine();
            while(!message.equals("***CLOSE***")){
                System.out.println("Message received.");
                numMessages++;
                output.println("Message " + numMessages + ": "+message);
                message=input.nextLine();
            }
            output.println(numMessages+" messages received.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\n* Closing connection... *");
                link.close();
            } catch (IOException e) {
                System.out.println("Unable to disconnect.");
                System.exit(1);
            }
        }
    }
}