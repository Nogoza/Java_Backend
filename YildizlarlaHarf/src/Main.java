import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] dizi = new String[5][3];

        for(int i = 0; i < dizi.length; i++) {
            for(int j = 0; j < dizi[0].length; j++) {
                if(j == 0) {
                    dizi[i][j] = "*";
                }else if(j == 1 && i % 2 == 0){
                    dizi[i][j] = "*";
                }else if(j == 2 && i % 2 == 1){
                    dizi[i][j] = "*";
                }else{
                    dizi[i][j] = " ";
                }
            }
        }
        for(String[] row : dizi) {
            for(String colums : row){
                System.out.print(colums);
            }
            System.out.println();
        }
    }
}