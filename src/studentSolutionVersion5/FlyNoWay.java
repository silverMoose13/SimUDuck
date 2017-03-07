package studentSolutionVersion5;

public class FlyNoWay implements FlyBehavior {

    private PrintService message;

    public FlyNoWay() {
        message = new PrintService();
    }

    //it is not the job of this class to print
    @Override
    public final void fly() {
        message.printMessage("I can't fly");
    }

}
