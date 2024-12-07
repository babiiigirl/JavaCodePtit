package J07034_DanhSachMonHoc;

public class MonHoc {
    private String ma, ten;
    private int soTin;

    public MonHoc(String ma, String ten, int soTin) {
        this.ma = ma;
        this.ten = ten;
        this.soTin = soTin;
    }

    public String getTen() {
        return ten;
    }

    public String toString(){
        return ma + " " + ten + " " + soTin;
    }
}
