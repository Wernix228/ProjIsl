package com.server;

import java.net.*;
import java.io.*;
import java.util.ArrayList;

public class Server extends Thread {

    private final ServerSocket serverSocket = new ServerSocket(4040,10000);
    private Socket socket;
    BufferedReader reader;
    Writer writer;
    String message;
    Thread thread;

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.thread.start();
        server.start();
    }

    public Server() throws IOException {
        thread = new Thread(this);
        socket = serverSocket.accept();
        reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

    }

    public void run() {
        while (!socket.isClosed()){
            try {
                sendMessage();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    reader.close();
                    writer.close();
                    socket.close();
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void connection(String address){

    }

    public synchronized void sendMessage() throws IOException {
        if(reader.ready()) {
            message = reader.readLine();
            writer.write(message);
            writer.flush();
        }
    }

    public synchronized void disconnect(){

    }

    public synchronized void onException(){

    }

}
