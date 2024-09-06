package J04008_ChuViTamGiac;

import java.util.Scanner;

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
                System.out.printf("%.3f", a + b + c);
                System.out.println();
            }
        }
    }
}
