package J05062_HocBongSinhVien;

public class SinhVien{
    private String ten;
    private double tbc;
    private int drl;
    private String loaiHB;

    public SinhVien(String ten, double tbc, int drl) {
        this.ten = ten;
        this.tbc = tbc;
        this.drl = drl;
        if (tbc >= 3.6 && drl >= 90) this.loaiHB = "XUATSAC";
        else if (tbc >= 3.2 && drl >= 80) this.loaiHB = "GIOI";
        else if (tbc >= 2.5 && drl >= 70) this.loaiHB = "KHA";
        else this.loaiHB = "KHONG";
    }

    public String toString(){
        return ten + ": " + loaiHB;
    }

    public String getTen() {
        return ten;
    }

    public double getTbc() {
        return tbc;
    }

    public int getDrl() {
        return drl;
    }

    public String getLoaiHB() {
        return loaiHB;
    }

    public void setLoaiHB(String loaiHB) {
        this.loaiHB = loaiHB;
    }
}
