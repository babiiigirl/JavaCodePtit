import java.util.*;

public class J02105_DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        ArrayList<Set<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (int j = 0; j < n; j++){
                if (a[i][j] == 1) set.add(j + 1);
            }
            arr.add(set);
        }
        for (int i = 0; i < arr.size(); i++){
            System.out.print("List(" + (i + 1) + ") = ");
            for (int x : arr.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
