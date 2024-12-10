package J07047_QuanLyKhachSan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int soLP = Integer.parseInt(sc.nextLine());
        Map<String, Phong> mapPhong = new HashMap<>();
        while (soLP-- > 0){
            Phong phong = new Phong(sc.nextLine());
            mapPhong.put(phong.getLoaiPhong(), phong);
        }
        int soKH = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= soKH; i++) {
            KhachHang kh = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            Phong phong = mapPhong.get(kh.getLoaiPhong());
            kh.setPhong(phong);
            list.add(kh);
        }
        Collections.sort(list);
        for (KhachHang kh : list)
            System.out.println(kh);
    }
}
