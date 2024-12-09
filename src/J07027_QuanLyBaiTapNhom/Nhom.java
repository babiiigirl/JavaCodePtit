package J07027_QuanLyBaiTapNhom;

public class Nhom implements Comparable<Nhom>{
    private String maSV, sttBTNhom;
    private SinhVien sinhVien;
    private BaiTap baiTap;

    public Nhom(String s) {
        this.maSV = s.split("\\s+")[0];
        this.sttBTNhom = s.split("\\s+")[1];
    }

    public String getMaSV() {
        return maSV;
    }

    public String getSttBTNhom() {
        return sttBTNhom;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public BaiTap getBaiTap() {
        return baiTap;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setBaiTap(BaiTap baiTap) {
        this.baiTap = baiTap;
    }

    public int compareTo(Nhom x){
        return this.maSV.compareTo(x.maSV);
    }

    public String toString(){
        return maSV + " " + sinhVien.getTenSV() + " " + sinhVien.getSdt() + " " + sttBTNhom + " " + baiTap.getTenBT();
    }
}
