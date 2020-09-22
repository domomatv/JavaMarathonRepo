package grand_final;

import grand_final.enums.ShootStatus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static Scanner scanner = new Scanner(System.in);

    private Player playerFirst;
    private Player playerSecond;


    public Game(Player player1, Player player2) {

        List<Player> players = Arrays.asList(player1, player2);
        //  кто первый рандомно
        Collections.shuffle(players);

        this.playerFirst = players.get(0);
        this.playerSecond = players.get(1);

        System.out.println("Первый игрок " + players.get(0).getName() + ", второй игрок  " + players.get(1).getName());
    }

    public void start() {

        /* debug block
        String[] coordsPalyer1 =
                {"2,6", "7,5", "9,5", "2,2"};

        String[] coords2 = {
        "6,3;8,9",
        "9,0;9,1"
        };
        //playerFirst.init(coords2);
        //playerSecond.init(coords2);
        */

        playerFirst.init();
        playerSecond.init();


        System.out.println("Корабли введены, начинаем Морской бой!");

        ShootStatus currentStatus;
        boolean isGameOver = false;


        while (!isGameOver) {
            do {
                Coordinate enteredCoordinate = getShootCoordinateFromConsole();

                // TODO: опустить coordinate на нижний уровеннь вызовов
                currentStatus = playerFirst.shootToPlayer(playerSecond, enteredCoordinate.getX(), enteredCoordinate.getY());

                if (playerSecond.getBoard().isAllDestroyed()) {
                    isGameOver = true;
                    printWinnerName(playerFirst);
                    return;
                }

                playerSecond.getBoard().print();

            } while (!currentStatus.equals(ShootStatus.MISS));

            do {
                Coordinate enteredCoordinate = getShootCoordinateFromConsole();
                currentStatus = playerSecond.shootToPlayer(playerFirst, enteredCoordinate.getX(), enteredCoordinate.getY());
                if (playerFirst.getBoard().isAllDestroyed()) {
                    isGameOver = true;
                    printWinnerName(playerSecond);
                    return;

                }
                playerSecond.getBoard().print();

            } while (!currentStatus.equals(ShootStatus.MISS));


        }

    }

    public Coordinate getShootCoordinateFromConsole() {
        boolean validCoordinate = false;
        while (!validCoordinate) {
            try {
                String command = scanner.nextLine();
                int x = Integer.parseInt(command.split(",")[1]);
                int y = Integer.parseInt(command.split(",")[0]);
                return new Coordinate(x, y);

            } catch (Exception e) {
                System.out.println("неверный ввод координат, повторите");
            }
        }
        // TODO: обработать это по особому
        return null;
    }

    public void printWinnerName(Player player) {
        System.out.println("Winner is " + player.getName());
    }

}