package J05056_XepHangVanDongVien2;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<VanDongVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            VanDongVien x = new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<VanDongVien>() {
            @Override
            public int compare(VanDongVien o1, VanDongVien o2) {
                try {
                    return (int) (o1.thanhTichXepHang() - o2.thanhTichXepHang());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        int hang = 1;
        for (int i = 0; i < a.size(); i++) {
            if (i > 0 && a.get(i).thanhTichXepHang() != a.get(i - 1).thanhTichXepHang())
                hang = i + 1;
            a.get(i).setHang(hang);
        }

        for (VanDongVien x : a) System.out.println(x);
    }
}
