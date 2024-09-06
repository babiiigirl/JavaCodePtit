package J05009_TimThuKhoaCuaKyThi;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> arr = new ArrayList<>();
        double max = 0;
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            max = max(max, x.tongDiem());
            arr.add(x);
        }
        for (ThiSinh x : arr)
        {
            if (x.tongDiem() == max) System.out.println(x);
        }
    }
}
