public class MultiSum {
    
    public int sum(int x, int y){
        return x+y;
    }
    
    public int sum(int x, int y, int z){
        return x+y+z;
    }
    
    public int sum(int x, int y, int z, int t){
        return x+y+z+t;
    }
    
    // Bu şekilde 5, 6 veya daha fazla değişken girerek toplama yapmak isteyebiliriz. 
    // Sürekli overloading etmek kod fazlalığına neden olmaktadır. 
    // Java, parametre sayısını önceden bilemeyeceğimiz bu gibi durumlar için metodun değişken sayıda argüman (varargs) almasına izin verir.
}
