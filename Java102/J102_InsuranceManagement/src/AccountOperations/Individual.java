package AccountOperations;

import InsuranceOperations.CarInsurance;
import InsuranceOperations.HealthInsurance;
import InsuranceOperations.ResidenceInsurance;
import InsuranceOperations.TravelInsurance;
import UserOperations.User;

public class Individual extends Account{
    private final String individual = "Individual";
    public Individual(User user) {
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
        switch (scan.nextInt()){
            case 1:
                getUser().setInsurance(new HealthInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("your insurance is done.");
                break;
            case 2:
                getUser().setInsurance(new ResidenceInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("your insurance is done.");
                break;
            case 3:
                getUser().setInsurance(new TravelInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("your insurance is done.");
                break;
            case 4:
                getUser().setInsurance(new CarInsurance(individual));
                getUser().setInsuranceList(getUser().getInsurance());
                System.out.println("your insurance is done.");
                break;
            default:
                System.out.println("You entered an INVALID VALUE!");
                break;
        }
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getFirstName().compareTo(o.getUser().getFirstName());
    }
}