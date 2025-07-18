public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        int value = 5;

        Integer max = null;
        Integer min = null;

        for(int i : list){
            if(i < value){
                if(max == null || i > max){
                    max = i;
                }
            }
            if(min == null || i < min){
                if(max == null || i < min){
                    min = i;
                }
            }
        }
        System.out.println("Girilen Sayı: " + value);
        System.out.println("küçük en yakın sayı: " + max);
        System.out.println("büyük en yakın sayı: " + min);
    }
}
