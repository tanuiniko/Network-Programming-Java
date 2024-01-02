package Multithreading.Threads;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// Multithreaded Server.
public class MultiEchoServer{
    private static ServerSocket serverSocket;
    private static final int PORT =1234;

    public static void main(String[] args) {
        try {
            serverSocket=new ServerSocket(PORT);
        } catch (IOException e) {
            System.out.println("\nUnable to set up port!");
            System.exit(1);
        }
        do{
            try {
                Socket client=serverSocket.accept();
                System.out.println("\nNew client accepted.\n");
                ClientHandler handler = new ClientHandler(client);
                handler.start();
            } catch (IOException e) {
                System.out.println("\nUnable to connect client!");
                e.printStackTrace();
            }
            
        }while(true);
    }
}

class ClientHandler extends Thread{
    private Socket client;
    private Scanner input;
    private PrintWriter output;

    public ClientHandler(Socket socket){
        client=socket;
        try {
            input=new Scanner(client.getInputStream());
            output=new PrintWriter(client.getOutputStream(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        String received;
        do{
            received=input.nextLine();
            output.println("ECHO: "+ received);
        }while(!received.equals("QUIT"));

        try {
            if(client!=null){
                System.out.println("Closing down connection...");
                client.close();
            }
        } catch (IOException e) {
            System.out.println("Unable to disconnect!");
        }
    }
}