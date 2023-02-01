package AccountOperations;

import InsuranceOperations.*;
import UserOperations.User;

public class Enterprise extends Account{
    private final String enterprise = "Enterprise";
    public Enterprise(User user) {
        super(user);
    }

    @Override
    public void addPolicy() {
        System.out.println("TYPES OF INSURANCE");
        System.out.println("1- Health Insurance\n" +
                "2- Residence Insurance\n" +
                "3- Travel Insurance\n" +
                "4- Car Insurance");
        System.out.print("Enter the number of the type of insurance you want to make : ");
        switch (scan.nextInt()) {
            case 1:
                if (checkInsurance(new HealthInsurance(enterprise))){
                    getUser().setInsurance(new HealthInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Your health insurance has been successfully identified...");
                }else System.out.println("You already have health insurance !!!");

                break;
            case 2:
                if(checkInsurance(new ResidenceInsurance(enterprise))){
                    getUser().setInsurance(new ResidenceInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Your residence insurance has been successfully identified...");
                }else System.out.println("You already have residence insurance !!!");
                break;
            case 3:
                if(checkInsurance(new TravelInsurance(enterprise))){
                    getUser().setInsurance(new TravelInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Your travel insurance has been successfully identified...");
                }else System.out.println("You already have travel insurance !!!");

                break;
            case 4:
                if(checkInsurance(new CarInsurance(enterprise))){
                    getUser().setInsurance(new CarInsurance(enterprise));
                    getUser().setInsuranceList(getUser().getInsurance());
                    System.out.println("Your car insurance has been successfully identified...");
                }else System.out.println("You already have car insurance !!!");

                break;
            default:
                System.out.println("You entered an INVALID VALUE!");
                break;

        }
    }

    private boolean checkInsurance(Insurance insurance) {
        for(Insurance i:getUser().getInsuranceList()){
            if(i.getName().equals(insurance.getName())){
                return false;
            }
        }
        return true;
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getFirstName().compareTo(o.getUser().getFirstName());
    }
}