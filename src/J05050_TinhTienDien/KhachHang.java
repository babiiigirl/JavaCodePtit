package J05050_TinhTienDien;

import static java.lang.Math.ceil;
import static java.lang.Math.round;

public class KhachHang {
    private String ma;
    private String loaiSD;
    private int chiSoCu, chiSoMoi;

    public KhachHang(int ma, String loaiSD, int chiSoCu, int chiSoMoi) {
        this.ma = "KH" + String.format("%02d", ma);
        this.loaiSD = loaiSD;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int heSo() {
        if (loaiSD.equals("KD")) return 3;
        else if (loaiSD.equals("NN")) return 5;
        else if (loaiSD.equals("TT")) return 4;
        else return 2;
    }

    public int thanhTien() {
        return (chiSoMoi - chiSoCu) * heSo() * 550;
    }

    public int phuTroi(){
        int hieu = chiSoMoi - chiSoCu;
        if (hieu < 50) return 0;
        else if (hieu <= 100) return (int) ceil(0.35 * thanhTien());
        else return thanhTien();
    }

    public int tongTien(){
        return thanhTien() + phuTroi();
    }

    public String toString(){
        return ma + " " + heSo() + " " + thanhTien() + " " + phuTroi() + " " + tongTien();
    }
}
