package J04019_LopTRIANGLE1;

public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean valid(){
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        return (ab + ac > bc) && (ab + bc > ac) && (ac + bc > ab);
    }

    public String getPerimeter() {
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        return String.format("%.3f", ab + ac + bc);
    }
}
