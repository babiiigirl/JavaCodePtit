package J05049_LietKeNhapXuatHangTheoNhom;

import static java.lang.Math.round;

public class MaHang {
    private String ma;
    private int soLuongNhap, soLuongXuat;

    public MaHang(String ma, int soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
    }

    public String getMa() {
        return ma;
    }

    public int getSoLuongXuat() {
        if (ma.charAt(0) == 'A') {
            double xuat = (double) soLuongNhap * 0.6;
            return (int) round(xuat);
        }
        else {
            double xuat = (double) soLuongNhap * 0.7;
            return (int) round(xuat);
        }
    }

    public int donGia() {
        if(ma.charAt(ma.length() - 1) == 'Y') return 110000;
        else return 135000;
    }

    public int tien() {
        return getSoLuongXuat() * donGia();
    }

    public int thue() {
        if (ma.charAt(0) == 'A') {
            if (ma.charAt(ma.length() - 1) == 'Y') return (int) (tien() * 0.08);
            else return (int) (tien() * 0.11);
        }
        else {
            if (ma.charAt(ma.length() - 1) == 'Y') return (int) (tien() * 0.17);
            else return (int) (tien() * 0.22);
        }
    }

    public String toString() {
        return ma + " " + soLuongNhap + " " + getSoLuongXuat() + " " + donGia() + " " + tien() + " " + thue();
    }
}
