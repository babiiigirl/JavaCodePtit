package J07027_QuanLyBaiTapNhom;

public class BaiTap {
    private String maBT, tenBT;

    public BaiTap(int maBT, String tenBT) {
        this.maBT = maBT + "";
        this.tenBT = tenBT;
    }

    public String getMaBT() {
        return maBT;
    }

    public String getTenBT() {
        return tenBT;
    }
}
