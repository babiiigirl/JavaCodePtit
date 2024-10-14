import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

import static java.lang.Math.max;

public class J03020_TimTuThuanNghichDaiNhat {
    public static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int max = -1;
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                max = max(max, s.length());
                if (map.containsKey(s)) map.put(s, map.get(s) + 1);
                else map.put(s, 1);
            }
        }
        for (String s : map.keySet()) {
            if (s.length() == max) {
                System.out.println(s + " " + map.get(s));
            }
        }
    }
}


