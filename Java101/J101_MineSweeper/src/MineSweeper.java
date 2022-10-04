import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    
    int row;
    int col;
    int mineCount;
    int randRow;    // Random Row Number
    int randCol;    // Random Col Number
    String[][] mineMap;
    String[][] gameBoard;
    boolean isWin;

    public MineSweeper(int row, int col, int mineCount) {
        this.row = row;
        this.col = col;
        this.mineCount = mineCount;
        mineMap = new String[row][col];
        gameBoard = new String[row][col];
        this.isWin = true;
    }
    
    public void gameBoard(String[][] matrix) {
        
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                matrix[i][j] = "-";
            }
        }
    }
    
    public void printBoard(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println("");
        }
    }
    
    public void fillMine() {
        Random rand = new Random();
        
        int count = 1;
        while (count <= mineCount) {            
            randRow = rand.nextInt(row);
            randCol = rand.nextInt(col);
            if (mineMap[randRow][randCol] == "*") {
                continue;
            }
            mineMap[randRow][randCol] = "*";
            count++;
        }
        
        for (int i = 0; i < mineMap.length; i++) {
            for (int j = 0; j < mineMap[i].length; j++) {
                if (mineMap[i][j] == null) {
                    mineMap[i][j] = "-";
                }
            }
        }
    }
    
    public String[][] checkMaps(String[][] gameBoard) {
        
        Scanner scan = new Scanner(System.in);
        
        while (isWin) {
            
            System.out.print("Enter a Row Number    : ");
            int rowPick = scan.nextInt();
            System.out.print("Enter a Column Number : ");
            int colPick = scan.nextInt();
            
            if (this.mineMap[rowPick][colPick] == "*") {
                this.gameBoard[rowPick][colPick] = "*";
                printBoard(this.mineMap);
                System.out.println("GAME OVER. YOU LOST :(");
                return this.mineMap;
            }else {
                mineCount(rowPick, colPick);
            }
            
            this.gameBoard[rowPick][colPick] = Integer.toString(mineCount(rowPick, colPick));
            printBoard(gameBoard);
        }
        return this.gameBoard;
    }
    
    public int mineCount(int r, int c){
        int count = 0;
        if (r - 1 >= 0) {
            if (this.mineMap[r-1][c] == "*") {
                count++;
            }
            if (c - 1 >= 0) {
                if (this.mineMap[r - 1][c - 1] == "*") {
                    count++;
                }
            } 
            if (c + 1 < this.col) {
                if (this.mineMap[r - 1][c + 1] == "*") {
                    count++;
                }
            }
        }
        if (r + 1 < this.row) {
            if (this.mineMap[r + 1][c] == "*") {
                count++;
            }
            if (c - 1 >= 0) {
                if (this.mineMap[r + 1][c - 1] == "*") {
                    count++;
                }
            }
            if (c + 1 < this.col) {
                if (this.mineMap[r + 1][c + 1] == "*") {
                    count++;
                }
            }
        }
        if (c - 1 >= 0) {
            if (this.mineMap[r][c-1] == "*") {
                count++;
            }
        }
        if (c + 1 < this.col) {
            if (this.mineMap[r][c+1] == "*") {
                count++;
            }
        } 
        return count;
    }
    
    public void run() {
        gameBoard(gameBoard);
        System.out.println("\n********************************\n");
        fillMine();
        printBoard(mineMap);
        System.out.println("\n********************************\n");
        checkMaps(gameBoard);
        
        
        
    }
    
    
    
}