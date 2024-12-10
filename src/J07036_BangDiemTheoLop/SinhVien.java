package J07036_BangDiemTheoLop;

import static java.lang.Character.toUpperCase;

public class SinhVien {
    private String  maSV, tenSV, lop, email;

    public SinhVien(String maSV, String tenSV, String lop, String email) {
        this.maSV = maSV;
        this.tenSV = "";
        String[] s = tenSV.toLowerCase().trim().split("\\s+");
        for (String x : s){
            this.tenSV += toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        this.tenSV = this.tenSV.trim();
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLop() {
        return lop;
    }

}
