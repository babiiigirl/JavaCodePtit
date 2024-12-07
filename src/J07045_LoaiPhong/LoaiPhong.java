package J07045_LoaiPhong;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String kiHieu, ten;
    private String donGiaNgay;
    private String phiPhucVu;

    public LoaiPhong(String s) {
        String[] words = s.split("\\s+");
        this.kiHieu = words[0];
        this.ten = words[1];
        this.donGiaNgay = words[2];
        this.phiPhucVu = words[3];
    }

    public int compareTo(LoaiPhong x) {
        return this.getTen().compareTo(x.getTen());
    }

    public String getTen() {
        return ten;
    }

    public String toString(){
        return kiHieu + " " + ten + " " + donGiaNgay + " " + phiPhucVu;
    }
}
