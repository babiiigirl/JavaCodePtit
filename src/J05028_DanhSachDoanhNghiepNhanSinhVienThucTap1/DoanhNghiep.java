package J05028_DanhSachDoanhNghiepNhanSinhVienThucTap1;

public class DoanhNghiep {
    private String ma, ten;
    private int soSinhVien;

    public DoanhNghiep(String ma, String ten, int soSinhVien) {
        this.ma = ma;
        this.ten = ten;
        this.soSinhVien = soSinhVien;
    }

    public String getMa() {
        return ma;
    }

    public int getSoSinhVien() {
        return soSinhVien;
    }

    public String toString() {
        return ma + " " + ten + " " + soSinhVien;
    }
}
