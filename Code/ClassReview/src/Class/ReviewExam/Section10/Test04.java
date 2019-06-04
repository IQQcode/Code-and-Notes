package Class.ReviewExam.Section10;

import java.util.Scanner;
import java.util.ArrayList;

class MyPoint {
    private double x,y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) +
                Math.pow(this.y - p.y, 2));
    }

    public double diatance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) +
                Math.pow(this.y - y, 2));
    }
}

public class Test04 {
    public static void main(String agrs[]) {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10,30.5);
        System.out.println("p1到p2的距离为： " + p1.distance(p2));
    }
}

