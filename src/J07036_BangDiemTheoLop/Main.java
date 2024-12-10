package J07036_BangDiemTheoLop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scSV = new Scanner(new File("SINHVIEN.in"));
        int soSV = Integer.parseInt(scSV.nextLine());
        Map<String, SinhVien> mapSV = new HashMap<>();
        while (soSV-- > 0){
            SinhVien sinhVien = new SinhVien(scSV.nextLine(), scSV.nextLine(), scSV.nextLine(), scSV.nextLine());
            mapSV.put(sinhVien.getMaSV(), sinhVien);
        }

        Scanner scMH = new Scanner(new File("MONHOC.in"));
        int soMH = Integer.parseInt(scMH.nextLine());
        Map<String, MonHoc> mapMH = new HashMap<>();
        while (soMH-- > 0){
            MonHoc monHoc = new MonHoc(scMH.nextLine(), scMH.nextLine(), scMH.nextLine());
            mapMH.put(monHoc.getMaMon(), monHoc);
        }

        Scanner scBD = new Scanner(new File("BANGDIEM.in"));
        int soBD = Integer.parseInt(scBD.nextLine());
        ArrayList<BangDiem> listBD = new ArrayList<>();
        while (soBD-- > 0){
            BangDiem bangDiem = new BangDiem(scBD.nextLine());
            SinhVien sinhVien = mapSV.get(bangDiem.getMaSV());
            MonHoc monHoc = mapMH.get(bangDiem.getMaMon());
            bangDiem.setMonhoc(monHoc);
            bangDiem.setSinhVien(sinhVien);
            listBD.add(bangDiem);
        }
        Collections.sort(listBD);
        ArrayList<String> listLop = new ArrayList<>();
        int soLop = Integer.parseInt(scBD.nextLine());
        while(soLop-- > 0){
            String lop = scBD.nextLine();
            listLop.add(lop);
        }
        for(String lop : listLop){
            System.out.println("BANG DIEM lop " + lop + ":");
            for(BangDiem bd : listBD) {
                if (bd.getSinhVien().getLop().equals(lop)) System.out.println(bd);
            }
        }
    }
}
