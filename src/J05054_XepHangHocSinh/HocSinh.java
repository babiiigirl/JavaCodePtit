package J05054_XepHangHocSinh;

public class HocSinh {
    private String ma, ten;
    private double diem;
    private int hang;

    public HocSinh(int ma, String ten, double diem) {
        this.ma = "HS" + String.format("%02d", ma);
        this.ten = ten;
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public double getDiem() {
        return diem;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public String xepLoai(){
        if (diem < 5) return "Yeu";
        else if (diem < 7) return "Trung Binh";
        else if (diem < 9) return "Kha";
        else return "Gioi";
    }

    public String toString(){
        return ma + " " + ten + " " + diem + " " + xepLoai() + " " + hang;
    }
}
