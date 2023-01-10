public class Main {
    public static void main(String[] args) {
        
        System.out.println(sum(1,2,3,4,5));
        
    }
    
    public static int sum(int... numbers){
        
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
