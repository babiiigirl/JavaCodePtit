package J07051_TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static java.lang.Character.*;

public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, soPhong, ngayNhanPhong, ngayTraPhong;
    private int tienDichVu;
    private long soNgayO;
    private int tongTien;

    public KhachHang(int ma, String ten, String soPhong, String ngayNhanPhong, String ngayTraPhong, int tienDichVu) throws ParseException {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten;
        this.soPhong = soPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.ngayTraPhong = ngayTraPhong;
        this.tienDichVu = tienDichVu;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long nhan = sdf.parse(ngayNhanPhong).getTime(), tra = sdf.parse(ngayTraPhong).getTime();
        this.soNgayO = (tra - nhan) / (1000 * 60 * 60 * 24) + 1;

        this.tongTien = donGiaTheoTang() * (int)this.soNgayO + this.tienDichVu;
    }

    public String chuanHoaTen(){
        String[] s = this.ten.toLowerCase().split("\\s+");
        String ten = "";
        for (String x : s) {
            ten += toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++)
                ten += x.charAt(i);
            ten += " ";
        }
        return ten.trim();
    }

    public int tang() {
        char x = soPhong.charAt(0);
        return (x - '0');
    }

    public int donGiaTheoTang() {
        int tang = tang();
        if (tang == 1) return 25;
        else if (tang == 2) return 34;
        else if (tang == 3) return 50;
        else return 80;
    }

    public int compareTo(KhachHang x){
        return x.tongTien - this.tongTien;
    }

    public String toString(){
        return ma + " " + chuanHoaTen() + " " + soPhong + " " + soNgayO + " " + tongTien;
    }
}
