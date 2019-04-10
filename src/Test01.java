import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Package: PACKAGE_NAME
 * Description：
 * Author: 范佳
 * Date: Created in 2019/3/16 12:11
 * Company: yusys
 * Copyright: Copyright (c) 2019
 * Version: 0.0.1
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getLocalHost();
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
