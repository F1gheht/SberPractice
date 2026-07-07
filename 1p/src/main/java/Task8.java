import java.util.Scanner;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char secret = (char) ('A' + random.nextInt(26));
        char guess;

        while (true) {
            System.out.print("Введите букву A-Z: ");
            guess = scanner.next().toUpperCase().charAt(0);

            if (guess == secret) {
                System.out.println("Right");
                break;
            } else if (guess < secret) {
                System.out.println("You're too low");
            } else {
                System.out.println("You're too high");
            }
        }
    }
}