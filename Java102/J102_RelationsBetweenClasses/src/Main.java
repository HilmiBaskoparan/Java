public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hilmi", "Baskoparan", 5012, 100);
        Student s2 = new Student("Hacer", "Baskoparan", 6091, 80);
        
        Instructor t1 = new Instructor("Mahmut", "Hoca", "ABC");
        
        // Composition, Aggregation
        // Course has a Instructor 
        Course mat = new Course("Mat", "MAT101", t1);
        System.out.println(mat.getTeacher().getName());
        
        
        Student[] students = {s1,s2};
        System.out.println("Ortalama : " + mat.calcAvg(students));
    }
}
