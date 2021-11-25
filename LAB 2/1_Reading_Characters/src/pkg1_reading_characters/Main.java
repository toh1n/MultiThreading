package pkg1_reading_characters;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        char x;
        BufferedReader br = new 
                   BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter characters, 'q' to quit.");

        do {
            x = (char) br.read();
            System.out.println(x);
        } while (x != 'q');
    }
    
}
