package io.lethalweapon.com;

/**
 * Created by brianabbott on 6/10/16.
 */
public class Triangle {

   private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public int getHighestY() {
        return highestY;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }


    private int highestY;

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }



}
