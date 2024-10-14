package J05081_DanhSachMatHang;

public class MatHang {
    private String ma, ten, donVi;
    private int giaMua, giaBan;

    public MatHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public int loiNhuan() {
        return giaBan - giaMua;
    }

    public String toString() {
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan();
    }
}
