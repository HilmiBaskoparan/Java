
import java.util.Scanner;



public class Main {
    
    public static Scanner input = new Scanner(System.in);
    public static int B;
    public static int H;
    public static boolean flag;
    
    static {
        B = input.nextInt();
        H = input.nextInt();
        if ((B >= -100 && B <= 100) && (H >= -100 && H <= 100)) {
            try {
                if (B > 0 && H > 0) {
                    flag = true;
                }else {
                    flag = false;
                    throw new Exception("Breadth and height must be positive");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

