
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number of Teams: ");
        int numb = input.nextInt();
        
        List<String> teamList = new ArrayList<>();
        
        for (int i = 0; i < numb; i++) {
            System.out.print("Enter Team Name: ");
            String name = input.next();
            teamList.add(name);
        }
        
        if (numb % 2 != 0) {
            teamList.add("PASS");
            numb++;
        }
        
        System.out.println("\nTeam List");
        for (int i = 0; i < teamList.size(); i++) {
            System.out.println(i+1 + ". " + teamList.get(i));
        }
        
        List<String> temp = new ArrayList<>();
        while (teamList.size() > 0) {            
            int index = (int) (Math.random()*(teamList.size()-1));
            temp.add(teamList.get(index));
            teamList.remove(index);
        }
        
        /*System.out.println("Liste : " + teamList.size());
        System.out.println("Temp  : " + temp.size());
        
        System.out.println("");
        for (String string : temp) {
            System.out.println(string);
        }
        System.out.println("");
        for (String string : teamList) {
            System.out.println(string);
        }*/
        
        teamList = temp;
        int totalRounds = numb - 1;
        int numMatchPerRound = numb / 2;
        
        LinkedHashMap<String, ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();
        for (int i = 0; i < totalRounds; i++) {
            String round = String.valueOf(i+1);
            rounds.put(round, new ArrayList<ArrayList<String>>());
        }
        
        for (int i = 0; i < totalRounds; i++) {
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();
            
            for (int j = 0; j < numMatchPerRound; j++) {
                home.add(teamList.get(j));
                away.add(teamList.get(numb-1-j));
            }
            
            String round = String.valueOf(i + 1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);
            
            List<String> newTeam = new ArrayList<>();
            newTeam.add(teamList.get(0));
            newTeam.add(teamList.get((numb - 1)));

            for (int k=1; k<teamList.size() - 1; k++) {
                newTeam.add(teamList.get(k));
            }

            teamList = newTeam;
            
        }
        System.out.println();

        for (int i=0; i<2*totalRounds; i++) {
            System.out.println((i + 1) + ". Round");
            for (int j=0; j<numMatchPerRound; j++) {
                if (i < totalRounds) {
                    System.out.println(rounds.get(String.valueOf(i + 1)).get(0).get(j) + " vs " +  rounds.get(String.valueOf(i + 1)).get(1).get(j));
                } else {
                    System.out.println(rounds.get(String.valueOf(i + 1 - totalRounds)).get(1).get(j) + " vs " +  rounds.get(String.valueOf(i + 1 - totalRounds)).get(0).get(j));
                }
            }
            System.out.println();
        }
        
        
        
    }
}
