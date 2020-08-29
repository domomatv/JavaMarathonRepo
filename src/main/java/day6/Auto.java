package day6;

public class Auto {

    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDiffBtwYearEnteredYear(int enteredYear) {
        return year - enteredYear;
    }

    public void whatIsIt() {
        System.out.println("Это Автомобиль");
    }
}
