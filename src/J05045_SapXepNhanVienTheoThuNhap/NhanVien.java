package J05045_SapXepNhanVienTheoThuNhap;

import static java.lang.Math.round;

public class NhanVien {
    private String ma, ten, chucVu;
    private int luongCoBan, soNgayCong;

    public NhanVien(int ma, String ten, String chucVu, int luongCoBan, int soNgayCong) {
        this.ma = "NV" + String.format("%02d", ma);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getMa() {
        return ma;
    }

    public int phuCap() {
        if (chucVu.equals("GD")) return 500;
        else if (chucVu.equals("PGD")) return 400;
        else if (chucVu.equals("TP")) return 300;
        else if (chucVu.equals("KT")) return 250;
        else return 100;
    }

    public int luongChinh() {
        return luongCoBan * soNgayCong;
    }

    public int thuNhap() {
        return luongChinh() + phuCap();
    }

    public int tamUng() {
        double x = (double) thuNhap() * 2 / 3;
        if (x < 25000) return (int) round(x / 1000) * 1000;
        else return 25000;
    }

    public String toString(){
        int conLai = phuCap() + luongChinh() - tamUng();
        return ma + " " + ten + " " + phuCap() + " " + luongChinh() + " " + tamUng() + " " + conLai;
    }
}
