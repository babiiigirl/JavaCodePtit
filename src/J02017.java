import java.util.ArrayList;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (!arr.isEmpty() && (arr.get(arr.size() - 1) + a[i]) % 2 == 0) {
                arr.remove(arr.size() - 1);
            }
            else arr.add(a[i]);
        }
        System.out.println(arr.size());
    }
}
