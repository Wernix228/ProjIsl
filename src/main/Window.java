package main;

import javax.swing.*;

public class Window {

    public static JFrame frame = new JFrame();

    public Window(int w, int h){

        frame.setDefaultCloseOperation(3);
        frame.setSize(w,h);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
