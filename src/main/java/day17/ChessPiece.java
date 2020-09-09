package day17;

public enum ChessPiece {


    KING_WHITE(100, "♔"),
    QUEEN_WHITE(9, "♕"),
    ROOK_WHITE(5, "♖"),
    BISHOP_WHITE(3.5, "♗"),
    KNIGHT_WHITE(3, "♘"),
    PAWN_WHITE(1, "♙"),

    KING_BKACK(100, "♚"),
    QUEEN_BKACK(9, "♛"),
    ROOK_BKACK(5, "♜"),
    BISHOP_BKACK(3.5, "♝"),
    KNIGHT_BKACK(3, "♞"),
    PAWN_BKACK(1, "♟"),
    EMPTY(-1, "_");


    //ценность
    private double value;
    private String icon;

    ChessPiece(double value, String icon) {
        this.value = value;
        this.icon = icon;
    }

    public double getValue() {
        return value;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return icon + " ";
    }
}
