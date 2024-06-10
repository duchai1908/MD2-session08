package btsession08.bt03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        p1.setXY(5,6);
        float[] arr = p1.getXY(p1.getX(), p1.getY());
        System.out.println(p1);
        MovablePoint movablePoint = new MovablePoint(2,3,-1,2);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
