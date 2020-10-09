package secondpackage;

public class SecondTestAccessModifier {
    public static void main(String[] args) {
        SecondDataAccessModifier secondDataAccessModifier = new SecondDataAccessModifier();
//        dataAccessModifier.msg(); // is not public. Cannot be accessed from outside package
        secondDataAccessModifier.say();
        secondDataAccessModifier.setAge(1);
        System.out.println("Age: " + secondDataAccessModifier.getAge());
        secondDataAccessModifier.getInfo();
    }
}
