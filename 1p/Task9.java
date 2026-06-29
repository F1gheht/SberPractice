/** три переменные a, b и c записаны три вещественных числа. Создать
*программу, которая будет находить и выводить на экран вещественные корни
*квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.*/
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (D == 0) {
            double x = -b / (2 * a);

            System.out.println("x = " + x);

        } else {
            System.out.println("Корней нет.");
        }
    }
}