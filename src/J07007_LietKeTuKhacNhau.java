import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
        for (String x : set) {
            System.out.println(x);
        }
    }
}
