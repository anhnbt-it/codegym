package practices.accessmodifier.secondpackage;

public class SecondTest {
    public static void main(String[] args) {
        SecondData secondDataAccessModifier = new SecondData();
//        dataAccessModifier.msg(); // is not public. Cannot be accessed from outside package
        secondDataAccessModifier.say();
        secondDataAccessModifier.setAge(1);
        System.out.println("Age: " + secondDataAccessModifier.getAge());
        secondDataAccessModifier.getInfo();
    }
}
