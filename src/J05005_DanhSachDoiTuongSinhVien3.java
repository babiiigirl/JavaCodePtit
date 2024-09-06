import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05005_DanhSachDoiTuongSinhVien3 {
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
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() < o2.getGpa()) return 1;
                else return -1;
            }
        });
        for (Student x : arr) {
            System.out.println(x);
        }
    }
}
