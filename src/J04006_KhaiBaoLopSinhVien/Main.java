package J04006_KhaiBaoLopSinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien("B20DCCN001", sc.nextLine(), sc.next(), sc.next(), sc.nextFloat());
        x.chuanHoa();
        System.out.println(x);
    }
}
