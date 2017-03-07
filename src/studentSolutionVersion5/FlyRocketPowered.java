package studentSolutionVersion5;

public class FlyRocketPowered implements FlyBehavior {

    private PrintService message;

    public FlyRocketPowered() {
        message = new PrintService();
    }

    //not the job of this class to print
    @Override
    public final void fly() {
        message.printMessage("I'm flying with a rocket");
    }
}
