package J05010_SapXepDanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
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
