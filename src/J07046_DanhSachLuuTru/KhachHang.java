package J07046_DanhSachLuuTru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang> {
    private String ma, ten, maPhong;
    private String ngayDen, ngayDi;
    private long soNgayLuuTru;

    public KhachHang(int ma, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = "KH" + String.format("%02d", ma);
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date den = sdf.parse(ngayDen);
        Date di = sdf.parse(ngayDi);
        long time = di.getTime() - den.getTime();
        this.soNgayLuuTru = time / (1000 * 60 * 60 * 24);
        if (this.soNgayLuuTru <= 0) this.soNgayLuuTru = 0;
    }

    public int compareTo(KhachHang x){
        return Long.compare(x.soNgayLuuTru, this.soNgayLuuTru);
    }

    public String toString() {
        return ma + " " + ten + " " + maPhong + " " + soNgayLuuTru;
    }
}
