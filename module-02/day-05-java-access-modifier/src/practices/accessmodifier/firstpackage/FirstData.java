package practices.accessmodifier.firstpackage;

public class FirstData {
    private String name;
    private void helloJava() {
        System.out.println("Hello Java!");
    }

    protected void info() {
        System.out.println("Hey I am " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
