
package pkg4multiplethread;

public class Main {

    public static void main(String[] args) {
        new NewThread("tohin");
        new NewThread("danbir");
        new NewThread("sazzad");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
    
}
