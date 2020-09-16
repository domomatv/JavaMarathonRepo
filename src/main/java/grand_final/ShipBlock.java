package grand_final;

import grand_final.enums.BlockShipStatus;

public class ShipBlock {

    private BlockShipStatus status;
    private int x;
    private int y;

    public ShipBlock(int x, int y) {
        this.status = BlockShipStatus.ALIVE;
        this.y = y;
        this.x = x;
    }

    public BlockShipStatus getStatus() {
        return status;
    }

    public void setStatus(BlockShipStatus status) {
        this.status = status;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
