package J07018_ChuanHoaDanhSachSinhVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Character.toUpperCase;

public class SinhVien {
    private String ma, ten, lop;
    private double gpa;
    private String ngaySinh;

    public SinhVien(int ma, String ten, String lop, String ngaySinh, double gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date ngay = sdf.parse(ngaySinh);
        this.ngaySinh = sdf.format(ngay).toString();
    }

    public String chuanHoaTen(){
        String s[] = ten.toLowerCase().split("\\s+");
        String res = "";
        for (String x : s){
            res += toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) res += x.charAt(i);
            res += " ";
        }
        return res.trim();
    }

    public String toString(){
        return ma + " " + chuanHoaTen() + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
