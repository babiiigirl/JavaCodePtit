import java.util.ArrayList;
import java.util.Scanner;

class Employee {
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

public class J05006_DanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Employee> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Employee x = new Employee(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        for (Employee x : arr) System.out.println(x);
    }
}
