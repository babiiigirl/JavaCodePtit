package J05041_SapXepBangTinhCong;

public class NhanVien {
    private String ma, ten, chucVu;
    private int luongNgay, soNgayCong;

    public NhanVien(int ma, String ten, int luongNgay, int soNgayCong, String chucVu) {
        this.ma = "NV" + String.format("%02d", ma);
        this.ten = ten;
        this.chucVu = chucVu;
        this.luongNgay = luongNgay;
        this.soNgayCong = soNgayCong;
    }

    public int luongThang() {
        return luongNgay * soNgayCong;
    }

    public int thuong() {
        if (soNgayCong >= 25) return luongThang()/5;
        else if (soNgayCong >= 22) return luongThang()/10;
        else return 0;
    }

    public int phuCap() {
        if (chucVu.equals("GD")) return 250000;
        else if (chucVu.equals("PGD")) return 200000;
        else if (chucVu.equals("TP")) return 180000;
        else return 150000;
    }

    public int thucLinh() {
        return luongThang() + thuong() + phuCap();
    }

    public String toString() {
        return ma + " " + ten + " " + luongThang() + " " + thuong() + " " + phuCap() + " " + thucLinh();
    }
}
