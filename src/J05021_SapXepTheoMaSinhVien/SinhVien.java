package J05021_SapXepTheoMaSinhVien;

public class SinhVien {
    private String id, name, className, email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}
