package J07051_TinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= t; i++){
            KhachHang kh = new KhachHang(i, sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            list.add(kh);
        }
        Collections.sort(list);
        for(KhachHang x : list) System.out.println(x);
    }
}
