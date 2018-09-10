package Tugas;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Ardania
 */
public class No4 {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            NetworkInterface h = NetworkInterface.getByInetAddress(address);
            if (h != null) {
                byte[] mac = h.getHardwareAddress();
                if (mac != null) {
                    System.out.print("MAC address dari interface " + address + " adalah ");
                    for (int i = 0; i < mac.length; i++) {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                } else {
                    System.out.println("address tidak dapat diakses.");
                }
            } else {
                System.out.println("network interface untuk alamat tersebut tidak ditemukan.");
            }
        } catch (UnknownHostException e) {
           
        } catch (SocketException e) {
            
        }
    }

}
