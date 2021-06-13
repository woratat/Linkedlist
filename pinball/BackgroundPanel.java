package camt.pinball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class BackgroundPanel extends JPanel implements ActionListener, KeyListener {
    ArrayList <Ball> balls;

    BackgroundPanel() {
        setPreferredSize(new Dimension(300, 400));
        setBackground(Color.white);
        balls = new ArrayList<>();
    }

    private void addBall(char x){
        Random rand = new Random();
        double xyRate = rand.nextDouble() - 0.5;
        int ySpeed = 5;
        int xSpeed = (int) (ySpeed * xyRate * 2);
        int ballX = rand.nextInt(200) + 20;
        int ballY = rand.nextInt(300) + 20;
        switch (x) {
            case '0' -> balls.add(new Ball(this,0, ballX, ballY, xSpeed, ySpeed));
            case '1' -> balls.add(new StarBlue(this,1, ballX, ballY, xSpeed, ySpeed));
            case '2' -> balls.add(new PinkBall(this,2, ballX, ballY, xSpeed, ySpeed));
            case '3' -> balls.add(new StarRed(this,3, ballX, ballY, xSpeed, ySpeed));
            case '4' -> balls.add(new BlueBall(this,4, ballX, ballY, xSpeed, ySpeed));
            case '5' -> balls.add(new YellowBall(this,5, ballX, ballY, xSpeed, ySpeed));
        }
    }

    private void removeBall(){
        if(balls.size()>0){
            balls.remove(0);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Ball ball : balls){
            ball.paint(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Ball ball : balls){
            ball.update();
        }
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        char ch = e.getKeyChar();
        System.out.println(e);
        if (ch>='0' && ch<='5') {
            addBall(ch);
        }
        if (e.getKeyCode()==8){
            removeBall();
        }
    }
}
