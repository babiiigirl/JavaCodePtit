package J05052_TraCuuDonHang;

public class DonHang {
    private String ten, ma;
    private int donGia, soLuong;

    public DonHang(String ten, String ma, int donGia, int soLuong) {
        this.ten = ten;
        this.ma = ma;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int giamGia(){
        if (ma.charAt(ma.length() - 1) == '1') return  (int) (0.5 * donGia * soLuong);
        else return (int) (0.3 * donGia * soLuong);
    }

    public String soThuTu() {
        String stt = "";
        for (int i = 1; i < ma.length() - 1; i++) {
            stt += ma.charAt(i);
        }
        return stt;
    }

    public int thanhTien(){
        return donGia * soLuong - giamGia();
    }

    public String toString(){
        return ten + " " + ma + " " + soThuTu() + " " + giamGia() + " " + thanhTien();
    }
}
