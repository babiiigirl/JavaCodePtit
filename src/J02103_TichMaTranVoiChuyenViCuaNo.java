import java.util.Scanner;

public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m], c = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    a[j][k] = sc.nextInt();
                }
            }
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++)
                        c[j][k] += a[j][l] * a[k][l];
                }
            }
            System.out.println("Test " + i + ":");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(c[j][k] + " ");
                }
            System.out.println();
            }
        }
    }
}
