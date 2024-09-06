package J05010_SapXepDanhSachMatHang;

public class Product {
    private int ma;
    private String ten, nhom;
    private double giaMua, giaBan;

    public Product(int ma, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan());
    }
}
