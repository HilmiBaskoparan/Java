
import java.util.Scanner;

public class Main {
    
    public static Scanner input = new Scanner(System.in);
    
    // Enter rows and columns of MATRIX
    public static int[][] createMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
    
    // Print Matrix with For Loop
    public static void printMultiArr(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Print Matrix with Foreach Loop
    public static void printMultiArrForeach(int[][] matrix) {
        int x = -1;
        for (int[] i : matrix) {
            ++x;
            int y = -1;
            for (int j : i) {
                y++;
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
    // Create Matrix From Random Numbers(Range 1-100)
    public static int[][] createRandMatrix(int[][] randMatrix) {
        
        for (int i = 0; i < randMatrix.length; i++) {
            for (int j = 0; j < randMatrix[i].length; j++) {
                randMatrix[i][j] = (int)(Math.random()*100);
            }
        }
        
        return randMatrix;
    }
    
    
    public static void main(String[] args) {
        
        int matrix[][] = new int[2][3];
        
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        
        createMatrix(matrix);
        System.out.println("******************************");
        
        printMultiArr(matrix);
        System.out.println("******************************");
        
        printMultiArrForeach(matrix);
        System.out.println("******************************");
        
        // RANDOM MATRIX
        
        printMultiArr(createRandMatrix(matrix));
        

    }
}
