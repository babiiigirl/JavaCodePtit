package J05003_DanhSachDoiTuongSinhVien1;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class SinhVien {
    private String id, name, className, birth;
    private double gpa;

    SinhVien() {
        id = name = className = birth = "";
        gpa = 0;
    }

    public SinhVien(int id, String name, String className, String birth, double gpa) {
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
