package J07024_HieuCuaHaiTapTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        this.set = new TreeSet<>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNextLine()) {
            String s = sc.nextLine().toLowerCase();
            String[] words = s.split("\\s+");
            for (String word : words)
                this.set.add(word);
        }
    }
    public String difference(WordSet x) {
        String res = "";
        for (String word : this.set) {
            if (!x.set.contains(word)) {
                res += word;
                res += " ";
            }
        }
        return res.trim();
    }
}
