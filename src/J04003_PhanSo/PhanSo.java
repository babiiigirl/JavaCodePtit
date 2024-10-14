package J04003_PhanSo;

public class PhanSo {
    private long tu, mau;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long gcd(long a, long b) {
        if (a == 0 || b == 0) return a + b;
        else return gcd(b, a % b);
    }

    public long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public void rutGon(){
        long ucnn = gcd(tu, mau);
        tu = tu / ucnn;
        mau = mau / ucnn;
    }

    public String toString(){
        return this.tu + "/" + this.mau;
    }
}
