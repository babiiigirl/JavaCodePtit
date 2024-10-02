package J05007_SapXepDanhSachDoiTuongNhanVien;

public class NhanVien {
    private String id;
    private String name, sex, birth, address, tax, date;

    public NhanVien(int id, String name, String sex, String birth, String address, String tax, String date) {
        this.id = String.format("%05d", id);
        this.name = name;
        this.sex = sex;
        this.birth = birth;
        this.address = address;
        this.tax = tax;
        this.date = date;
    }

    public int getYear() {
        if(birth.length() > 0)
            return Integer.parseInt(birth.substring(6));
        return 0;
    }

    public int getMonth() {
        if(birth.length() > 0)
            return Integer.parseInt(birth.substring(3, 5));
        return 0;
    }

    public int getDay() {
        if(birth.length() > 0)
            return Integer.parseInt(birth.substring(0, 2));
        return 0;
    }

    public String toString() {
        return id + " " + name + " " + sex + " " + birth + " " + address + " " + tax + " " + date;
    }
}
