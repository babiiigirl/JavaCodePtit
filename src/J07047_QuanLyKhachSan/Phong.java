package J07047_QuanLyKhachSan;

public class Phong {
    private String loaiPhong, tenLP;
    private long donGia;
    private double phiPV;

    public Phong(String phong) {
        String[] s = phong.split("\\s+");
        this.loaiPhong = s[0];
        this.tenLP = s[1];
        this.donGia = Long.parseLong(s[2]);
        this.phiPV = Double.parseDouble(s[3]);
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public String getTenLP() {
        return tenLP;
    }

    public long getDonGia() {
        return donGia;
    }

    public double getPhiPV() {
        return phiPV;
    }
}
