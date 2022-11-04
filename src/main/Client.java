package main;

import ru.geekbrains.network.TCPConnection;
import ru.geekbrains.network.TCPConnectionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

public class Client extends JFrame implements ActionListener, TCPConnectionListener {

    private static final String IP_ADDR = "109.106.140.243";
    private static final int PORT = 8189;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Client();
            }
        });
    }

    private TCPConnection connection;

    private Client(){
        try {
            connection = new TCPConnection(this, "127.0.0.1", PORT);
        }catch (IOException e){
            printMsg("Connection exception:"+ e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = scn.nextLine();
        if(msg.equals("")) return;
        connection.sendString(": " + msg);
    }

    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {
        printMsg("Connection ready...");
    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String value) {
        printMsg(value);
    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {
        printMsg("Connection close");
    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {
        printMsg("Connection exception:"+ e);
    }
    private synchronized void printMsg(String Msg){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println(Msg + "\n");
            }
        });
    }
}

