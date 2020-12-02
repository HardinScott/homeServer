import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        String ipAddress5 = "192.168.1.107";
        String ipAddress24 = "192.168.1.108";
        System.out.println(InetAddress.getByName(ipAddress24).isReachable(2000)
                || InetAddress.getByName(ipAddress5).isReachable(2000));
    }
}
