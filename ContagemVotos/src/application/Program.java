package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String input = "..\\input.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            String line = br.readLine();

            while ( line != null){
                
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
