package com.jason798.net;

/**
 * IP utils
 * @author JasonLiu798
 * @date 2015/12/29 17:30
 */
public class IPUtil {

    /**
     * ip 2 long
     * @param ip
     * @return
     */
    public static long ip2Long(String ip) {
        String[] ipAdress = ip.split("\\.");
        long ipLong = 16777216L * Integer.parseInt(ipAdress[0]) + 65536 * Integer.parseInt(ipAdress[1]) + 256 * Integer.parseInt(ipAdress[2]) + Integer.parseInt(ipAdress[3]);
        return ipLong;
    }

    /**
     * long 2 ip
     * @param ip
     * @return
     */
    public static String long2ip(long ip) {
        long mask = 0xFF;
        long ip1 = ip & mask;// 0~7
        long ip2 = (ip >> 8) & mask;// 8~15
        long ip3 = (ip >> 16) & mask;// 16~23
        long ip4 = (ip >> 24) & mask;// 24~31
        String ips = new StringBuffer().append(ip4).append(".").append(ip3).append(".").append(ip2).append(".").append(ip1).toString();
        return ips;
    }



}
