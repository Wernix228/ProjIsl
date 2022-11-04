package netWork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server implements Runnable {

    private ServerSocket serverSocket;
    private Socket socket;
    private int port;
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    Thread thx;
    public static LinkedList<Integer> serverList = new LinkedList<Integer>();

    public Server() throws IOException {

    }

    public Server(Server server, Socket accept) throws IOException {

    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        String value;
        while (true) {

        }
    }
}

