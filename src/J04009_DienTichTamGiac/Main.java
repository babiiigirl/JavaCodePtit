package J04009_DienTichTamGiac;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2), b = p2.distance(p3), c = p3.distance(p1);
            //System.out.println(a + " " + b + " " + c);
            if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
                System.out.println("INVALID");
            }
            else {
                double dienTich = sqrt((a + b + c) * (a + b - c) * (-a + b + c) * (a - b + c)) * 1 / 4;
                System.out.printf("%.2f", dienTich);
                System.out.println();
            }
        }
    }
}
