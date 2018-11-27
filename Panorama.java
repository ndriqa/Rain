import javax.swing.*;
import java.awt.*;

public class Panorama extends JPanel {
    int width, height;
    Drop[] drops;

    public Panorama(int w, int h, Drop[] d){
        drops = d;
        width = w;
        height = h;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(130, 50, 170));
        for(int i = 0; i<drops.length; i++) {
            //g.drawLine(drops[i].x, drops[i].y, drops[i].x, drops[i].y + drops[i].getLength());
            g.fillRect(drops[i].x, drops[i].y, drops[i].getWide(), drops[i].getLength());
            drops[i].fall();
        }
        repaint();
    }
}
