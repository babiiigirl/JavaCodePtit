package J04014_TinhToanPhanSo;

public class PhanSo {
    private long tu, mau;

    PhanSo(){
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public void rutGon() {
        long ucnn = gcd(tu, mau);
        tu /= ucnn; mau /= ucnn;
    }

    public PhanSo tongPhanSo(PhanSo p) {
        long msc = lcm(this.mau, p.mau);
        PhanSo tong = new PhanSo(msc / this.mau * this.tu + msc / p.mau * p.tu, msc);
        tong.rutGon();
        return tong;
    }

    public PhanSo tichPhanSo(PhanSo p) {
        PhanSo d = new PhanSo(this.tu * p.tu, this.mau * p.mau);
        d.rutGon();
        return d;
    }

    public String toString() {
        return tu + "/" + mau;
    }
}
