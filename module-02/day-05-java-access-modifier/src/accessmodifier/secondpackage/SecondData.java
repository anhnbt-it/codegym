package accessmodifier.secondpackage;

import accessmodifier.firstpackage.FirstData;

public class SecondData extends FirstData {
    private int age;

    public SecondData() {
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
        SecondData secondDataAccessModifier = new SecondData();
        secondDataAccessModifier.setName("Nguyễn Bá Tùng Lâm");
        secondDataAccessModifier.info();
    }
}
