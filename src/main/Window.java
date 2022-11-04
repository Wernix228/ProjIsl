package main;

import javax.swing.*;
import java.awt.*;

public class Window {

    public static JFrame frame = new JFrame();

    public Window(int x, int y) {

        frame.setDefaultCloseOperation(3);
        frame.setSize(new Dimension(x,y));
//        frame.setLocation(null);
        frame.setVisible(true);

    }

}
