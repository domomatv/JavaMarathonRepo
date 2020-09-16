package grand_final;

import grand_final.enums.BlockShipStatus;
import grand_final.enums.ShipType;

import java.util.Arrays;
import java.util.List;

public class Ship {

    private ShipType shipType;
    // блоки коробля
    private ShipBlock[] shipBlocks;
    private BlockShipStatus status = BlockShipStatus.ALIVE;

    public Ship(ShipType shipType, ShipBlock[] shipBlocks) {
        this.shipType = shipType;
        this.shipBlocks = shipBlocks;
    }

    public static Ship creatorShip(ShipType shipType, List<Coordinate> coordinates) {

        ShipBlock[] shipBlocks = new ShipBlock[shipType.getCode()];

        for (Coordinate c : coordinates) {
            // 0 координата - горизональная, 1 - вертикальная
            shipBlocks[coordinates.indexOf(c)] = new ShipBlock(c.getX(), c.getY());
        }

        return new Ship(shipType, shipBlocks);

    }

    public BlockShipStatus getStatus() {
        return status;
    }

    public void setStatus(BlockShipStatus status) {
        this.status = status;
    }

    public ShipBlock[] getShipBlocks() {
        return shipBlocks;
    }

    public ShipType getShipType() {
        return shipType;
    }

    public boolean isAlive() {
        return Arrays.stream(shipBlocks).filter(e -> e.getStatus().equals(BlockShipStatus.ALIVE))
                .count() > 0;
    }
}
