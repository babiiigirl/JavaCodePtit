package J07075_LichGiangDayTheoGiangVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scMH = new Scanner(new File("MONHOC.in"));
        int soMH = Integer.parseInt(scMH.nextLine());
        Map<String, MonHoc> mapMonHoc = new HashMap<>();
        while (soMH-- > 0){
            MonHoc monHoc = new MonHoc(scMH.nextLine(), scMH.nextLine(), scMH.nextLine());
            mapMonHoc.put(monHoc.getMaMon(), monHoc);
        }
        Scanner scL = new Scanner(new File("LICHGD.in"));
        int soL = Integer.parseInt(scL.nextLine());
        ArrayList<LichGD> listLich = new ArrayList<>();
        for (int i = 1; i <= soL; i++){
            LichGD lich = new LichGD(i, scL.nextLine(), scL.nextLine(), scL.nextLine(), scL.nextLine(), scL.nextLine());
            lich.setMonHoc(mapMonHoc.get(lich.getMaMon()));
            listLich.add(lich);
        }
        Collections.sort(listLich);
        String tenGV = scL.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + tenGV + ":");
        for (LichGD lich : listLich) {
            if (lich.getTenGV().equals(tenGV)) System.out.println(lich);
        }
    }
}
