package J05075_DiemDanh2;

public class DiemDanh {
    private String maSV;
    private String diemDanh;

    public DiemDanh(String maSV, String diemDanh) {
        this.maSV = maSV;
        this.diemDanh = diemDanh;
    }

    public String getMaSV() {
        return maSV;
    }

    public int diemChuyenCan(){
        int diem = 10;
        for (char x : diemDanh.toCharArray()){
            if (x == 'v') diem -= 2;
            else if (x == 'm') diem -= 1;
        }
        if (diem <= 0) return 0;
        else return diem;
    }
}
