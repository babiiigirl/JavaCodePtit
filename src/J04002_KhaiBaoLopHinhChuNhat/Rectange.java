package J04002_KhaiBaoLopHinhChuNhat;

import static java.lang.Character.toUpperCase;

public class Rectange {
    private double width, height;
    private String color;

    Rectange() {
        width = 1; height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return this.height * this.width;
    }

    public double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String toString() {
        String mau = "";
        mau += toUpperCase(color.charAt(0));
        for (int i = 1; i < color.length(); i++) mau += color.charAt(i);
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), mau);
    }
}
