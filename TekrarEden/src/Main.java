public class Main {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 6, 9};

        for (int i = 0; i < dizi.length; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    System.out.println("Tekrar eden sayı: " + dizi[i]);
                    break;
                }
            }
        }
    }
}