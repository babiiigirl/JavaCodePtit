package J05069_CauLacBoBongDa1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soDoiBong = sc.nextInt();
        sc.nextLine();
        Map<String, DoiBong> doiBongs = new HashMap<>();
        while (soDoiBong -- > 0){
            String maDoiBong = sc.nextLine();
            String tenDoiBong = sc.nextLine();
            int giaVe = sc.nextInt();
            sc.nextLine();
            DoiBong x = new DoiBong(maDoiBong, tenDoiBong, giaVe);
            doiBongs.put(maDoiBong, x);
        }
        int soTranDau = sc.nextInt();
        sc.nextLine();
        List<TranDau> tranDaus = new ArrayList<>();
        while (soTranDau-- > 0){
            String s = sc.nextLine();
            String maTranDau = s.split("\\s+")[0];
            int soCDV = Integer.parseInt(s.split("\\s+")[1]);
            TranDau x = new TranDau(maTranDau, soCDV);
            tranDaus.add(x);
        }
        for (TranDau tranDau : tranDaus) {
            String maDoiBong = tranDau.maDoiBong();
            DoiBong doiBong = doiBongs.get(maDoiBong);
            int doanhThu = tranDau.getSoCDV() * doiBong.getGiaVe();
            System.out.println(tranDau.getMa() + " " + doiBong.getTen() + " " + doanhThu);
        }
    }
}
