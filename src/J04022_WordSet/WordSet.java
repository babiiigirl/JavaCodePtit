package J04022_WordSet;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) {
        this.set = new TreeSet<>();
        for (String x : s.toLowerCase().split("\\s+")) {
            this.set.add(x);
        }
    }

    public String union(WordSet str) {
        TreeSet<String> hop = new TreeSet<>();
        for (String x : this.set) hop.add(x);
        for (String x : str.set) hop.add(x);
        String res = "";
        for (String x : hop) {
            res += x; res += " ";
        }
        return res.trim();
    }

    public String intersection(WordSet str) {
        TreeSet<String> giao = new TreeSet<>();
        for (String x : str.set) {
            if (this.set.contains(x)) giao.add(x);
        }
        String res = "";
        for (String x : giao) {
            res += x; res += " ";
        }
        return res.trim();
    }

    public String toString() {
        String res = "";
        for (String x : this.set) {
            res += x; res += " ";
        }
        return res.trim();
    }
}
