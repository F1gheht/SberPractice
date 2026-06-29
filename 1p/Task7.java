import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");
        for(int i = 3; i <= n; i++){

            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}
