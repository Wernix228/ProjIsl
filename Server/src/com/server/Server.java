package com.server;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Server extends Thread {
    private ServerSocket serverSocket;
    ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        int port = 5050;
        try {
            Thread t = new Server(port);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while (true) {
            if(list.size() < 2){
                connection((serverSocket.getInetAddress().toString()));
                try {
                    Socket socket = serverSocket.accept();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void connection(String address){
        list.add(address);

    }
    public synchronized void sendMessage(){

    }
    public synchronized void disconnect(){

    }
    public synchronized void onException(){

    }
}
