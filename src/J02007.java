import java.util.LinkedHashMap;
import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++){
            int n = sc.nextInt();
            int[] a = new int[n];
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }
            System.out.println("Test " + j + ":");
            for (int x : map.keySet()){
                System.out.println(x + " xuat hien " + map.get(x) + " lan");
            }
        }
    }
}
