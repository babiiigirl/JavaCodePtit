import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        //// nhap duong dan "E:\OneDrive - ptit.edu.vn\CodePTIT\JAVA OOP\src\\DATA.in"
        Scanner sc = new Scanner(file);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (map.containsKey(x)) map.put(x, map.get(x) + 1);
            else map.put(x, 1);
        }
        for (int x : map.keySet()) {
            System.out.println(x + " " + map.get(x));
        }
    }
}
