package J05058_SapXepKetQuaTuyenSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        while (t-- > 0){
            sc.nextLine();
            ThiSinh x = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.tongDiem() == o2.tongDiem()) return o1.getId().compareTo(o2.getId());
                else {
                    if (o2.tongDiem() > o1.tongDiem()) return 1;
                    else return -1;
                }
            }
        });
        for (ThiSinh x : a) System.out.println(x);
    }
}
