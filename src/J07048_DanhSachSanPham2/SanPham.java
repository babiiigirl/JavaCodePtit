package J07048_DanhSachSanPham2;

public class SanPham implements Comparable<SanPham>{
    private String ma, ten;
    private int giaBan, baoHanh;

    public SanPham(String ma, String ten, int giaBan, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public int compareTo(SanPham x) {
        if (this.giaBan == x.giaBan) return this.ma.compareTo(x.ma);
        else return x.giaBan - this.giaBan;
    }

    public String toString(){
        return ma + " " + ten + " " + giaBan + " " + baoHanh;
    }
}
