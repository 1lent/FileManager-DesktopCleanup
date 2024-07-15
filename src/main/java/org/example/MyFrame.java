package org.example;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    public void myFrameGui() {
        new MyFrame();

        FileManager fileman = new FileManager();
        button = new JButton();

        button.setText("Start");
        button.setBounds(100, 100, 250, 100);

        button.setFocusable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        button.addActionListener(this);
        setFocusable(false);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setBackground(Color.GRAY);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("THE IF STATEMENT HASNT FUCKING RUN YET");
        System.out.println(button);
        if (e.getSource()==button) {
            FileManager fileman = new FileManager();
            FileManager.main();
            System.out.println("hi");
        }
    }
}



