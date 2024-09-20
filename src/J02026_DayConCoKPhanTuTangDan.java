import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J02026_DayConCoKPhanTuTangDan {
    public static void Try(int[] arr, int k, List<List<Integer>> res, List<Integer> tmp, int start) {
        if (tmp.size() == k) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            tmp.add(arr[i]);
            Try(arr, k, res, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int test = sc.nextInt();
    for (int t = 0; t < test; t++) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        Try(arr, k, res, new ArrayList<>(), 0);
        for (List<Integer> x : res) {
            for (int num : x) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
}