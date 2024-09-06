package J04005_KhaiBaoLopThiSinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh x = new ThiSinh(sc.nextLine(), sc.next(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(x);
    }
}
