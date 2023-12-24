package IPAddressFinder;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPFinder {
    public static void main(String[] args) {
        String host;
        InetAddress ipAddress;
        Scanner s=new Scanner(System.in);

        host=s.nextLine();
        try {
            ipAddress=InetAddress.getByName(host);
            System.out.println(ipAddress.toString());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
        s.close();
    }
}
