import java.util.Scanner;

class NhanVien {
    private String id, name, sex, birth, address, tax, date;

    public NhanVien(String id, String name, String sex, String birth, String address, String tax, String date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }

    public String toString() {
        return id + " " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + date;
    }
}

public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(), sex = sc.nextLine(), birth = sc.nextLine(), address = sc.nextLine();
        String tax = sc.nextLine(), date = sc.nextLine();
        NhanVien x = new NhanVien("00001", name, sex, birth, address, tax, date);
        System.out.println(x);
    }
}
