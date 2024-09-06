package J05006_DanhSachDoiTuongNhanVien;

public class Employee {
    private String id, name, sex, birth, address, tax, date;

    public Employee(int id, String name, String sex, String birth, String address, String tax, String date) {
        this.id = String.format("%05d", id);
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
