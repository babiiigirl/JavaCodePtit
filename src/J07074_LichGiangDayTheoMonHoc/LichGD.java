package J07074_LichGiangDayTheoMonHoc;

public class LichGD implements Comparable<LichGD> {
    private String maNhom, maMon, ngayDay, kipHoc, tenGV, phongHoc;

    public LichGD(int maNhom, String maMon, String ngayDay, String kipHoc, String tenGV, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d", maNhom);
        this.maMon = maMon;
        this.ngayDay = ngayDay;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }

    public String getMaMon() {
        return maMon;
    }

    public int compareTo(LichGD x){
        if (x.ngayDay.equals(this.ngayDay)){
            if (x.kipHoc.equals(this.kipHoc)) return this.tenGV.compareTo(x.tenGV);
            else return this.kipHoc.compareTo(x.kipHoc);
        }
        else return this.ngayDay.compareTo(x.ngayDay);
    }

    public String toString(){
        return maNhom + " " + ngayDay + " " + kipHoc + " " + tenGV + " " + phongHoc;
    }
}
