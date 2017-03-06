package studentSolutionVersion5;

/**
 *
 * @author Aaron
 */

//the responsibility of this class is to provide printing service
//to other classes that don't require that responsbility. 

public class PrintService {
    
    public void printMessage(String message) {
        System.out.print(message + "\n");
    }
    
}
