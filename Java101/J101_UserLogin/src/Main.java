import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String user, password;
        Scanner input = new Scanner(System.in);
        boolean over = false;
        
        while (!over) {            
            System.out.print("Kullanıcı Adı : ");
            user = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            if (user.equals("patika") && password.equals("java123")) {
                System.out.println("Giriş Yaptınız...");
                over = true;
            }else if (!user.equals("patika") && password.equals("java123")) {
                System.out.println("Kullanıcı Adı Yanlış");
            }else if (user.equals("patika") && !password.equals("java123")) {
                System.out.println("Şifre Yanlış");
                System.out.print("Şifrenizi Sıfırlamak İster misiniz? (E/H) : ");
                String answer = input.nextLine();
                if (answer.equals("e") || answer.equals("evet")) {
                    System.out.println("Şifreyi Hatalı Girdiniz.");
                    boolean over2 = false;
                    while (!over2) {
                        System.out.print("Şifrenizi sıfırlamak için yeni şifre giriniz : ");
                        String new_password = input.nextLine();
                        if (new_password.equals("java123") || new_password.equals(password)) {
                            System.out.println("Şifre eski şifreniz ve son girdiğiniz şifre ile aynı olamaz.");
                        }else {
                            password = new_password;
                            System.out.print("Şifreniz Yenilendi. Yeni Şifreniz : " + password + "\n");
                            over2 = true;
                        }
                    }
                    over = true;
                }else if (answer.equals("h") || answer.equals("hayır")) {
                    System.out.println("Üzgünüz Tekrar Giriş Yapınız...");
                }else {
                    System.out.println("Yanlış Girdi Yaptınız...");
                }
            }else {
                System.out.println("Kullanıcı Adı ve Şifre Yanlış");
            }
        }
    }
}
