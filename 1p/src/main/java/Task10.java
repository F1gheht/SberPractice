import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число (1-100): ");
        int n = scanner.nextInt();

        String result = "";

        switch (n / 10) {
            case 1: result += "X"; break;
            case 2: result += "XX"; break;
            case 3: result += "XXX"; break;
            case 4: result += "XL"; break;
            case 5: result += "L"; break;
            case 6: result += "LX"; break;
            case 7: result += "LXX"; break;
            case 8: result += "LXXX"; break;
            case 9: result += "XC"; break;
        }

        switch (n % 10) {
            case 1: result += "I"; break;
            case 2: result += "II"; break;
            case 3: result += "III"; break;
            case 4: result += "IV"; break;
            case 5: result += "V"; break;
            case 6: result += "VI"; break;
            case 7: result += "VII"; break;
            case 8: result += "VIII"; break;
            case 9: result += "IX"; break;
        }

        if (n == 100) {
            result = "C";
        }

        System.out.println(result);
    }
}