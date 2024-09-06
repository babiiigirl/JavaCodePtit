package J04006_KhaiBaoLopSinhVien;

public class SinhVien {
    private String id, name, className, birth;
    private float gpa;

    SinhVien() {
        id = "";
        name = "";
        className = "";
        birth = "";
        gpa = 0;
    }
    public SinhVien(String id, String name, String className, String birth, float gpa) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.birth = birth;
        this.gpa = gpa;
    }

    public void chuanHoa() {
        StringBuilder sb = new StringBuilder(birth);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        birth = sb.toString();
    }

    public String toString() {
        return id + " " + name + " " + className + " " + birth + " " + String.format("%.2f", gpa);
    }
}
