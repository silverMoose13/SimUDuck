package studentSolutionVersion5;

public class Squeak implements QuackBehavior {

    private PrintService message;

    public Squeak() {
        message = new PrintService();
    }

    //not the job of this class to print
    @Override
    public final void quack() {
        message.printMessage("Squeak");
    }

}
