import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        int heat = input.nextInt();
        
        switch((heat<5) ? 0 : (heat<15) ? 1 : (heat<25) ? 2 : 3) {
            case 0:
                System.out.println("Kayak");
                break;
            case 1:
                System.out.println("Sinema");
                break;
            case 2:
                System.out.println("Piknik");
                break;
            case 3:
                System.out.println("Yüzme");
                break;
            default:
                break;
        }
        
    }
}
