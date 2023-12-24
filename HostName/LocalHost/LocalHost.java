package LocalHost;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost {

    private static InetAddress local ;
    public static void main(String[] args) {
        try {
            local=InetAddress.getLocalHost();
            System.out.println(local.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
