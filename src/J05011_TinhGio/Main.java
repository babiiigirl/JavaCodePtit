package J05011_TinhGio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Player> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Player x = new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getTime() - o1.getTime();
            }
        });
        for (Player x : arr) System.out.println(x);
    }
}
