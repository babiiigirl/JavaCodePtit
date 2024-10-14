import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in"); // nhap duong dan "E:\OneDrive - ptit.edu.vn\CodePTIT\JAVA OOP\src\\DATA.in"
        Scanner sc = new Scanner(file);
        long sum = 0;
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
            }
            else sc.next();
        }
        System.out.println(sum);
    }
}
