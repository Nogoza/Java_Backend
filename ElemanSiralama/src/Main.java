import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin Boyutunu Giriniz: ");
        int sayi = input.nextInt();

        int[] arr = new int[sayi];
        System.out.println();


        for (int i = 0; i < sayi; i++) {
            System.out.print("Dizinin " + (i + 1) + ". Elemanını Giriniz: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Dizinin Sıralanmış Elemanları: ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}