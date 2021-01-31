package com.GymxPro;

import javax.swing.*;
import java.awt.*;

public class GymxPro  extends JFrame{
    private JPanel panel1;
    private JButton button,button2;
    GymxPro()
    {

        button=new JButton("Click me");
        button2=new JButton("Click me 2");

        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        add(button);
        add(button2);
    }

    public static void main(String[] args) {
        new GymxPro();
    }
}
