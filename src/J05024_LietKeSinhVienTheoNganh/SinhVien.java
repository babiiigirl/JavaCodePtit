package J05024_LietKeSinhVienTheoNganh;

public class SinhVien {
    private String id, name, className, email;

    public SinhVien(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public String getNganh() {
        String res = id.substring(3, 7);
        if (res.equals("DCKT")) return "Ke toan";
        else if (res.equals("DCCN")) return "Cong nghe thong tin";
        else if (res.equals("DCAT")) return "An toan thong tin";
        else if (res.equals("DCVT")) return "Vien thong";
        else return "Dien tu";
    }

    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}
