package J05009_TimThuKhoaCuaKyThi;

public class ThiSinh {
    private int id;
    private String name, birth;
    private double diem1, diem2, diem3;

    public ThiSinh(int id, String name, String birth, double diem1, double diem2, double diem3) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double tongDiem() {
        return this.diem1 + this.diem2 + this.diem3;
    }

    public String toString() {
        return id + " " + name + " " + birth + " " + tongDiem();
    }
}
