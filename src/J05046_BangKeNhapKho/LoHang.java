package J05046_BangKeNhapKho;

import java.util.HashMap;

public class LoHang {
    private String ma;
    private String ten;
    private int soLuong, donGia;

    public LoHang(String ma, String ten, int soLuong, int donGia) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double chietKhau(){
        if (soLuong > 10) return 0.05;
        else if (soLuong >= 8) return 0.02;
        else if (soLuong >= 5) return 0.01;
        else return 0;
    }

    public String getMa(HashMap<String, Integer> map){
        String maTen = "";
        String[] a = ten.split("\\s+");
        for (int i = 0; i < 2; i++) {
            maTen += a[i].charAt(0);
        }
        map.put(maTen, map.getOrDefault(maTen, 0) + 1);
        return maTen.toUpperCase() + String.format("%02d", map.get(maTen));
    }

    public int tienChietKhau() {
        return (int) (donGia * soLuong * chietKhau());
    }

    public int thanhTien() {
        return donGia * soLuong - tienChietKhau();
    }

    public String toString() {
        return ma + " " + ten + " " + tienChietKhau() + " " + thanhTien();
    }
}
