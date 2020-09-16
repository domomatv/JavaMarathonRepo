package grand_final.test;

import grand_final.Board;
import grand_final.enums.ShipType;
import grand_final.exeptions.InvalidCoordinates;
import grand_final.exeptions.WrongCoordinatesSize;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    void checkValidcoordinateInOneLineAndNear() {
        Assertions.assertThrows(InvalidCoordinates.class, () -> {
            Board board = new Board();
            board.addShip(ShipType.TWO, "0,1;2,2");
        });
    }

    @Test
    void checkWrongCoordinatesSize() {
        Assertions.assertThrows(WrongCoordinatesSize.class, () -> {
            Board board = new Board();
            board.getCoordinates(ShipType.TWO, "0,1;2,2;3,3");
        });
    }

    @Test
    void checkWrongCoordinatesFor4() {

        Board board = new Board();
        board.getCoordinates(ShipType.FOUR, "0,0;0,1;0,2;0,3");

    }

    ;

}
