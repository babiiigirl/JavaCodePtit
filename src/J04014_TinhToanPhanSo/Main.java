package J04014_TinhToanPhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = a.tongPhanSo(b);
            c = c.tichPhanSo(c);
            System.out.print(c + " ");
            System.out.println(a.tichPhanSo(b.tichPhanSo(c)));
        }
    }
}
