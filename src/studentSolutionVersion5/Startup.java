package studentSolutionVersion5;

/**
 *
 * @author Aaron
 */
public class Startup {
    public static void main(String[] args) {
        
        PrintService message = new PrintService();
        Duck duck = new MallardDuck(new FlyRocketPowered(), new Quack());
        
        
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        message.printMessage("\nDemonstrating run-time change capabilities:");
        duck.performFly();
        
        
        //create the ModelDuck
        
        
        //create the RubberDuck
        
        
    }
}
