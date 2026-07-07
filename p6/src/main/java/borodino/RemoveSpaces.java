package borodino;

import java.io.*;

public class RemoveSpaces {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Borodino.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("BorodinoResult.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String cleanLine = line.trim().replaceAll(" +", " ");
            writer.write(cleanLine);
            writer.newLine();
        }

        reader.close();
        writer.close();

        System.out.println("Готово, результат в BorodinoResult.txt");
    }
}
