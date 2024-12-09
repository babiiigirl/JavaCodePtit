package J07025_DanhSachKhachHangTrongFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Character.toUpperCase;

public class KhachHang implements Comparable<KhachHang>{
    private String ma, ten, gioiTinh, ngaySinh, diaChi;
    private Date ngaySinhFormat;

    public KhachHang(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", ma);
        this.ten = ten.trim();
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinhFormat = sdf.parse(ngaySinh);
        this.ngaySinh = sdf.format(ngaySinhFormat).toString();
    }

    public String chuanHoaTen(){
        String[] s = ten.toLowerCase().split("\\s+");
        String res = "";
        for (String x : s) res += toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        return res.trim();
    }

    public int compareTo(KhachHang x) {
        return this.ngaySinhFormat.compareTo(x.ngaySinhFormat);
    }

    @Override
    public String toString() {
        return ma + " " + chuanHoaTen() + " " + gioiTinh + " " + diaChi + " " + ngaySinh;
    }
}
