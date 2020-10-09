package firstpackage;

public class FirstTestAccessModifier {
    public static void main(String[] args) {
        FirstDataAccessModifier firstDataAccessModifier = new FirstDataAccessModifier();
//        System.out.println(dataAccessModifier.name); // has private access
//        System.out.println(dataAccessModifier.getName()); // has private access
        firstDataAccessModifier.setName("Nguyễn Bá Tuấn Anh");
        firstDataAccessModifier.info();
        System.out.println(firstDataAccessModifier.getName());
    }
}
