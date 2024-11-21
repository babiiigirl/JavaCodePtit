package J05042_BangXepHang;

public class SinhVien {
    private String name;
    private int c, t;

    public SinhVien(String name, int c, int t) {
        this.name = name;
        this.c = c;
        this.t = t;
    }

    public String getName() {
        return name;
    }

    public int getC() {
        return c;
    }

    public int getT() {
        return t;
    }

    public String toString() {
        return name + " " + c + " " + t;
    }
}
