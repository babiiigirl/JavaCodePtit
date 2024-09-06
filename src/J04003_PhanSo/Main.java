package J04003_PhanSo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo x = new PhanSo(sc.nextLong(), sc.nextLong());
        x.rutGon();
        System.out.println(x);
    }
}
