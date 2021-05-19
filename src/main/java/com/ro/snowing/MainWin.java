package com.ro.snowing;

import javax.swing.*;
import java.awt.*;

public class MainWin {
    public static void main(String[] args) {
        JFrame fram =  new JFrame();
        fram.setSize(600,400);
        fram.setLocation(100,300);
        JButton button1 =new JButton("Hello");
        JButton button2 =new JButton("Hello");
        JButton button3 =new JButton("Hello");
        JButton button4 =new JButton("Hello");
        JButton button5 =new JButton("Hello");
        fram.add(button1, BorderLayout.NORTH);
        fram.add(button2, BorderLayout.SOUTH);
        fram.add(button3, BorderLayout.EAST);
        fram.add(button4, BorderLayout.WEST);
        fram.add(button5, BorderLayout.CENTER);
        fram.setVisible(true);
    }

}
