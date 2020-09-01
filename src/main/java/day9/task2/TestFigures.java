package day9.task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        /**
         * 192.92000000000002
         * 530.159707930611
         * */
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    /**
     * Первый метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур.
     */
    public static double calculateRedPerimeter(Figure[] figures) {

        double redPerimeter = 0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red")) {
                redPerimeter += f.perimeter();
            }
        }
        ;
        return redPerimeter;
    }

    ;

    /**
     * Второй метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
     */

    public static double calculateRedArea(Figure[] figures) {
        double redArea = 0;
        for (Figure f : figures) {
            if (f.getColor().equals("Red")) {
                redArea += f.area();
            }
        }
        ;

        return redArea;

    }

    ;
}
