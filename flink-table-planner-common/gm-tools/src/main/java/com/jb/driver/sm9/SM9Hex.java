/**
* @Author: xiezuozhang xiezuozhang@zjipst.com
* @Description: 
* @Date: 2022-06-23 20:26:09
* @LastEditors: xiezuozhang xiezuozhang@zjipst.com
* @LastEditTime: 2022-06-29 17:46:22
*/
package com.jb.driver.sm9;

import java.nio.charset.StandardCharsets;

/**
 * @author zhaojb
 * SM9转换工具
 */
public class SM9Hex {
    private SM9Hex() {
    }

    public static String encodeToString(byte[] data) {
        return encodeToString(data, false);
    }

    public static String encodeToString(byte[] data, boolean isUpperCase) {
        char[] digital = "0123456789abcdef".toCharArray();
        if (isUpperCase) {
            digital = "0123456789ABCDEF".toCharArray();
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < data.length; ++i) {
            int bit = (data[i] & 240) >> 4;
            sb.append(digital[bit]);
            bit = data[i] & 15;
            sb.append(digital[bit]);
        }

        return sb.toString();
    }

    public static byte[] encode(byte[] data) {
        return encodeToString(data).getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] encode(byte[] data, boolean isUpperCase) {
        return encodeToString(data, isUpperCase).getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] decode(String hex) {
        String digital = "0123456789abcdef";
        char[] hex2char = hex.toLowerCase().toCharArray();
        byte[] bytes = new byte[hex.length() / 2];

        for(int i = 0; i < bytes.length; ++i) {
            int temp = digital.indexOf(hex2char[2 * i]) << 4;
            temp += digital.indexOf(hex2char[2 * i + 1]);
            bytes[i] = (byte)(temp & 255);
        }

        return bytes;
    }
}