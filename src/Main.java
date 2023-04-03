import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y, A, B;

        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        x = scanner.nextDouble();

        A = (2 + x) / Math.pow(x, 2) + 1;

        // спосіб 1: розгалуження в скороченій формі
        if (x < 0) {
            B = Math.pow(x, 3) - 2 * Math.pow(x, 4);
        } else if (0 <= x && x <= 2) {
            B = Math.pow(Math.abs(x) + Math.exp(x), 3);
        } else {
            B = 4 * Math.cos(Math.pow(x, 2) - 2);
        }

        y = A + B;

        System.out.println();
        System.out.println("1) y = " + y);

        // спосіб 2: розгалуження в повній формі
        if (x < 0) {
            B = Math.pow(x, 3) - 2 * Math.pow(x, 4);
        } else if (x > 2) {
            B = 4 * Math.cos(Math.pow(x, 2) - 2);
        } else {
            B = Math.pow(Math.abs(x) + Math.exp(x), 3);
        }

        y = A + B;

        System.out.println("2) y = " + y);

        scanner.close();
    }
}
