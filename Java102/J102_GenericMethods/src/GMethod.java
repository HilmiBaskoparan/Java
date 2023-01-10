public class GMethod {
    
    public <T> void fromArray(T[] arr) {
        
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
    
    public static <T,U> void printTwoArrays(T[] arr1, U[] arr2){
        for (T t : arr1) {
            System.out.print(t + " ");
        }
        System.out.println();
        for (U u : arr2) {
            System.out.print(u + " ");
        }
        System.out.println();
    }
}
