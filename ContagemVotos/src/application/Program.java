package application;

import entities.Candidato;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        String input = "..\\input.txt";

        Map<String, Integer> candidatosMap = new LinkedHashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            String line = br.readLine();

            while ( line != null){
                String[] field = line.split(",");
                String name = field[0];
                int vote = Integer.parseInt(field[1]);

                if(candidatosMap.containsKey(name) == true){
                    vote += candidatosMap.get(name);
                }
                candidatosMap.put(name,vote);

                line = br.readLine();
            }

            System.out.println("Resultado da eleição:");
            for (String key: candidatosMap.keySet()) {
                System.out.println(key + ": " + candidatosMap.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }



}

