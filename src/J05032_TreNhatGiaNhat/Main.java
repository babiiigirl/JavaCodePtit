package J05032_TreNhatGiaNhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> p = new ArrayList<>();
        while (t-- > 0) {
            Person x = new Person(sc.nextLine());
            p.add(x);
        }
        Collections.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getYear().equals(o2.getYear())) {
                    if (o1.getMonth().equals(o2.getMonth()))
                        return o1.getDay().compareTo(o2.getDay());
                    else return o1.getMonth().compareTo(o2.getMonth());
                }
                else return o1.getYear().compareTo(o2.getYear());
            }
        });
        System.out.println(p.get(p.size() - 1).getName() + "\n" + p.get(0).getName());
    }
}
