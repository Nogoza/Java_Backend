import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {111, 23, 45, 45, 111, 76, 23, 23, 45};

        boolean[] kontrol = new boolean[arr.length];
        Arrays.fill(kontrol, false); // Başlangıçta hepsi false

        System.out.println("\tTekrar Eden Sayılar\t");
        System.out.println("--------------------------");

        for (int i = 0; i < arr.length; i++) {
            if (kontrol[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    kontrol[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}