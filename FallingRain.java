import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class FallingRain extends Applet {
    String theHeight;
    String theWidth;
    int num_of_drops;
    Drop[] drops;
    int height;
    int width;

    public void init(){
        theHeight = getParameter("NewHeight");
        theWidth = getParameter("NewWidth");
        try {
            height = new Integer(theHeight).intValue();
            width = new Integer(theWidth).intValue();
        } catch (Exception e){
            width = 1000;
            height = 400;
        }
        resize(width, height);

        num_of_drops = 2000;
        drops = new Drop[num_of_drops];

        for(int i = 0; i < drops.length; i++){
            drops[i] = new Drop(width, height);
        }
    }

    public void paint(Graphics g){
        super.paint(g);
        setBackground(new Color(255, 240, 255));
        g.setColor(new Color(80, 20, 50));
        for(int i = 0; i<drops.length; i++) {
            g.fillRect(drops[i].x, drops[i].y, drops[i].getWide(), drops[i].getLength());
            drops[i].fall();
            //drops[i].updateWidth(getWidth());
        }
        repaint();
    }

    public class Drop {
        private int width, height;
        private int x, y, ySpeed;
        private int length;
        private int wide;
        Random r = new Random();

        public Drop(int w, int h){
            width = w; height = h;
            x = r.nextInt(width);
            y = (-5)*(r.nextInt(height));
            wide = r.nextInt(4);
            ySpeed = wide * r.nextInt(3);
            //ySpeed = r.nextInt(3)+1;
            length = 5+r.nextInt(5);
        }
        public void fall(){
            y = y + ySpeed;
            if (y>height){
                y = (-1)*(r.nextInt(height));
            }
        }

        //public void updateWidth(int w){ x = (int)(x*((w*1.0)/width)); }
        public int getLength() {
            return length;
        }
        public int getWide() {
            return wide;
        }
    }
}
