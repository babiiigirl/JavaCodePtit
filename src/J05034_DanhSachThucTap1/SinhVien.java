package J05034_DanhSachThucTap1;

public class SinhVien {
    private int num;
    private String id, name, className, email, business;

    public SinhVien(int num, String id, String name, String className, String email, String business) {
        this.num = num;
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.business = business;
    }

    public String getBusiness() {
        return business;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return num + " " + id + " " + name + " " + className + " " + email + " " + business;
    }
}



