import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
    private String[][] mineMap;
    private String[][] playerMap;
    private int rowSize;
    private int colSize;
    private int totalMines;
    private int remainingSafeCells;
    private boolean gameOver;

    public MineSweeper(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
        this.mineMap = new String[rowSize][colSize];
        this.playerMap = new String[rowSize][colSize];
        this.totalMines = (rowSize * colSize) / 4;
        this.remainingSafeCells = (rowSize * colSize) - totalMines;
        this.gameOver = false;
        initializeMaps();
        placeMines();
    }

    private void initializeMaps() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                mineMap[i][j] = "-";
                playerMap[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;

        while (minesPlaced < totalMines) {
            int row = rand.nextInt(rowSize);
            int col = rand.nextInt(colSize);

            if (!mineMap[row][col].equals("*")) {
                mineMap[row][col] = "*";
                minesPlaced++;
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printPlayerMap();

        while (!gameOver && remainingSafeCells > 0) {
            System.out.print("Satır Giriniz : ");
            int row = scanner.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scanner.nextInt();

            if (!isValidCoordinate(row, col)) {
                System.out.println("Geçersiz koordinat! Lütfen tekrar deneyin.");
                continue;
            }

            if (!playerMap[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin");
                continue;
            }

            if (mineMap[row][col].equals("*")) {
                gameOver = true;
                System.out.println("Game Over!!");
                revealMines();
                printPlayerMap();
            } else {
                int adjacentMines = countAdjacentMines(row, col);
                playerMap[row][col] = String.valueOf(adjacentMines);
                remainingSafeCells--;
                printPlayerMap();

                if (remainingSafeCells == 0) {
                    System.out.println("Oyunu Kazandınız !");
                    revealMines();
                    printPlayerMap();
                }
            }
        }
        scanner.close();
    }

    private boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < rowSize && col >= 0 && col < colSize;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rowSize && j >= 0 && j < colSize && mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    private void revealMines() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (mineMap[i][j].equals("*")) {
                    playerMap[i][j] = "*";
                }
            }
        }
    }

    private void printPlayerMap() {
        System.out.println("===========================");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(playerMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowSize, colSize;
        do {
            System.out.print("Satır sayısını girin (minimum 2): ");
            rowSize = scanner.nextInt();
            System.out.print("Sütun sayısını girin (minimum 2): ");
            colSize = scanner.nextInt();

            if (rowSize < 2 || colSize < 2) {
                System.out.println("Minimum 2x2 boyutunda matris girmelisiniz!");
            }
        } while (rowSize < 2 || colSize < 2);

        MineSweeper game = new MineSweeper(rowSize, colSize);
        game.playGame();

        scanner.close();
    }
}