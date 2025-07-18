import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] row = {1, 2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 6, 9};
        int[] newRow = new int[row.length];
        int index = 0;

        for (int i = 0; i < row.length; i++) {
            for (int j = i + 1; j < row.length; j++) {
                if (row[i] == row[j]) {
                    newRow[index] = row[j];
                    System.out.println("Tekrar eden sayı: " + row[i]);
                    index++;
                    break;
                }
            }
        }
        int[] result = Arrays.copyOf(newRow, index);
        System.out.print(Arrays.toString(result));
    }
}