package J07027_QuanLyBaiTapNhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scSV = new Scanner(new File("SINHVIEN.in"));
        Scanner scBT = new Scanner(new File("BAITAP.in"));
        Scanner scN = new Scanner(new File("NHOM.in"));

        int soSinhVien = Integer.parseInt(scSV.nextLine());
        int soNhom = soSinhVien;
        Map<String, SinhVien> mapSinhVien = new HashMap<>();
        while (soSinhVien-- > 0){
            SinhVien sinhVien = new SinhVien(scSV.nextLine(), scSV.nextLine(), scSV.nextLine());
            mapSinhVien.put(sinhVien.getMaSV(), sinhVien);
        }

        int soBaiTap = Integer.parseInt(scBT.nextLine());
        Map<String, BaiTap> mapBaiTap = new HashMap<>();
        for (int i = 1; i <= soBaiTap; i++) {
            BaiTap baiTap = new BaiTap(i, scBT.nextLine());
            mapBaiTap.put(baiTap.getMaBT(), baiTap);
        }

        ArrayList<Nhom> list = new ArrayList<>();
        while (soNhom-- > 0){
            Nhom nhom = new Nhom(scN.nextLine());
            SinhVien sinhVien = mapSinhVien.get(nhom.getMaSV());
            BaiTap baiTap = mapBaiTap.get(nhom.getSttBTNhom());
            nhom.setBaiTap(baiTap); nhom.setSinhVien(sinhVien);
            list.add(nhom);
        }
        Collections.sort(list);
        for (Nhom x : list) System.out.println(x);
    }
}
