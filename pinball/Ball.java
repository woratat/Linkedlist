package camt.pinball;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Ball {
    private final BackgroundPanel parent;
    private ImageIcon icon;
    private int x;
    private int y;
    private int speedX;
    private int speedY;

    Ball(BackgroundPanel parent,int id, int x, int y, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.parent = parent;
        loadIm(id);
    }

    private void loadIm(int id){
        URL url = getClass().getResource("images/"+id+".gif");
        if (url != null) {
            icon = new ImageIcon(url);
        }
    }

    public void paint(Graphics g) {
        g.drawImage(icon.getImage(), x, y, null);
    }

    public void update() {
        Image img = icon.getImage();
        x+=speedX;
        if (x<=0 || x>=(parent.getWidth()-img.getWidth(null))) {
            speedX = -speedX;
        }
        y+=speedY;
        if (y<=0 || y>=(parent.getHeight()-img.getHeight(null))) {
            speedY = -speedY;
        }
    }
}
