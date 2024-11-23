package J05057_BangDiemTuyenSinh;

public class ThiSinh {
    private String id, name;
    private double toan, ly, hoa;

    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double diemUutien() {
        char khuVuc = id.charAt(2);
        if (khuVuc == '1') return 0.5;
        else if (khuVuc == '2') return 1.0;
        else return 2.5;
    }

    public double tongDiem() {
        return toan * 2 + ly + hoa;
    }

    public String trangThai() {
        if (tongDiem() + diemUutien() >= 24) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    public String format(double diem) {
        if (diem == (int)diem) return (int)diem + " ";
        else return String.format("%.1f", diem) + " ";
    }

    public String toString(){
        return id + " " + name + " " + format(diemUutien()) + format(tongDiem()) + trangThai();
    }
}
