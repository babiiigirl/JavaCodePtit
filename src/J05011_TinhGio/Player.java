package J05011_TinhGio;

public class Player {
    private String id, name, start, end;
    private int timeStart, timeEnd;

    public Player(String id, String name, String start, String end) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;

        this.timeStart = Integer.parseInt(start.substring(0, 2)) * 60 + Integer.parseInt(start.substring(3));
        this.timeEnd = Integer.parseInt(end.substring(0, 2)) * 60 + Integer.parseInt(end.substring(3));
    }

    public int getTime() {
        return timeEnd - timeStart;
    }

    public String toString() {
        int h = getTime() / 60, m = getTime() % 60;
        return id + " " + name + " " + h + " gio " + m + " phut";
    }
}
