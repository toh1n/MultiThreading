
package pkg1currentthread;

public class Main {

    public static void main(String[] args) {
        
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t);

        t.setName("Mazharul Islam Tohin");
        System.out.println("After changing name of the Thread : " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("System is Interrupted");

        }
    }
    
}
