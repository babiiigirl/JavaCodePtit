package J05036_TinhGiaBan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        for (MatHang x : a) {
            System.out.println(x);
        }
    }
}
