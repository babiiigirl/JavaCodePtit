package J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<DoanhNghiep> a1 = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a1.add(x);
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            ArrayList<DoanhNghiep> a2 = new ArrayList<>();
            int a = sc.nextInt(), b = sc.nextInt();
            for (DoanhNghiep x : a1) {
                if (x.getSoSinhVien() >= a && x.getSoSinhVien() <= b) a2.add(x);
            }
            Collections.sort(a2, new Comparator<DoanhNghiep>() {
                @Override
                public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                    if (o1.getSoSinhVien() == o2.getSoSinhVien())
                        return o1.getMa().compareTo(o2.getMa());
                    else return o2.getSoSinhVien() - o1.getSoSinhVien();
                }
            });
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (DoanhNghiep x : a2) System.out.println(x);
        }
    }
}
