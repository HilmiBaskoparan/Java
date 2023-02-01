package AccountOperations;

import Adresses.Address;
import Adresses.AddressManager;
import InsuranceOperations.Insurance;
import UserOperations.User;
import exception.InvalidAuthenticationException;

import java.util.Scanner;

public abstract class Account implements Comparable<Account> {
    protected Scanner scan = new Scanner(System.in);
    private User user;
    private AuthenticationStatus status = AuthenticationStatus.FAIL;
    enum AuthenticationStatus{
        FAIL,
        SUCCESS;
    }

    public Account(User user){
        this.user = user;
    }

    public void addAddress() {
        AddressManager.addAddress(this.user);
    }

    public void deleteAddress() {
        printAddresses();
        System.out.print("Enter the address id which you want to DELETE : ");
        int id = scan.nextInt();
        AddressManager.deleteAddress(user, id);
    }

    public void login(String email, String password, Account account) throws InvalidAuthenticationException {
        if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)){
            status=AuthenticationStatus.SUCCESS;
        }
        else throw new InvalidAuthenticationException("Failed Entry");
    }

    public final void showUserInfo() {
        System.out.println("User Name and Lastname : " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Email   : " + user.getEmail());
        System.out.println("Job     : " + user.getJob());
        System.out.println("Yaş : " + user.getAge());
        System.out.println("Last Entry Date     : " + user.getLastEntry());
        System.out.println("Type Of Membership  : " + user.getMembership());
        printInsurances();
        printAddresses();
    }

    public void printAddresses() {
        for (Address address: user.getAddressList()){
            address.showAddressInfo();
        }
    }

    public void printInsurances() {
        for(Insurance insurance: user.getInsuranceList()){
            System.out.println("Type of Insurance : " + insurance.getName() +
                    "\nInsurance Fee    : " + insurance.getPrice() +
                    "\nStart Date       : " + insurance.getStartDate() +
                    "\nEnd Date         : " + insurance.getFinishDate());

        }
    }

    public abstract void addPolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}