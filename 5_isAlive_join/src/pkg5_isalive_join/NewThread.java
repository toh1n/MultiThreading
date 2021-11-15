package pkg5_isalive_join;

public class NewThread implements Runnable {
    
        String name;
        Thread t;
        
        NewThread(String threadname){
            name = threadname;
            t = new Thread(this,name);
            System.out.println("tohin : "+t);
            t.start();
        }
        
        public void run(){
            
            try{
                for(int i=5; i>0; i--){
                    
                    System.out.println(name+":"+i);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e){
                
                System.out.println(name+"Interrupted.");
            }
            System.out.println(name+"Exitng.");
  }   
}
