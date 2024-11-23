package J05052_TraCuuDonHang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DonHang> a = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            DonHang x = new DonHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        for (DonHang x : a) System.out.println(x);
    }
}
