package day9.task2;

public class Rectangle extends Figure {

    private int wieght;
    private int height;

    public Rectangle(int wieght, int height, String color) {
        super(color);
        this.wieght = wieght;
        this.height = height;
    }

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return wieght * height;
    }

    public double perimeter() {
        return 2 * (wieght + height);
    }
}
