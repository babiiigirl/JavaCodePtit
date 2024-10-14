package J04012_BaiToanTinhCong;

public class NhanVien {
    private String id, name;
    private int daySalary, day;
    private String position;

    public NhanVien(String id, String name, int daySalary, int day, String position) {
        this.id = id;
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
        this.position = position;
    }

    public int monthSalary() {
        return day * daySalary;
    }

    public int bonus() {
        if (day >= 25) return (int)(0.2 * monthSalary());
        else if (day >= 22 && day < 25) return (int)(0.1 * monthSalary());
        else return 0;
    }

    public int bonusPositon() {
        if (position.equals("GD")) return 250000;
        else if (position.equals("PGD")) return 200000;
        else if (position.equals("TP")) return 180000;
        else return 150000;
    }

    public int income() {
        return monthSalary() + bonus() + bonusPositon();
    }

    public String toString() {
        return this.id + " " + this.name + " " + monthSalary() + " " + bonus() + " " + bonusPositon() + " " + income();
    }
}
