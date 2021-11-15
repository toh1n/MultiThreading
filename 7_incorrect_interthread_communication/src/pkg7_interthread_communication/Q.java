
package pkg7_interthread_communication;

public class Q {
    
    int n;
    synchronized int get(){
    
        this.n = n;
        System.out.println("Got : " + n);
        return n;
    }
    
    synchronized void put(int n){
    
        this.n = n;
        System.out.println("Put : " + n);
    }
    
}
