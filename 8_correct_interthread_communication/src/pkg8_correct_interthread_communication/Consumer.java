
package pkg8_correct_interthread_communication;

public class Consumer implements Runnable {
    
    Q q;
    
    Consumer(Q q){
    
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while (true) {
            q.get();
        }
    }  
}