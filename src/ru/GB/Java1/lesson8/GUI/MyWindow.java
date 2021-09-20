package ru.GB.Java1.lesson8.GUI;
import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{
    public MyWindow() {
        setTitle("Java test window");
        setBounds(600,300,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        JButton jb1 = new JButton("Button center");
//        JButton jb2 = new JButton("Button 2");
//        add(jb1, BorderLayout.CENTER);
//        add(jb2, BorderLayout.NORTH);
setLayout(new GridLayout(1,2));

        JPanel jpLeft = new JPanel();
        JPanel jpRight = new JPanel();

        jpLeft.setBackground(Color.GRAY);
        add(jpLeft);

        jpRight.setBackground(Color.BLUE);
        add(jpRight);


        setVisible(true);
    }
}
