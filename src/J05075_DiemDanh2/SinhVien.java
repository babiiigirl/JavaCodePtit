package J05075_DiemDanh2;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private int diemChuyenCan;

    public SinhVien(String ma, String ten, String lop) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
    }

    public String getLop() {
        return lop;
    }

    public String getMa() {
        return ma;
    }

    public void setDiemChuyenCan(int diemChuyenCan) {
        this.diemChuyenCan = diemChuyenCan;
    }

    public String toString(){
        if (diemChuyenCan == 0)
            return ma + " " + ten  + " " + lop + " " + diemChuyenCan + " KDDK";
        else return ma + " " + ten  + " " + lop + " " + diemChuyenCan;
    }
}
