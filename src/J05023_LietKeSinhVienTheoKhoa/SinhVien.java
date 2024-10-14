package J05023_LietKeSinhVienTheoKhoa;

public class SinhVien {
    private String id, name, className, email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getCourse() {
       return String.valueOf((className.charAt(1) + className.charAt(2)));
    }

    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}
