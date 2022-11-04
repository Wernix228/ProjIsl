package main;

import javax.swing.*;

public class Window {

    public static JFrame frame = new JFrame();

    public Window() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setResizable(false);
    }

    public void setSize(int Weight, int Height) {
        frame.setSize(Weight, Height);
        frame.setLocationRelativeTo(null);
    }

}
