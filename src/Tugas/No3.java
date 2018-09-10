package Tugas;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Ardania
 */
public class No3 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress h=InetAddress.getLocalHost();
        System.out.println(h.getHostAddress());
        byte[] ip = h.getAddress();
        for (int i = 1; i < 254; i++) {
            ip[3]=(byte)i;
            InetAddress address = InetAddress.getByAddress(ip);
            if (address.isReachable(1000)) {
                System.out.println(address.getHostName()+"= Connect");
            }else{
                System.out.println(address.getHostAddress()+"= Disconnect");
            }
            
        }
    }
}
