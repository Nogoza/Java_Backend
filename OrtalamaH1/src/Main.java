public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;

        for( int number : numbers){
            sum += 1.0 / number;
        }

        double harmonic = numbers.length / sum;
        System.out.println("Harmonic: " + harmonic);
    }
}