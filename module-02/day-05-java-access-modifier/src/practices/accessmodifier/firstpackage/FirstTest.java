package practices.accessmodifier.firstpackage;

public class FirstTest {
    public static void main(String[] args) {
        FirstData firstDataAccessModifier = new FirstData();
//        System.out.println(dataAccessModifier.name); // has private access
//        System.out.println(dataAccessModifier.getName()); // has private access
        firstDataAccessModifier.setName("Nguyễn Bá Tuấn Anh");
        firstDataAccessModifier.info();
        System.out.println(firstDataAccessModifier.getName());
    }
}
