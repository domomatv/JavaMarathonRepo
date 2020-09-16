package grand_final.enums;

public enum ShipType {
    ONE("однопалубный", 1),
    TWO("двухпалубный", 2),
    TREE("трехпалубный", 3),
    FOUR("четырехпалубный", 4);

    private String name;
    private int code;

    ShipType(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
