package J07014_HopVaGiaoCua2FileVanBan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String fileName) throws FileNotFoundException {
        this.set = new TreeSet<>();
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }

    public String union(WordSet x) {
        TreeSet<String> unionSet = new TreeSet<>();
        for (String s : x.set) unionSet.add(s);
        for (String s : this.set) unionSet.add(s);
        String res = "";
        for (String s : unionSet) res += s + " ";
        return res.trim();
    }

    public String intersection(WordSet x) {
        TreeSet<String> intersectionSet = new TreeSet<>();
        for (String s : x.set) {
            if (this.set.contains(s)) intersectionSet.add(s);
        }
        String res = "";
        for (String s : intersectionSet) res += s + " ";
        return res.trim();
    }
}
