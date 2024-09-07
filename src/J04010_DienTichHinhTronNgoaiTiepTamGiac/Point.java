package J04010_DienTichHinhTronNgoaiTiepTamGiac;

import static java.lang.Math.*;

public class Point {
    private double x, y;

    Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point (Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance (Point sePoint) {
        return sqrt(pow(this.x - sePoint.x, 2) + pow(this.y - sePoint.y, 2));
    }

    public double distance (Point p1, Point p2) {
        return sqrt(pow(p1.x - p2.y, 2) + pow(p1.y - p2.y, 2));
    }

    public String toString() {
        return this.x + " " + this.y;
    }
}
