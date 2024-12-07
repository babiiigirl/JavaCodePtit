import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.Math.sqrt;

public class J07015_SoNguyenToTrongFileNhiPhan {
    public static boolean isPrime(int n){
        for (int i = 2; i <= sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return (n > 1);
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer num : arr)
            if (isPrime(num))
                map.put(num, map.getOrDefault(num, 0) + 1);
        for (Integer x : map.keySet()){
            System.out.println(x + " " + map.get(x));
        }
    }
}