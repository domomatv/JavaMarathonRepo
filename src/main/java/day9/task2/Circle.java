package day9.task2;

public class Circle extends Figure {

    private int raduis;

    public Circle(int raduis, String color) {
        super(color);
        this.raduis = raduis;
    }

    public int getRaduis() {
        return raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }

    public double area() {
        return 3.14 * raduis * raduis;
    }

    public double perimeter() {
        return 2 * 3.14 * raduis;
    }
}
