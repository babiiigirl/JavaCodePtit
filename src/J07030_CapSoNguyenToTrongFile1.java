import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

import static java.lang.Math.sqrt;

public class J07030_CapSoNguyenToTrongFile1 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        for (Integer x : list1) if (isPrime(x)) set1.add(x);
        for (Integer x : list2) if (isPrime(x)) set2.add(x);

        int tong = (int)1e6;
        for (Integer x : set1) {
            if (x < (tong - x) && set2.contains(tong - x))
                System.out.println(x + " " + (tong - x));
        }
    }
}
