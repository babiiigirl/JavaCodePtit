package J07047_QuanLyKhachSan;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class KhachHang implements Comparable<KhachHang>{
    private String maKH, tenKH, maPhong, ngayDen, ngayDi;
    private Phong phong;
    private String loaiPhong;
    private double tienPhaiTra;

    @Override
    public int compareTo(KhachHang o) {
        try {
            return Long.compare(o.soNgayO(), this.soNgayO());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public KhachHang(int maKH, String tenKH, String maPhong, String ngayDen, String ngayDi) {
        this.maKH = "KH" + String.format("%02d", maKH);
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.loaiPhong = maPhong.charAt(2) + "";
    }

    public long soNgayO() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long den = sdf.parse(ngayDen).getTime(), di = sdf.parse(ngayDi).getTime();
        long ngay = (di - den) / (1000 * 60 * 60 * 24);
        return ngay;
    }

    public double tienPhaiTra() throws ParseException {
        long ngay;
        if (ngayDen.equals(ngayDi)) ngay = 1;
        else ngay = soNgayO();
        double phiDV = phong.getDonGia() * ngay * phong.getPhiPV();
        double tongTien = phiDV + phong.getDonGia() * ngay;
        if (ngay < 10) return tongTien;
        else if (ngay < 20) return tongTien - tongTien * 0.02;
        else if (ngay < 30) return tongTien - tongTien * 0.04;
        else return tongTien - tongTien * 0.06;
    }

    public String toString() {
        try {
            return maKH + " " + tenKH + " " + maPhong + " " + soNgayO() + " " + String.format("%.2f", tienPhaiTra());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
