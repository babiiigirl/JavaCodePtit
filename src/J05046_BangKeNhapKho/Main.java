package J05046_BangKeNhapKho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<LoHang> a = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        while (t-- > 0) {
            sc.nextLine();
            String ma = "";
            String ten = sc.nextLine();
            int soLuong = sc.nextInt();
            int donGia = sc.nextInt();
            LoHang x = new LoHang(ma, ten, soLuong, donGia);
            ma = x.getMa(map);
            x.setMa(ma);
            a.add(x);
        }
        for (LoHang x : a)
            System.out.println(x);
    }
}
