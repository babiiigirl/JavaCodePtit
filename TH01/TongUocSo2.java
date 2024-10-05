package TH01;

import java.util.Scanner;

public class TongUocSo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int[] sum = new int[b + 1];
        for (int i = 1; i <= b; i++) {
            for (int j = i; j <= b; j += i) sum[j] += i;
        }
        for (int i = a; i <= b; i++) {
            if (sum[i] - i > i) ++cnt;
        }
        System.out.println(cnt);
    }
}
