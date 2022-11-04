package main;

import javax.swing.*;

public class Window {

    public static JFrame frame = new JFrame();

    public Window(int w, int h){

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(w,h);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
    public void setSize(int Weight, int Height){
        frame.setSize(Weight,Height);
        frame.setLocationRelativeTo(null);
    }

}
