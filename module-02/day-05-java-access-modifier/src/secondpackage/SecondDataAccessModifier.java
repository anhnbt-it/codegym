package secondpackage;

import firstpackage.FirstDataAccessModifier;

public class SecondDataAccessModifier extends FirstDataAccessModifier {
    private int age;

    public SecondDataAccessModifier() {
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void say() {
        System.out.println("Mama!");
    }

    void getInfo() {
        SecondDataAccessModifier secondDataAccessModifier = new SecondDataAccessModifier();
        secondDataAccessModifier.setName("Nguyễn Bá Tùng Lâm");
        secondDataAccessModifier.info();
    }
}
