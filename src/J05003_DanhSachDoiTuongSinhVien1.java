import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.*;

class Student {
    private String id, name, className, birth;
    private double gpa;

    Student() {
        id = name = className = birth = "";
        gpa = 0;
    }

    public Student(int id, String name, String className, String birth, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void chuanHoaNgaySinh() {
        StringBuilder sb = new StringBuilder(birth);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        birth = sb.toString();
    }

    public void chuanHoaTen() {
        String res = "";
        String[] arr = name.split("\\s+");
        for (String x : arr) {
            res += toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) res += toLowerCase(x.charAt(i));
            res += " ";
        }
        name = res.trim();
    }

    public String toString() {
        return id + " " + name + " " + className + " " + birth + " " + String.format("%.2f", gpa);
    }
}

public class J05003_DanhSachDoiTuongSinhVien1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            Student x = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.chuanHoaNgaySinh();
            arr.add(x);
        }
        for (Student x : arr) {
            System.out.println(x);
        }
    }
}
