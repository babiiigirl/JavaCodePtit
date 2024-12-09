package J07027_QuanLyBaiTapNhom;

public class SinhVien {
    private String maSV, tenSV, sdt;

    public SinhVien(String maSV, String tenSV, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getSdt() {
        return sdt;
    }
}
