package practices.fruit;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/13/2020
 * Time: 9:40 AM
 */
public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
