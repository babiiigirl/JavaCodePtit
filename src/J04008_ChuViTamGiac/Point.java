package J04008_ChuViTamGiac;

import static java.lang.Math.*;

public class Point {
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
