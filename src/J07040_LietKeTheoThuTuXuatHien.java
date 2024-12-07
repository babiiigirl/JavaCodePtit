import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));

        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String x : list) {
            String[] words = x.toLowerCase().split("\\s+");
            for (String word : words) set.add(word);
        }

        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if (set.contains(s)) {
                System.out.println(s);
                set.remove(s);
            }
        }
    }
}
