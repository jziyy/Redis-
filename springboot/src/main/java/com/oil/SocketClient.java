package com.oil;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketClient {
    public static String sendBySocket(String text, String ip, int port)
            throws Exception {

        Socket socket = new Socket(ip, port);
        InputStream is = socket.getInputStream();
        BufferedReader in = null;
        in = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), "GBK"));
        String result = "";
        String getLine;
        while ((getLine = in.readLine()) != null) {
            result += getLine;
        }
        in.close();
        System.err.println("result:" + result);
        return result;
    }
}
