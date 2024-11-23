package J05064_BangThuNhapGiaoVien;

public class GiaoVien {
    private String ma, ten;
    private int luongCoBan;
    private String chucVu;

    public GiaoVien(String ma, String ten, int luongCoBan) {
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public String getChucVu(){
        return ("" + ma.charAt(0) + ma.charAt(1));
    }

    public int phuCap(){
        chucVu = getChucVu();
        if (chucVu.equals("HT")) return 2000000;
        else if (chucVu.equals("HP")) return 900000;
        else return 500000;
    }

    public int heSoBacLuong(){
        return Integer.parseInt("" + ma.charAt(2) + ma.charAt(3));
    }

    public int thuNhap(){
        return luongCoBan * heSoBacLuong() + phuCap();
    }

    public String toString(){
        return ma + " " + ten + " " + heSoBacLuong() + " " + phuCap() + " " + thuNhap();
    }
}
