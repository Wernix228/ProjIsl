package com.server;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Server extends Thread {

    private static ServerSocket serverSocket;
    private Socket socket;
    static int port;
    ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public Server(int port) throws IOException {
        socket = serverSocket.accept();
    }

    public void run() {
        while (true) {

        }
    }

    public synchronized void connection(String address) {
        try {
            Thread t = new Server(port);
            t.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.add(address);

    }

    public synchronized void sendMessage() {

    }

    public synchronized void disconnect() {

    }

    public synchronized void onException() {

    }
}
