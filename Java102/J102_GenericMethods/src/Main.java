public class Main {
    public static void main(String[] args) {
        
        String[] str = {"Java", "PHP", "Python", "C++"};
        Integer[] num = {1, 2, 3, 4};
        Character[] c = {'J', 'A', 'V', 'A'};
        
        System.out.println("------ Print with Generic Method ------ ");
        
        GMethod g1 = new GMethod();
        g1.fromArray(str);
        g1.fromArray(num);
        g1.fromArray(c);
        
        System.out.println("\n------ Generic Method (Two Parameter) ------");
        GMethod.printTwoArrays(num, str);
        
        
        
        /*
        for (String s : str) {
            System.out.print(s + " ");
        }
        
        System.out.println("");
        
        for (Integer i : num) {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        for (Character chr: c) {
            System.out.print(chr + " ");
        }
        */
    }
}
