package Multithreading.producerConsumerProblem;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ResourceServer{
    private static ServerSocket serverSocket;
    private static final int PORT=1234;

    public static void main(String[] args) {
        try {
            serverSocket=new ServerSocket(PORT);
        } catch (IOException e) {
            System.out.println("\nUnable to set up port!");
            System.exit(1);
        }

        Resource item =new Resource(1);
        Producer producer=new Producer(item);
        producer.start();
        do{
            try {
                Socket client = serverSocket.accept();
                System.out.println("\nNew client accepted.\n");
                ClientThread handler = new ClientThread(client, item);
                handler.start();
            } catch (IOException e) {
                System.out.println(e);
            }
        }while(true);
    }
}