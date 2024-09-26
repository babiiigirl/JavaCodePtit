package J04019_LopTRIANGLE1;

import java.util.Scanner;

import static java.lang.Math.*;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc){
        Point p = new Point(sc.nextDouble(), sc.nextDouble());
        return p;
    }

    public double distance(Point sePoint) {
        return sqrt(pow(this.x - sePoint.x, 2) + pow(this.y - sePoint.y, 2));
    }
}
