package grand_final;

import grand_final.enums.ShipType;
import grand_final.enums.ShootStatus;
import grand_final.exeptions.InvalidCoordinates;
import grand_final.exeptions.ShipPositionExeption;
import grand_final.exeptions.WrongCoordinatesSize;

import java.util.Scanner;

public class Player {

    private String name;
    private Board board = new Board();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    // создаем корабли для игрока
    public void init() {
        Scanner scanner = new Scanner(System.in);

        // (String key : hashMap.keySet())
        for (ShipType shipType : board.getInitShips().keySet()) {
            int counter = 1;
            while (counter <= board.getInitShips().get(shipType)) {

                System.out.println("Введите координаты " + shipType.getName() + " № " + counter);
                String coordinates = scanner.nextLine();
                try {
                    board.addShip(shipType, coordinates);
                } catch (ShipPositionExeption | WrongCoordinatesSize | InvalidCoordinates e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                counter++;
            }

        }

    }

    // tmp init for debug
    public void init(String[] coordinates) {
        int i = 0;

        for (ShipType shipType : board.getInitShips().keySet()) {

            int counter = 1;
            while (counter <= board.getInitShips().get(shipType)) {

                System.out.println("Введите координаты " + shipType.getName() + " № " + counter);

                try {
                    board.addShip(shipType, coordinates[i]);
                    i++;
                } catch (ShipPositionExeption | WrongCoordinatesSize | InvalidCoordinates e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                counter++;
            }

        }
    }


    public ShootStatus shootToPlayer(Player player, int x, int y) {
        ShootStatus shootStatus = player.getBoard().shooted(x, y);
        System.out.println(name + " выстрелил в " + player.getName() + ", статус: " + shootStatus.getText());
        return shootStatus;
    }

    public Board getBoard() {
        return board;
    }
}
