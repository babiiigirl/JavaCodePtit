package J05033_SapXepThoiGian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n ; i++){
            Time x = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getHour() == o2.getHour()) {
                    if (o1.getMinute() == o2.getMinute())
                        return o1.getSecond() - o2.getSecond();
                    else return  o1.getMinute() - o2.getMinute();
                }
                else return o1.getHour() - o2.getHour();
            }
        });
        for(Time x : arr) {
            System.out.println(x);
        }
    }
}
