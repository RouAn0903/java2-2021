package com.ro.net;

import java.io.IOException;
import java.net.Socket;

public class Tester {
    public static void main(String[] args) {
        try{
           // Socket socket = new Socket("ptt.cc", 23);
            Socket socket = new Socket("tw.yahoo.com", 80);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
