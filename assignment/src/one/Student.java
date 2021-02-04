package one;

public class Student {

    private String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        //Student student = new Student("Hasnat");
        Student student = new Student();

        System.out.println("The name of the student is " + student.getName());

    }
}


