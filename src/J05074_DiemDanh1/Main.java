package J05074_DiemDanh1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = a;
        sc.nextLine();
        LinkedHashMap<String, SinhVien> map = new LinkedHashMap<>();
        while (a-- > 0){
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(sinhVien.getMa(), sinhVien);
        }
        List<SinhVien> sinhViens = new ArrayList<>();
        while (b-- > 0){
            String s = sc.nextLine();
            String maSV = s.split("\\s+")[0];
            String duLieuDiemDanh = s.split("\\s+")[1];
            DiemDanh diemDanh = new DiemDanh(maSV, duLieuDiemDanh);
            SinhVien sinhVien = map.get(diemDanh.getMaSV());
            sinhVien.setDiemChuyenCan(diemDanh.diemChuyenCan());
            map.put(maSV, sinhVien);
        }
        for (String x : map.keySet()) {
            System.out.println(map.get(x));
        }
    }
}
