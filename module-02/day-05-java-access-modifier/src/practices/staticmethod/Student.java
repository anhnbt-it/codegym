package practices.staticmethod;

public class Student {
    private final String name;
    private static String schools;

    public Student(String name, String schools) {
        this.name = name;
        Student.schools = schools; // HaNoi Aptech
    }

    static void change() {
        schools = "CodeGym";
    }

    void display() {
        System.out.println("Name: " + name + ", Schools: " + schools);
    }
}
