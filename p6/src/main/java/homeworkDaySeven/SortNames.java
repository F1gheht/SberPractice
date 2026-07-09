package main.java.homeworkDaySeven;

import java.io.*;
import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("listNames.txt"));
        String line = reader.readLine();
        reader.close();

        String[] names = line.split(", ");
        Arrays.sort(names);

        BufferedWriter writer = new BufferedWriter(new FileWriter("SortedNames.txt"));
        for (String name : names) {
            writer.write(name);
            writer.newLine();
        }
        writer.close();

        System.out.println("Готово, результат в SortedNames.txt");
    }
}
