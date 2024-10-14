package J04021_LopInSet;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;

    public IntSet() {
        set = new TreeSet<>();
    }

    public IntSet(int[] a) {
        set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) set.add(a[i]);
    }

    public IntSet union(IntSet b) {
        IntSet res = new IntSet();
        for(int x : this.set) {
            res.set.add(x);
        }
        for (int x : b.set) {
            res.set.add(x);
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (int x : this.set) {
            res += x + " ";
        }
        return res;
    }
}
