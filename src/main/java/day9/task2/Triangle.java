package day9.task2;

public class Triangle extends Figure {

    private int bottom1;
    private int bottom2;
    private int bottom3;

    public Triangle(int bottom1, int bottom2, int bottom3, String color) {
        super(color);
        this.bottom1 = bottom1;
        this.bottom2 = bottom2;
        this.bottom3 = bottom3;
    }

    public int getBottom1() {
        return bottom1;
    }

    public void setBottom1(int bottom1) {
        this.bottom1 = bottom1;
    }

    public int getBottom2() {
        return bottom2;
    }

    public void setBottom2(int bottom2) {
        this.bottom2 = bottom2;
    }

    public int getBottom3() {
        return bottom3;
    }

    public void setBottom3(int bottom3) {
        this.bottom3 = bottom3;
    }

    public double area() {
        double halferimeter = perimeter() / 2;
        return Math.sqrt(halferimeter * (halferimeter - bottom1) * (halferimeter - bottom2) * (halferimeter - bottom3));
    }

    public double perimeter() {
        return bottom1 + bottom2 + bottom3;
    }
}
