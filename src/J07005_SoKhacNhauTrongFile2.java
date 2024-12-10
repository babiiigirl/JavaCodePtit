import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeMap;

public class J07005_SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 100000; i++){
            int x = dis.readInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : map.keySet()){
            System.out.println(x + " " + map.get(x));
        }
    }
}
