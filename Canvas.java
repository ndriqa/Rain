import javax.swing.*;
import java.awt.*;

public class Canvas {
    static int width = 1920;
    static int height = 1080;    //16:9 canvas ratio
    public static void main(String[] args){

        int num_of_drops = 5000;

        Drop[] drops = new Drop[num_of_drops];

        for(int i=0; i<drops.length; i++){
            drops[i] = new Drop(width, height);
        }

        JFrame n = new JFrame();
        Panorama p = new Panorama(width, height, drops);

        n.getContentPane().add(p);

        n.setSize(width, height);
        n.setResizable(false);
        n.setTitle("RainDrop");
        n.setBackground(new Color(230, 230, 250));
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n.setVisible(true);
    }
}
