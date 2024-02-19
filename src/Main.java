import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("rows: ");
        int a = scan.nextInt();
        System.out.print("columns: ");
        int b = scan.nextInt();

        System.out.println("matris elemanları: ");        
        int[][] matrix = new int[a][b];        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }


        System.out.println("Your matrix: ");
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }


        System.out.println("Transpose of your matrix: ");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}