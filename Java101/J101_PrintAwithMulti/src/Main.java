import java.util.Scanner;

public class Main {
    
    public static String[][] createA(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                if (i == 0 || i == 2) {
                    array[i][j] = "*";
                }else if (j == 0 || j == array[i].length-1) {
                    array[i][j] = "*";
                }else {
                    array[i][j] = " ";
                }
            }
        }
        for (String[] is : array) {
            for (String i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        return array;
    }
    
    public static String[][] createB(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 ||  i == (array.length-1)/2 || i == array.length-1) {
                    array[i][j] = "*";
                }else if (j == 0 || j == array[i].length-1) {
                    array[i][j] = "*";
                }else {
                    array[i][j] = " ";
                }
            }
        }
        for (String[] is : array) {
            for (String i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        return array;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String[][] array = new String[6][4];
        String[][] array2 = new String[7][4];
        
        createA(array);
        System.out.println("");
        createB(array2);
        
        
    }
}
