package staticmethod;

public class Student {
    private String name;
    private static String schools;

    public Student(String name, String schools) {
        this.name = name;
        this.schools = schools; // HaNoi Aptech
    }

    static void change() {
        schools = "CodeGym";
    }

    void display() {
        System.out.println("Name: " + name + ", Schools: " + schools);
    }
}
