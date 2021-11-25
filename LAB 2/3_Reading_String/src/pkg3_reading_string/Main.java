package pkg3_reading_string;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new 
                         BufferedReader(new InputStreamReader(System.in));
        
        String x[] = new String[100];
        
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        
        for(int i = 0; i < 100; i++) {
            x[i] = br.readLine();
            if (x[i].equals("stop")) {
                break;
            }
        }
        
        System.out.println("\nHere is your file:");
        for (int i = 0; i < 100; i++) {
            if (x[i].equals("stop")) {
                break;
            }
            System.out.println(x[i]);
        }
    }
    
}
