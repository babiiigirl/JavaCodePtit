import java.io.*;
import java.util.*;

import static java.lang.Math.sqrt;

public class J07029_SoNguyenToLonNhatTrongFile {
    public static boolean isPrime(int n){
        for (int i = 2; i <= sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer num : arr)
            if (isPrime(num))
                map.put(num, map.getOrDefault(num, 0) + 1);
        int cnt = 0;
        Map<Integer, Integer> res = map.descendingMap();
        for (Integer x : res.keySet()){
            if (cnt == 10) break;
            System.out.println(x + " " + res.get(x));
            ++cnt;
        }
    }
}