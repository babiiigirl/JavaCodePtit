package J05032_TreNhatGiaNhat;

public class Person {
    private String nameAndBirth;
    private String name;
    private String day, month, year;

    public Person(String nameAndBirth) {
        this.nameAndBirth = nameAndBirth;
        String[] a = nameAndBirth.split("\\s+");
        this.name = a[0];
        String birth = a[1];
        this.year = birth.substring(6);
        this.month = birth.substring(3, 5);
        this.day = birth.substring(0, 2);
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }
}
