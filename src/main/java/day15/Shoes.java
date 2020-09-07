package day15;

public class Shoes {
    private String name;
    private int size;
    private int count;

    public Shoes(String name, int size, int count) {
        this.name = name;
        this.size = size;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + ", " + size + ", " + count;
    }
}
