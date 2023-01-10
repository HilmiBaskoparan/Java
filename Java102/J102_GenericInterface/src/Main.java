public class Main {
    public static void main(String[] args) {
        
        Student<String> s = new Student<>();
        Student<Integer> i = new Student<>();
        
        String str = "Hilmi";
        Integer[] arr = {80, 90, 100};
        
        s.insert(str);
        
        if (s.delete(str)) {
            System.out.println(str + " is deleted.");
        }
        
        System.out.println(s.updated(str) + " is updated.");
        System.out.println(i.select(arr) + "values are selected.");
    }
}
