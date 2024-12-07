import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07032_SoThuanNghichTrongFile {
    public static boolean soThuanNghich(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++)
            if ((sb.charAt(i) - '0') % 2 == 0) return false;
        return sb.reverse().toString().equals(s) && sb.length() % 2 != 0 && sb.length() > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer x : list1)
            if (soThuanNghich(x + "") && list2.contains(x))
                map.put(x, map.getOrDefault(x, 0) + 1);
        for (Integer x : list2)
            if (soThuanNghich(x + "") && list1.contains(x))
                map.put(x, map.getOrDefault(x, 0) + 1);

        int cnt = 0;
        for (Integer x : map.keySet()) {
            if (cnt == 10) break;
            System.out.println(x + " " + map.get(x));
            ++cnt;
        }
    }
}
