package J05036_TinhGiaBan1;

import static java.lang.Math.round;

public class MatHang {
    private String ma, ten, donViTinh;
    private int donGiaNhap, soLuong;

    public MatHang(int i, String ten, String donViTinh, int donGiaNhap, int soLuong) {
        this.ma = "MH" + String.format("%02d", i);
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.donGiaNhap = donGiaNhap;
        this.soLuong = soLuong;
    }

    public double phiVanChuyen() {
        return (double)(donGiaNhap * soLuong) * 0.05;
    }

    public double thanhTien() {
        return (double) donGiaNhap * soLuong + phiVanChuyen();
    }

    public double giaBan() {
        return thanhTien() + 0.02 * thanhTien();
    }

    public String toString() {
        return ma + " " + ten + " " + donViTinh + " " + round(phiVanChuyen()) + " " + round(thanhTien()) + " " + round(giaBan());
    }
}
