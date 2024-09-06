import java.util.Scanner;

import static java.lang.Math.*;

class Point {
    private double x, y;

    Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point sePoint) {
        return sqrt(pow(this.x - sePoint.x, 2) + pow(this.y - sePoint.y, 2));
    }

    public double distance(Point a, Point b) {
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }

    public String toString() {
        return x + " " + y;
    }
}

public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f\n", p1.distance(p2));
        }
    }
}
