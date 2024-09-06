import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    private int ma;
    private String ten, nhom;
    private double giaMua, giaBan;

    public Product(int ma, String ten, String nhom, double giaMua, double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public double loiNhuan() {
        return this.giaBan - this.giaMua;
    }

    public String toString() {
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f", loiNhuan());
    }
}

public class J05010_SapXepDanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            Product x = new Product(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            arr.add(x);
        }
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o2.loiNhuan() > o1.loiNhuan()) return 1;
                else return -1;
            }
        });
        for (Product x : arr) System.out.println(x);
    }
}
