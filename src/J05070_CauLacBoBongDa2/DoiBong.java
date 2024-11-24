package J05070_CauLacBoBongDa2;

public class DoiBong {
    private String ma, ten;
    private int giaVe;

    public DoiBong(String ma, String ten, int giaVe) {
        this.ten = ten;
        this.ma = ma;
        this.giaVe = giaVe;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getGiaVe() {
        return giaVe;
    }
}