package studentSolutionVersion5;

public class FlyWithWings implements FlyBehavior {

    private PrintService message;

    public FlyWithWings() {
        message = new PrintService();
    }

    //not the job of this class to print
    public void fly() {
        message.printMessage("I'm flying!");
    }

}
