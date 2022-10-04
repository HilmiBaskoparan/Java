public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course tur;
    Course fiz;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course mat, Course tur, Course fiz) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.tur = tur;
        this.fiz = fiz;
        calcAvarage();
        this.isPass = false;  
    }
    
    public void addBulkExamNote(int mat, int matQuiz, int tur, int turQuiz, int fiz, int fizQuiz) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (matQuiz >= 0 && matQuiz <= 100) {
            this.mat.quizNote = matQuiz;
        }
        if (tur >= 0 && tur <= 100) {
            this.tur.note = tur;
        }
        if (mat >= 0 && mat <= 100) {
            this.tur.quizNote = turQuiz;
        }
        if (fiz >= 0 && fiz <= 100) {
            this.fiz.note = fiz;
        }
        if (mat >= 0 && mat <= 100) {
            this.fiz.quizNote = fizQuiz;
        }
    }
    
    public void isPass() {
        if (this.mat.note == 0 || this.tur.note == 0 || this.fiz.note == 0) {
            System.out.println("Girilmemiş ders notları vardır!!!");
        }else {
            this.isPass = isCheckPass();
            showNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı GEÇTİ :)");
            }else {
                System.out.println("Sınıfta KALDI :(");
            }
        }
    }
    
    public void calcAvarage() {
        this.avarage = (((this.mat.note * 0.8) + (this.mat.quizNote * 0.2)) +
                        ((this.tur.note * 0.8) + (this.tur.quizNote * 0.2)) +
                        ((this.fiz.note * 0.8) + (this.fiz.quizNote * 0.2))) / 3.0;
    }
    
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage >= 55;
    }
    
    public void showNote() {
        System.out.println("====================");
        System.out.println("Öğrenci Adı     : " + this.name);
        System.out.println("Matematik Notu  : " + this.mat.note);
        System.out.println("Matematik Quiz  : " + this.mat.quizNote);
        System.out.println("Türkçe Notu     : " + this.tur.note);
        System.out.println("Türkçe Quiz     : " + this.tur.quizNote);
        System.out.println("Fizik Notu      : " + this.fiz.note);
        System.out.println("Fizik Quiz      : " + this.fiz.quizNote);
    }
    
    
}
