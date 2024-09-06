package J04002_KhaiBaoLopHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange x = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next().toLowerCase());
        if (x.getHeight() > 0 && x.getWidth() > 0)
            System.out.println(x);
        else System.out.println("INVALID");
    }
}
