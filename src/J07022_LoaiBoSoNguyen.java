import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022_LoaiBoSoNguyen {
    public static boolean isInteger(String s) {
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNext()) {
                String s = sc.next();
                if (!isInteger(s)) words.add(s);
            }
            Collections.sort(words);
            System.out.println(String.join(" ", words));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
