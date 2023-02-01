package Adresses;

import UserOperations.User;

import java.util.Scanner;

public class AddressManager {
   private static Scanner scanner = new Scanner(System.in);

    public static void addAddress(User user){
        Address newAddress;
        System.out.println("********** ADD NEW ADDRESS **********");
        System.out.print("1- Home Address" +
                "\n2- Business Address" +
                "\nEnter Address selection : ");

        int address = scanner.nextInt();
        System.out.print("Enter City        :");
        String city = scanner.next();
        System.out.print("Enter Distinct    : ");
        String district = scanner.next();
        scanner.nextLine();
        System.out.print("Enter Street      : ");
        String street = scanner.nextLine();
        System.out.print("Detailed Address  :");
        String detailAddress = scanner.nextLine();
        if(address == 1){
             newAddress=new HomeAddress(city, district, street, detailAddress);
        }
        else {
            newAddress = new BusinessAddress(city, district, street, detailAddress);
        }
        user.setAddressList(newAddress);
    }

    public static void deleteAddress(User user, int id){
        user.getAddressList().remove(id-1);
        System.out.println("Deletion successful.");
    }
}