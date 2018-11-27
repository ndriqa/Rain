import java.awt.*;
import java.util.Random;

public class Drop {
    int width, height;
    int x, y, ySpeed;
    int length;
    int wide;
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

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getLength() {
        return length;
    }
    public int getWide() {
        return wide;
    }
}
