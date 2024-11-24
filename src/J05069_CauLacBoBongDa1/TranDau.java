package J05069_CauLacBoBongDa1;

public class TranDau {
    private String ma;
    private int soCDV;

    public TranDau(String ma, int soCDV) {
        this.ma = ma;
        this.soCDV = soCDV;
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
}
