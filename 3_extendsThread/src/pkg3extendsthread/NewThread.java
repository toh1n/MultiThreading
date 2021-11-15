
package pkg3extendsthread;

/**
 *
 * @author tohin
 */
public class NewThread extends Thread{
    
    NewThread()
    {
        super("tohin");
        System.out.println("Child thread : "+this);
        start();
    }
    public void run()
    {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Child thread exiting.");
    }
    
}
