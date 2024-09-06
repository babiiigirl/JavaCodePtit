import java.util.ArrayList;
import java.util.Scanner;

public class J02037_DayUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] numbers = s.split("\\s+");
            ArrayList<Integer> a = new ArrayList<>();
            int even = 0, odd = 0;
            for (String num : numbers) {
                int n = Integer.parseInt(num);
                if (n % 2 == 0) even++;
                else odd++;
                a.add(n);
            }
            if ((a.size() % 2 == 0 && even > odd) || (a.size() % 2 != 0 && even < odd))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
