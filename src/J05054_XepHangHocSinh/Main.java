package J05054_XepHangHocSinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<HocSinh> a = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            sc.nextLine();
            HocSinh x = new HocSinh(i, sc.nextLine(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                if (o1.getDiem() < o2.getDiem()) return 1;
                else return -1;
            }
        });
        int hang = 1;
        for (int i = 0; i < a.size(); i++){
            if (i > 0 && a.get(i).getDiem() != a.get(i - 1).getDiem())
                hang = i + 1;
            a.get(i).setHang(hang);

        }
        Collections.sort(a, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (HocSinh x : a) System.out.println(x);
    }
}
