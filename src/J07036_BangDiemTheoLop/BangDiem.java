package J07036_BangDiemTheoLop;

public class BangDiem implements Comparable<BangDiem>{
    private String maSV, maMon, diem;
    private SinhVien sinhVien;
    private MonHoc monhoc;

    public BangDiem(String s) {
        this.maSV = s.split("\\s+")[0];
        this.maMon = s.split("\\s+")[1];
        this.diem = s.split("\\s+")[2];
    }

    public MonHoc getMonhoc() {
        return monhoc;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getDiem() {
        return diem;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public void setMonhoc(MonHoc monhoc) {
        this.monhoc = monhoc;
    }

    public String toString(){
        return maSV + " " + sinhVien.getTenSV() + " " + maMon + " " + monhoc.getTenMon() + " " + diem;
    }

    @Override
    public int compareTo(BangDiem o) {
        if(this.maMon.equals(o.maMon)) return this.maSV.compareTo(o.maSV);
        else return this.maMon.compareTo(o.maMon);
    }
}
