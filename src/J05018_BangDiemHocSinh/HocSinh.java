package J05018_BangDiemHocSinh;

public class HocSinh {
    private String ma;
    private String ten;
    private double[] diem;

    public HocSinh(int ma, String ten, double[] diem) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diem = new double[10];
        for (int i = 0; i < 10; i++)
            this.diem[i] = diem[i];
    }

    public String getMa() {
        return ma;
    }

    public double diemTrungBinh() {
        double res = 0;
        for (int i = 0; i < 10; i++){
            if (i == 0 || i == 1) res += (diem[i] * 2);
            else res += diem[i];
        }
        return (Math.round(res/ 12 * 10.0)/10.0);
    }

    public String xepLoai() {
        if (diemTrungBinh() >= 9) return "XUAT SAC";
        else if (diemTrungBinh() >= 8 && diemTrungBinh() <= 8.9) return "GIOI";
        else if (diemTrungBinh() >= 7 && diemTrungBinh() <= 7.9) return "KHA";
        else if (diemTrungBinh() >= 5 && diemTrungBinh() <= 6.9) return "TB";
        else return "YEU";
    }

    public String toString() {
        return ma + " " + ten + " " + diemTrungBinh() + " " + xepLoai();
    }
}
