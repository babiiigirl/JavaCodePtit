import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

import static java.lang.Math.sqrt;

public class J07023_NguyenToVaThuanNghich {
    public static boolean isPrime(int n){
        for (int i = 2; i <= sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return (n>1);
    }
    public static boolean thuanNghich(int n){
        StringBuilder sb = new StringBuilder(n + "");
        return sb.reverse().toString().equals(n + "");
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        TreeMap<Integer, Integer> map2 = new TreeMap<>();

        for (Integer x : list1)
            if (isPrime(x) && thuanNghich(x))
                map1.put(x, map1.getOrDefault(x, 0) + 1);
        for (Integer x : list2)
            if (isPrime(x) && thuanNghich(x))
                map2.put(x, map2.getOrDefault(x, 0) + 1);
        for (Integer x : map1.keySet()) {
            if (map2.containsKey(x)) {
                System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
            }
        }
    }
}
