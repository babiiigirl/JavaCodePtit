import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.*;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            max = max(max, tmp);
            arr.add(tmp);
        }
        boolean check = false;
        for (int i = 1; i <= max; i++){
            if (!arr.contains(i)) {
                System.out.println(i);
                check = true;
            }
        }
        if (!check) System.out.println("Excellent!");
    }
}
