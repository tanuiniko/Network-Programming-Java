package Multithreading.Threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiEchoClient {

    private static InetAddress host;
    private static final int PORT = 1234;

    public static void main(String[] args) {
        try {
            host=InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println("\nHost ID not found!");
            System.exit(1);
        }
        sendMessages();
    }

    public static void sendMessages(){
        Socket socket=null;
        try {
            socket=new Socket(host, PORT);
            Scanner networkInput=new Scanner(socket.getInputStream());
            PrintWriter networkOutput=new PrintWriter(socket.getOutputStream(),true);
            Scanner userInput=new Scanner(System.in);
            String message,response;
            do{
                System.out.println("Enter message (QUIT to exit) :");
                message=userInput.nextLine();
                networkOutput.println(message);
                response=networkInput.nextLine();
                System.out.println("\nSERVER> " + response);
            }while(!message.equals("QUIT"));
            userInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("\nClosing connection...");
                socket.close();
            } catch (IOException e) {
                System.out.println("\nUnable to disconnect!");
                System.exit(1);
            }
        }
    }
    
} 