package J05030_BangDiemThanhPhan1;

public class SinhVien {
    private String id, name, className;
    private float diem1, diem2, diem3;

    public SinhVien(String id, String name, String className, float diem1, float diem2, float diem3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getId() {
        return id;
    }

    public static String formatDiem(float diem) {
        return String.format("%.1f", diem);
    }

    public String toString() {
        return id + " " + name + " " + className + " " + formatDiem(diem1) + " " + formatDiem(diem2) + " " + formatDiem(diem3);
    }
}
