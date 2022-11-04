package main;

import java.io.*;
import java.net.Socket;

public class NetWork implements Runnable{

    private Socket socket;
    private String IP;
    private int port;
    BufferedReader in;
    BufferedWriter out;
    Thread thx;

    public NetWork(String IP, int port) throws IOException {
        this.IP = IP;
        this.port = port;
        Socket socket = new Socket(IP,port);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    }
    public void write(String message) throws IOException {
        out.write(message);
        out.flush();
    }

    @Override
    public void run() {
        String message = null;
        while (true){
            try {
                message = String.valueOf(in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(message);
        }
    }
}

