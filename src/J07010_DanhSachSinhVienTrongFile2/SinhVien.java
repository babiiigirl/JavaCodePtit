package J07010_DanhSachSinhVienTrongFile2;

import java.text.SimpleDateFormat;

public class SinhVien {
    private String id,  name, className, birth;
    private double gpa;

    public SinhVien(int id, String name, String className, String birth, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }

    public String dateFormat(){
        StringBuilder sb = new StringBuilder(birth);
        if (sb.charAt(1) == '/') sb.insert(0, 0);
        if (sb.charAt(4) == '/') sb.insert(3, 0);
        return sb.toString();
    }

    public String toString() {
        return id + " " + name + " " + className + " " + dateFormat() + " " + String.format("%.2f", gpa);
    }
}
