package day17;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY. Эта “фигура” будет обозначать пустое
 * пространство на шахматной доске. Ценность этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию ("_").
 * Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в единственном аргументе конструктора должен принимать
 * на вход двумерный массив шахматных фигур. Этот двумерный массив задает конфигурацию фигур на шахматной доске.
 * Пустое пространство на шахматной доске задается с помощью значения EMPTY. Также, у класса ChessBoard должен быть реализован метод print(),
 * который выводит шахматную доску в консоль.
 * В методе main() класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве аргумента двумерный массив
 * с расположением фигур как на картинке ниже (матч Крамник - Каспаров 2000 года).
 * Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения шахматных фигур.
 * Вывод в консоль должен быть таким:
 */

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        String kramnikKasparov =
                "♜____♜♚_" +
                        "_♖__♟♟_♟" +
                        "♟_♞___♟_" +
                        "♛__♗____" +
                        "___♝♙___" +
                        "____♗♙__" +
                        "♙__♕_♙_♙" +
                        "_____♖♔_";


        List<ChessPiece> list = parser(kramnikKasparov);
        // формирование двумерного массива
        int j = 0, i = 0;
        for (ChessPiece c : list) {
            if (i < 8 && j < 8) {
                chessPieces[j][i] = c;
                if (i == 7) {
                    j++;
                    i = 0;
                } else {
                    i++;

                }
            }
        }
        ;

        ChessBoard chessBoard = new ChessBoard(chessPieces);
        chessBoard.print();


    }

    //  парсер
    public static List<ChessPiece> parser(String board) {

        List<ChessPiece> chessPieces = new ArrayList<>();
        for (char sign : board.toCharArray()) {
            for (ChessPiece chessPiece : ChessPiece.values()) {

                if (chessPiece.getIcon().charAt(0) == sign) {
                    chessPieces.add(chessPiece);
                }
            }
        }
        return chessPieces;
    }

}
