package practices.staticmethod;

public class TestStaticMethod {
    public static void main(String[] args) {

        // creating objects
        Student student = new Student("Nguyễn Bá Tuấn Anh", "HaNoi Aptech");
        student.display();
        Student.change(); // calling change method
        student.display();
    }
}
