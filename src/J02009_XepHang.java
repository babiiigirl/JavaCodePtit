import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.Math.*;

public class J02009_XepHang {
    public static class Pair {
        public int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.first != o1.first) return o1.second - o2.second;
                else return o1.first - o2.first;
            }
        });
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (p[i].first >= res) res = p[i].first + p[i].second;
            else res += p[i].second;
        }
        System.out.println(res);
    }
}
