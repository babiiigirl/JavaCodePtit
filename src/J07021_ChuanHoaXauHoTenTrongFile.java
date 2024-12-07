import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            while (sc.hasNextLine())
            {
                String s = sc.nextLine().toLowerCase();
                if (s.equals("end")) break;

                String[] words = s.split("\\s+");
                String name = "";
                for (String x : words) {
                    if (!x.isEmpty())
                        name += toUpperCase(x.charAt(0));
                    for (int i = 1; i < x.length(); i++) name += x.charAt(i);
                    name += " ";
                }
                System.out.println(name.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
