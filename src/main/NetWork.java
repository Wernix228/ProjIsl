package main;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class NetWork implements Runnable{

    private Socket socket;
    private String IP;
    private int port;
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    Thread thx;

    public NetWork(String IP, int port) throws IOException {
        this.IP = IP;
        this.port = port;
        Socket socket = new Socket(IP,port);
    }
    public void write() throws IOException {
        Scanner scn = new Scanner(System.in);
        out.write(scn.nextLine());
        out.flush();
    }

    @Override
    public void run() {
        String message = null;
        while (true){
            try {
                message = String.valueOf(in.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}

