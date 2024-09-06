import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            String res = "";
            //2: ABC, 3: DEF, 4: GHI, 5: JKL
            //
            //6: MNO, 7: PQRS, 8: TUV, 9: WXYZ
            for (char x : s.toCharArray()) {
                if (x == 'A' || x == 'B' || x == 'C') res += '2';
                else if (x == 'D' || x == 'E' || x == 'F') res += '3';
                else if (x == 'G' || x == 'H' || x == 'I') res += '4';
                else if (x == 'J' || x == 'K' || x == 'L') res += '5';
                else if (x == 'M' || x == 'N' || x == 'O') res += '6';
                else if (x == 'P' || x == 'Q' || x == 'R' || x == 'S') res += '7';
                else if (x == 'T' || x == 'U' || x == 'V') res += '8';
                else res += '9';
            }
            StringBuilder sb = new StringBuilder(res);
            if (sb.reverse().toString().equals(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
