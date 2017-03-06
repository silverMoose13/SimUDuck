package studentSolutionVersion5;
/**
 * The main difference with this 5th version is that the class
 * provides methods for setting fly and quack behaviors at runtime.
 * Otherwise, everything else is the same.
 * 
 * @author jlombardo
 *
 */
public interface Duck {

	public abstract void setFlyBehavior(FlyBehavior fb);
	
	public abstract void setQuackBehavior(QuackBehavior qb);
	
	public abstract void display();
	
	public abstract void performQuack();
	
	public abstract void performFly();
	
}
