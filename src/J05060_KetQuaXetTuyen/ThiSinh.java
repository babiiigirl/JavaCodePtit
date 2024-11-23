package J05060_KetQuaXetTuyen;

import static java.lang.Math.round;

public class ThiSinh {
    private String ma, ten, ngaySinh;
    private double lyThuyet, thucHanh;

    public ThiSinh(int ma, String ten, String ngaySinh, double lyThuyet, double thucHanh) {
        this.ma = "PH" + String.format("%02d", ma);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
    }

    public double diemThuong(){
        if (lyThuyet >= 8 && thucHanh >= 8) return 1;
        else if (lyThuyet >= 7.5 && thucHanh >= 7.5) return 0.5;
        else return 0;
    }

    public int tuoi(){
        return 2021 - Integer.parseInt(ngaySinh.split("/")[2]);
    }

    public int diemTrungBinh(){
        int dtb = (int) round((lyThuyet + thucHanh)/2 + diemThuong());
        if (dtb >= 10) return 10;
        else return dtb;
    }

    public String xepLoai(){
        if (diemTrungBinh() < 5) return "Truot";
        else if (diemTrungBinh() <= 6) return "Trung binh";
        else if (diemTrungBinh() == 7) return "Kha";
        else if (diemTrungBinh() == 8) return "Gioi";
        else return "Xuat sac";
    }

    public String toString(){
        return ma + " " + ten + " " + tuoi() + " " + diemTrungBinh() + " " + xepLoai();
    }
}
