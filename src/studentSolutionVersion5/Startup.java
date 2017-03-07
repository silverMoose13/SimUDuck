package studentSolutionVersion5;

/**
 *
 * @author Aaron
 */

//this class will demonstrate the all three type of ducks being run.
//Also, I have code commented out that can demonstrate the
//flexibility that composition has for this program. All that
//needs to be swapped out is the type of duck. No other code needs
//to change and nothing will break since it is flexible.

public class Startup {

    public static void main(String[] args) {

        PrintService message = new PrintService();
        
        //In theory, I could swap out the Mallard Duck for any kind of duck
        //and the program will not break since it is flexible.
        //This is the powerful advantage composition has over inheritance.
        //The code is commented out just below:
        
        //MallardDuck start
        Duck duckOne = new MallardDuck(new FlyRocketPowered(), new Quack());
        //Duck duckOne = new RubberDuck(new FlyRocketPowered(), new Quack());
        //Duck duckOne = new ModelDuck(new FlyRocketPowered(), new Quack());

        duckOne.display();
        duckOne.performFly();
        duckOne.performQuack();
        duckOne.setFlyBehavior(new FlyNoWay());
        //composition also can perform run time changes which is another plus
        //each duck object supplied an example
        message.printMessage("Demonstrating run-time change capabilities:");
        duckOne.performFly();
        message.printMessage("");

        //ModelDuck start
        Duck duckTwo = new ModelDuck(new FlyNoWay(), new Quack());
        //Duck duckTwo = new RubberDuck(new FlyNoWay(), new Quack());
        //Duck duckTwo = new MallardDuck(new FlyNoWay(), new Quack());

        duckTwo.display();
        duckTwo.performFly();
        duckTwo.performQuack();
        duckTwo.setQuackBehavior(new MuteQuack());
        message.printMessage("Demonstrating run-time change capabilities:");
        duckTwo.performQuack();
        message.printMessage("");

        //RubberDuck start
        Duck duckThree = new RubberDuck(new FlyNoWay(), new Squeak());
        //Duck duckThree = new MallardDuck(new FlyNoWay(), new Squeak());
        //Duck duckThree = new ModelDuck(new FlyNoWay(), new Squeak());

        duckThree.display();
        duckThree.performFly();
        duckThree.performQuack();
        duckThree.setFlyBehavior(new FlyWithWings());
        message.printMessage("Demonstrating run-time change capabilities:");
        duckThree.performFly();
    }
}
