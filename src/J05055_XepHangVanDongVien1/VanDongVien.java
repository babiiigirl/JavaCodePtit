package J05055_XepHangVanDongVien1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VanDongVien {
    private String ma;
    private String ten, ngaySinh, xuatPhat, denDich;
    private long thanhTichThucTe, thanhTichXepHang, uuTien;
    private int hang;

    public VanDongVien(int ma, String ten, String ngaySinh, String xuatPhat, String denDich) {
        this.ma = "VDV" + String.format("%02d", ma);
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.xuatPhat = xuatPhat;
        this.denDich = denDich;
    }

    public String getMa() {
        return ma;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public long thanhTichThucTe() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long start = sdf.parse(xuatPhat).getTime();
        long end = sdf.parse(denDich).getTime();
        return (end - start) / 1000; //chuyen sang giay
    }

    public long uuTien(){
        int namSinh = Integer.parseInt(ngaySinh.split("/")[2]);
        int tuoi = 2021 - namSinh;
        if (tuoi < 18) return 0;
        else if (tuoi < 25) return 1;
        else if (tuoi < 32) return 2;
        else return 3;
    }

    public long thanhTichXepHang() throws Exception {
        return thanhTichThucTe() - uuTien();
    }

    public void tinhToanThoiGian() throws Exception {
        this.uuTien = uuTien();
        this.thanhTichThucTe = thanhTichThucTe();
        this.thanhTichXepHang = thanhTichXepHang();
    }

    public String formatThoiGian(long giay) {
        long h = giay / 3600;
        long m = (giay % 3600) / 60;
        long s = giay % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public String toString(){
        return ma + " " + ten + " " + formatThoiGian(thanhTichThucTe) + " "+ formatThoiGian(uuTien) + " " + formatThoiGian(thanhTichXepHang) + " " + hang;
    }
}
