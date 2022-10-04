
import java.util.Scanner;

public class Main {
    
    public static int[][] transposeOfMatrix(int[][] matrix, int[][] transpose ) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j]; 
            }
        }
        return transpose;
    }
    
    public static void enterValues(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Elements...");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                matrix[i][j] = input.nextInt();
            }
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(i + "  ");
            }
            System.out.println("");
        }
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row number of matrix    : ");
        int row = input.nextInt();
        System.out.print("Enter the column number of matrix : ");
        int col = input.nextInt();
        
        int[][] matrix = new int[row][col];
        int[][] transpose = new int[col][row];
        
        enterValues(matrix);
        System.out.println("***** MATRIX *****");
        printMatrix(matrix);
        transposeOfMatrix(matrix, transpose);
        System.out.println("**** TRANSPOSE ****");
        printMatrix(transpose);
        
        
    }
}
