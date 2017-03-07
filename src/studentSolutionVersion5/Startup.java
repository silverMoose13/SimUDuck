package studentSolutionVersion5;

/**
 *
 * @author Aaron
 */
public class Startup {

    public static void main(String[] args) {

        PrintService message = new PrintService();
        Duck duckOne = new MallardDuck(new FlyRocketPowered(), new Quack());

        duckOne.display();
        duckOne.performFly();
        duckOne.performQuack();
        duckOne.setFlyBehavior(new FlyNoWay());
        message.printMessage("Demonstrating run-time change capabilities:");
        duckOne.performFly();
        message.printMessage("");

        //create the ModelDuck
        Duck duckTwo = new ModelDuck(new FlyNoWay(), new Quack());

        duckTwo.display();
        duckTwo.performFly();
        duckTwo.performQuack();
        duckTwo.setQuackBehavior(new MuteQuack());
        message.printMessage("Demonstrating run-time change capabilities:");
        duckTwo.performQuack();
        message.printMessage("");

        //create the RubberDuck
        Duck duckThree = new RubberDuck(new FlyNoWay(), new Squeak());

        duckThree.display();
        duckThree.performFly();
        duckThree.performQuack();
        duckThree.setFlyBehavior(new FlyWithWings());
        message.printMessage("Demonstrating run-time change capabilities:");
        duckThree.performFly();
    }
}
