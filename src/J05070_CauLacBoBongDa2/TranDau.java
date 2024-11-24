package J05070_CauLacBoBongDa2;

public class TranDau {
    private String ma;
    private int soCDV;
    private int doanhThu;
    private String tenDoiBong;

    public TranDau(String ma, int soCDV, int doanhThu, String tenDoiBong) {
        this.ma = ma;
        this.soCDV = soCDV;
        this.doanhThu = doanhThu;
        this.tenDoiBong = tenDoiBong;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void setTenDoiBong(String tenDoiBong) {
        this.tenDoiBong = tenDoiBong;
    }

    public String maDoiBong(){
        return ("" + ma.charAt(1) + ma.charAt(2));
    }

    public String getMa() {
        return ma;
    }

    public int getSoCDV() {
        return soCDV;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public String getTenDoiBong() {
        return tenDoiBong;
    }

    public String toString(){
        return ma + " " + tenDoiBong + " " + doanhThu;
    }
}
