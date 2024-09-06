package J04007_KhaiBaoLopNhanVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(), sex = sc.nextLine(), birth = sc.nextLine(), address = sc.nextLine();
        String tax = sc.nextLine(), date = sc.nextLine();
        NhanVien x = new NhanVien("00001", name, sex, birth, address, tax, date);
        System.out.println(x);
    }
}
