import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(101);

        int selected;
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("0-100 Arasında Bir Sayı Tuttum. Tahmin Et Bakalım!");

        while(right < 5){
            System.out.print("\nTahminini Gir: ");
            selected = input.nextInt();

            if(selected < 0 || selected > 100){
                System.out.println("Hatalı sayı girişi yaptınız.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if(selected == number){
                System.out.println("Doğru bildiniz Sayı " + selected + " idi.");
                isWin = true;
                break;
            }else {
                wrong[right] = selected;
                right++;

                if (selected < number) {
                    System.out.println("Daha büyük bir sayı seçiniz.");
                } else {
                    System.out.println("Daha küçük bir sayı giriniz.");
                }

                System.out.println("Kalan Hakkınız: " + (5 - right));
            }
        }
        if(!isWin) {
            System.out.println("\nHakkınız bitmiştir, tutulan sayı " + number + " idi. Tekrar Deneyiniz.");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}