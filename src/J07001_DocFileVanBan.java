import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in"); // nhap duong dan "E:\OneDrive - ptit.edu.vn\CodePTIT\JAVA OOP\src\\DATA.in"
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
