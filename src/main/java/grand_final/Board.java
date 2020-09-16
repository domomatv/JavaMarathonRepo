package grand_final;

import grand_final.enums.BlockShipStatus;
import grand_final.enums.ShipType;
import grand_final.enums.ShootStatus;
import grand_final.exeptions.InvalidCoordinates;
import grand_final.exeptions.ShipPositionExeption;
import grand_final.exeptions.WrongCoordinatesSize;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Проверки:
 * <p>
 * 1. Количество координат правильное (для четырехпалубного корабля координат должно быть 4, для трехпалубного - 3, и так далее):
 * реализована в методе  getCoordinates
 * <p>
 * <p>
 * 2.  Валидный корабль - это одна или несколько последовательно идущих клеток (по вертикали или горизонтали).
 * реализована в методе validateCoordinatesHorOrVert
 * реализована в методе validateCoordinatesNearEachOther;
 * <p>
 * 3. Корабль размещается на свободном месте на карте. Размещаемый корабль не касается других кораблей сторонами и углами. То есть, вокруг каждого корабля должен быть “ореол” из одной клетки, на который не могут размещаться какие-либо другие корабли.
 * реализована в методе  validateFreeSpace
 */


public class Board {

    // Параметры
    private static int FIELD_LENGTH = 10;
    private static String EMPTY_CELL = "⬜";
    private static String SHIP_AREA = "\uD83D\uDFE6";
    private static String SHIP_ICON = "\uD83D\uDEE5";
    private static String SHIP_SHOOTED_ICON = "\uD83D\uDFE5";

    // доступные корабли
    // тип и количество
    private static Map<ShipType, Integer> initShips = new LinkedHashMap<>();

    static {
        initShips.put(ShipType.FOUR, 1);
        initShips.put(ShipType.TREE, 2);
        initShips.put(ShipType.TWO, 3);
        initShips.put(ShipType.ONE, 4);
    }

    // поле
    // TODO: подумать как объединить поле и созданные корабли
    private String[][] field = new String[FIELD_LENGTH][FIELD_LENGTH];
    private List<Ship> shipList = new ArrayList<>();


    public static Map<ShipType, Integer> getInitShips() {
        return initShips;
    }

    public void addShip(ShipType shipType, String coordinates) {

        List<Coordinate> coordinatesXY = getCoordinates(shipType, coordinates);

        /// проверяем, что координаты друг за другом на одной линии
        validateCoordinatesNearEachOtherAndOneLine(coordinatesXY);
        // проверки наличия места под корабль
        validateFreeSpace(coordinatesXY);


        Ship ship = Ship.creatorShip(shipType, coordinatesXY);

        for (int k = 0; k < ship.getShipBlocks().length; k++) {
            // если координаты совпали - добавляем корабль
            field[ship.getShipBlocks()[k].getX()][ship.getShipBlocks()[k].getY()] = SHIP_ICON;
        }

        setShipAreal(ship);
        shipList.add(ship);

    }

    ;

    // стрингу превращает в коррдинаты

    public List<Coordinate> getCoordinates(ShipType shipType, String coordinateString) {
        List<Coordinate> coordinates = new ArrayList<>();
        String[] coordinatePairs = coordinateString.split(";");

        for (String coordinatePair : coordinatePairs) {
            String[] coordinatesXY = coordinatePair.split(",");
            // 0 координата - горизональная, 1 - вертикальная
            int x = Integer.parseInt(coordinatesXY[1]);
            int y = Integer.parseInt(coordinatesXY[0]);
            // TODO: использовать regexp
            if (x < 0 || x > 9 || y < 0 || y > 9) {
                throw new ShipPositionExeption("координаты не проходят валидацию >=0 <=9");
            }

            coordinates.add(new Coordinate(x, y));
        }
        if (shipType.getCode() != coordinates.size()) {
            throw new WrongCoordinatesSize("некорректная длина корабля для такого типа, должно быть: " + shipType.getCode() + ", но " + coordinates.size());
        }

        return coordinates;

    }

    ;

    // статус доски
    public void print() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j] == null ? EMPTY_CELL : field[i][j]);
            }
            System.out.println();
        }
    }

    ;

    // проверка, что координаты указаны друг за другом и на одной прямой
    // условие, что начинаем с головы вводить координаты
    public void validateCoordinatesNearEachOtherAndOneLine(List<Coordinate> coordinate) {

        for (int i = coordinate.size() - 1; i > 0; i--) {
            // либо равна одна из координат, а вторая раздичаются на 1

            if ((coordinate.get(i).getX() == coordinate.get(i - 1).getX() &&
                    coordinate.get(i).getY() - coordinate.get(i - 1).getY() == 1)

                    ||

                    (coordinate.get(i).getY() == coordinate.get(i - 1).getY() &&
                            coordinate.get(i).getX() - coordinate.get(i - 1).getX() == 1)) {

            } else {
                throw new InvalidCoordinates("Координаты не последовательно друг за другом в сторону увеличения");
            }
        }
    }

    @Deprecated
    private void validateCoordinatesHorOrVert(List<Coordinate> coordinate) {

        // у всех кординат должен быть одинаковый Х или Y
        // берем первый за эталон
        Coordinate etalon = coordinate.get(0);

        if (coordinate.stream().filter(e -> (e.getY() == etalon.getY()) || (e.getX() == etalon.getX())).count() != coordinate.size()) {
            throw new InvalidCoordinates("Координаты расподожены не строго по вертикали или горизонтале");
        }
    }


    public void validateFreeSpace(List<Coordinate> coordinateList) {

        //  проверка, что есть место на доске
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                for (Coordinate c : coordinateList) {
                    if (i == c.getX() && j == c.getY() && field[i][j] != null && field[i][j].equals(SHIP_AREA)) {
                        throw new ShipPositionExeption("Вокруг корабля должна быть область шириной в одну клетку, в которой не может быть других кораблей (ореол корабля)");
                    }

                    if (i == c.getX() && j == c.getY() && field[i][j] != null && field[i][j].equals(SHIP_ICON)) {
                        throw new ShipPositionExeption("Место занято другим кораблем");
                    }
                }
            }
        }

    }


    private void setShipAreal(Ship ship) {

        for (int k = 0; k < ship.getShipBlocks().length; k++) {
            // если координаты совпали - добавляем корабл
            int x = ship.getShipBlocks()[k].getX();
            int y = ship.getShipBlocks()[k].getY();

            // в стороны от клетки

            if (x - 1 >= 0 && isEmptyCell(x - 1, y)) {
                field[x - 1][y] = SHIP_AREA;
            }
            if (x + 1 <= 9 && isEmptyCell(x + 1, y)) {
                field[x + 1][y] = SHIP_AREA;
            }

            if (y - 1 >= 0 && isEmptyCell(x, y - 1)) {
                field[x][y - 1] = SHIP_AREA;
            }
            if (y + 1 <= 9 && isEmptyCell(x, y + 1)) {
                field[x][y + 1] = SHIP_AREA;
            }

            // диагональ
            if (x + 1 <= 9 && y + 1 <= 9 && isEmptyCell(x + 1, y + 1)) {
                field[x + 1][y + 1] = SHIP_AREA;
            }
            if (x + 1 <= 9 && y - 1 >= 0 && isEmptyCell(x + 1, y - 1)) {
                field[x + 1][y - 1] = SHIP_AREA;
            }

            if (x - 1 >= 0 && y + 1 <= 9 && isEmptyCell(x - 1, y + 1)) {
                field[x - 1][y + 1] = SHIP_AREA;
            }

            if (x - 1 >= 0 && y - 1 >= 0 && isEmptyCell(x - 1, y - 1)) {
                field[x - 1][y - 1] = SHIP_AREA;
            }

        }
    }

    public ShootStatus shooted(int x, int y) {

        List<Ship> aliveShips = shipList.stream().filter(Ship::isAlive).collect(Collectors.toList());
        for (Ship ship : aliveShips) {
            for (ShipBlock block : ship.getShipBlocks()) {
                if (block.getX() == x && block.getY() == y) {
                    block.setStatus(BlockShipStatus.SHOOTED);

                    if (ship.isAlive()) {
                        field[x][y] = SHIP_SHOOTED_ICON;
                        return ShootStatus.SHOOT_SUCCESS;
                    } else {
                        // для последнего значения
                        field[x][y] = SHIP_SHOOTED_ICON;
                        ship.setStatus(BlockShipStatus.DESTROYED);
                        return ShootStatus.DESTROYED_SUCCESS;

                    }
                }
            }
        }
        return ShootStatus.MISS;
    }

    ;

    public boolean isAllDestroyed() {
        return shipList.stream().filter(e -> e.isAlive()).collect(Collectors.toList()).size() < 1;
    }

    ;

    private boolean isEmptyCell(int x, int y) {
        return field[x][y] == null || field[x][y] == SHIP_AREA;
    }

}
