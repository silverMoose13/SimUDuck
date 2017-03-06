package studentSolutionVersion5;

public class MuteQuack implements QuackBehavior {

    private PrintService message;

    public MuteQuack() {
        message = new PrintService();
    }

    //not the job of this class to print
    public void quack() {
        message.printMessage("<< Silence >>");
    }

}
