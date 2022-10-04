
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int month, day;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz  : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz Günü Giriniz : ");
        day = input.nextInt();
        
        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Oğlak");
                }else {
                    System.out.println("Kova");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    System.out.println("Kova");
                }else {
                    System.out.println("Balık");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    System.out.println("Balık");
                }else {
                    System.out.println("Koç");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    System.out.println("Koç");
                }else {
                    System.out.println("Boğa");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Boğa");
                }else {
                    System.out.println("İkizler");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.println("İkizler");
                }else {
                    System.out.println("Yengeç");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Yengeç");
                }else {
                    System.out.println("Aslan");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Aslan");
                }else {
                    System.out.println("Başak");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    System.out.println("Başak");
                }else {
                    System.out.println("Terazi");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    System.out.println("Terazi");
                }else {
                    System.out.println("Akrep");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    System.out.println("Akrep");
                }else {
                    System.out.println("Yay");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    System.out.println("Yay");
                }else {
                    System.out.println("Oğlak");
                }
            }else {
                System.out.println("Geçersiz gün girdiniz...");
            }
        }else {
            System.out.println("Geçersiz Ay Girdiniz...");
        }
        
        
        /*
        switch(month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day<=22) {
                        System.out.println("Oğlak");
                    }else {
                        System.out.println("Kova");
                    }
                }else {
                    System.out.println("Gerçersiz Gün Girdiniz...");
                }
                break; 
        }*/
        
    }
}
