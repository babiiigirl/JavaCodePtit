package J05035_DanhSachThucTap2;

public class SinhVien {
    private Integer num;
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

    public String getId() {
        return id;
    }

    public String toString() {
        return num + " " + id + " " + name + " " + className +  " " + email + " " + business;
    }
}
