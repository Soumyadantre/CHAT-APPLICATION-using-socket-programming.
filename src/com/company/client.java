package com.company;

import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            System.out.println("Client established");
            Socket s = new Socket("localhost", 4526);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}