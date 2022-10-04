public class Main {
    public static void main(String[] args) {
        
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course tur = new Course("Türkçe", "TUR101", "TUR");
        Course fiz = new Course("Fizik", "FIZ101", "FIZ");
        
        Teacher t1 = new Teacher("Murat Hoca", "05051111111", "MAT");
        Teacher t2 = new Teacher("Hacer Hoca", "0505 555 55 55", "TUR");
        Teacher t3 = new Teacher("Sevinç Hoca", "0505 999 99 99", "FIZ");
        
        mat.addTeacher(t1);
        tur.addTeacher(t2);
        fiz.addTeacher(t3);
        
        Student s1 = new Student("Hilmi", "5012", 4, mat, tur, fiz);
        s1.addBulkExamNote(100, 100, 90, 95, 85, 90);
        s1.isPass();
        
        Student s2 = new Student("Hacer", "5012", 3, mat, tur, fiz);
        s2.addBulkExamNote(40, 45, 80, 85, 40, 45);
        s2.isPass();
        
        Student s3 = new Student("Yunus", "5012", 2, mat, tur, fiz);
        s3.addBulkExamNote(40, 45, 50, 55, 20, 40);
        s3.isPass();
    }
}