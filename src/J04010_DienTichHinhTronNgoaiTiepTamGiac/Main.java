package J04010_DienTichHinhTronNgoaiTiepTamGiac;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2), b = p2.distance(p3), c = p3.distance(p1);
            if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
                System.out.println("INVALID");
            }
            else {
                double dienTich = 1 / 4f * sqrt((a + b + c) * (a + b - c) * (-a + b + c) * (a - b + c));
                double r = a * b * c / (dienTich * 4);
                double s = PI * r * r;
                System.out.printf("%.3f\n", s);
            }
        }
    }
}
