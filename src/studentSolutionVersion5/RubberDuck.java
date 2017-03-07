package studentSolutionVersion5;

public class RubberDuck implements Duck {

    //properties are encapsulated
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private PrintService message;

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        // these properties are inherited from Duck
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        message = new PrintService();
    }

    @Override
    public final void display() {
        message.printMessage("I'm a rubber duck");
    }

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    @Override
    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        if (flyBehavior == null) {
            throw new IllegalArgumentException("Error: message must not be null.");
        } else {
            this.flyBehavior = flyBehavior;
        }
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        if (quackBehavior == null) {
            throw new IllegalArgumentException("Error: message must not be null.");
        } else {
            this.quackBehavior = quackBehavior;
        }
    }

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }
}
