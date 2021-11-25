package pkg1_reading_string;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new 
                       BufferedReader(new InputStreamReader(System.in));
        String z;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            z = br.readLine();
            System.out.println(z);
        } while (!z.equals("stop"));
    }
    
}
