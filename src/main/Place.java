package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Place extends JButton {

    private static int turn=1;//0=нолик 1=крестик
    public Place(int x, int y) {
        setLocation(x, y);
        setSize(200, 200);
        setVisible(true);
        setFont(new Font("Arial", Font.PLAIN, 40));
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(turn==1){
                    setText("X");
                    turn=0;
                }else if(turn==0){
                    setText("O");
                    turn=1;
                }
            }
        });
    }

}
