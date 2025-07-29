public class Main {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int newarr[][] = new int[arr[0].length][arr.length];

        for (int k = 0; k < arr[0].length; k++) {
            for (int m = 0; m < arr.length; m++) {
                newarr[k][m] = arr[m][k];
            }
        }
        System.out.println("\nTranspoz Dizi:");
        for (int k = 0; k < newarr.length; k++) {
            for (int m = 0; m < newarr[k].length; m++) {
                System.out.print(newarr[k][m] + " ");
            }
            System.out.println();
        }
    }
}