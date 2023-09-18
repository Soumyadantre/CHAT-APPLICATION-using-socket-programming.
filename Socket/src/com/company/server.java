package com.company;

import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args){
         try {
            System.out.println("Waiting for client");
            ServerSocket ss = new ServerSocket(4526);
            Socket soc = ss.accept();
            System.out.println("Connection Established");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
