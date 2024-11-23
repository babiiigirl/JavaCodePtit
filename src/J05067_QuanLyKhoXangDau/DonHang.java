package J05067_QuanLyKhoXangDau;

public class DonHang {
    private String maDonHang;
    private long soLuong;
    private long donGia, thanhTien, tienThue;
    private double thue;
    private String hangSX;

    public DonHang(String maDonHang, long soLuong) {
        this.maDonHang = maDonHang;
        this.soLuong = soLuong;
    }

    public void thongTinMaDonHang(){
        char ma = maDonHang.charAt(0);
        if(ma == 'X') {
            donGia = 128000;
            thue = 0.03;
        }
        else if (ma == 'D'){
            donGia = 11200;
            thue = 0.035;
        }
        else if (ma == 'N'){
            donGia = 9700;
            thue = 0.02;
        }

        String maSX = "" + maDonHang.charAt(3) + maDonHang.charAt(4);
        if (maSX.equals("BP")) hangSX = "British Petro";
        else if (maSX.equals("ES")) hangSX = "Esso";
        else if (maSX.equals("SH")) hangSX = "Shell";
        else if (maSX.equals("CA")) hangSX = "Castrol";
        else if (maSX.equals("MO")) hangSX = "Mobil";
        else hangSX = "Trong Nuoc";

        if (maSX.equals("TN")) thue = 0;

        thanhTien = (long) (donGia * soLuong * thue) + donGia * soLuong;
        tienThue = (long) (donGia * soLuong * thue);
    }

    public String toString(){
        return maDonHang + " " + hangSX + " " + donGia + " " + tienThue + " " + thanhTien;
    }
}
