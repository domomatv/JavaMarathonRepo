package day17;

import java.util.ArrayList;
import java.util.List;

/**
 * Используя созданный enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
 * Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.
 */

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chessPieces = new ArrayList<>();
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);
        chessPieces.add(ChessPiece.PAWN_WHITE);

        chessPieces.add(ChessPiece.ROOK_BKACK);
        chessPieces.add(ChessPiece.ROOK_BKACK);
        chessPieces.add(ChessPiece.ROOK_BKACK);
        chessPieces.add(ChessPiece.ROOK_BKACK);

        chessPieces.forEach(System.out::print);

    }

}
