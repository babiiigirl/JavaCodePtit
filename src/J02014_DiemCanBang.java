import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int curSum = 0;
            int id = -1;
            for (int i = 0; i < n; i++){
                sum -= a[i];
                if (curSum == sum) {
                    id = i + 1;
                    break;
                }
                curSum += a[i];
            }
            System.out.println(id);
        }
    }
}
