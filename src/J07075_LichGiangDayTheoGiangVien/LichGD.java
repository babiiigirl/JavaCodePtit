package J07075_LichGiangDayTheoGiangVien;

public class LichGD implements Comparable<LichGD> {
    private String maNhom, maMon, ngayDay, kipHoc, tenGV, phongHoc;
    private MonHoc monHoc;

    public LichGD(int maNhom, String maMon, String ngayDay, String kipHoc, String tenGV, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d", maNhom);
        this.maMon = maMon;
        this.ngayDay = ngayDay;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }

    public void setMonHoc(MonHoc monHoc) {
        this.monHoc = monHoc;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getTenGV() {
        return tenGV;
    }

    public int compareTo(LichGD x){
        if (x.ngayDay.equals(this.ngayDay)){
            if (x.kipHoc.equals(this.kipHoc)) return this.tenGV.compareTo(x.tenGV);
            else return this.kipHoc.compareTo(x.kipHoc);
        }
        else return this.ngayDay.compareTo(x.ngayDay);
    }

    public String toString(){
        return maNhom + " " + monHoc.getTenMon() + " " + ngayDay + " " + kipHoc + " " + phongHoc;
    }
}
