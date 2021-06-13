package camt.pinball;

import javax.swing.*;

public class MainTest {
    public static void main(String [] args) {
        JFrame frame = new JFrame("Pinball game");
        BackgroundPanel panel = new BackgroundPanel();
        frame.add(panel);

        panel.addKeyListener(panel);
        panel.setFocusable(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Timer timer = new Timer(1000/32, panel);
        timer.start();
    }
}

