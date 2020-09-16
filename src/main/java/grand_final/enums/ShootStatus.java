package grand_final.enums;

public enum ShootStatus {
    MISS("Мимо!"),
    SHOOT_SUCCESS("Попал!"),
    DESTROYED_SUCCESS("Утопил!");

    private String text;

    ShootStatus(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
