package J04007_KhaiBaoLopNhanVien;

public class NhanVien {
    private String id, name, sex, birth, address, tax, date;

    public NhanVien(String id, String name, String sex, String birth, String address, String tax, String date) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }

    public String toString() {
        return id + " " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + date;
    }
}
