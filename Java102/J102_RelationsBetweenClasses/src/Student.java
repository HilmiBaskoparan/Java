public class Student {
    private String name;
    private String surname;
    private int id;
    private int note;

    public Student(String name, String surname, int id, int note) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    
}
