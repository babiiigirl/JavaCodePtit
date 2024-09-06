package J04005_KhaiBaoLopThiSinh;

public class ThiSinh {
    private String name, birth;
    private float diem1, diem2, diem3;

    public ThiSinh(String name, String birth, float diem1, float diem2, float diem3) {
        this.name = name;
        this.birth = birth;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float tongDiem() {
        return this.diem1 + this.diem2 + this.diem3;
    }

    public String toString() {
        return this.name + " " + this.birth + " " + tongDiem();
    }
}
