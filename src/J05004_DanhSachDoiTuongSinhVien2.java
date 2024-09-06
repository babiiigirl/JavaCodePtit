import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.*;

public class J05004_DanhSachDoiTuongSinhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            Student x = new Student(i, sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.chuanHoaNgaySinh(); x.chuanHoaTen();
            arr.add(x);
        }
        for (Student x : arr) {
            System.out.println(x);
        }
    }
}
