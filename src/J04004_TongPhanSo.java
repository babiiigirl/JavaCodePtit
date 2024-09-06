import java.util.Scanner;

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        PhanSo y = new PhanSo(sc.nextLong(), sc.nextLong());
        x.rutGon(); y.rutGon();
        PhanSo tong = new PhanSo(1, 1);
        tong = tong.tongPhanSo(x, y);
        System.out.println(tong);
    }
}
