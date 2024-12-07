package J07050_SapXepMatHang;

public class MatHang implements Comparable<MatHang>{
    private String ma, ten, nhom;
    private double giaMua, giaBan;
    private double loiNhuan;

    public MatHang(int ma, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = "MH" + String.format("%02d", ma);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public int compareTo(MatHang x) {
        return Double.compare(x.loiNhuan, this.loiNhuan);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan);
    }
}
