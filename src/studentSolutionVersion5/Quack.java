package studentSolutionVersion5;

public class Quack implements QuackBehavior {

    private PrintService message;

    public Quack() {
        message = new PrintService();
    }

    //not the job of this class to print
    @Override
    public final void quack() {
        message.printMessage("Quack");
    }

}
