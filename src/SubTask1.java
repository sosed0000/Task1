import java.util.Scanner;

public class SubTask1 {
    public static void main(String[] args) {

        if (args.length != 2) args = readFromConsole();

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.printf("x + y = %.1f", x + y);

    }

    public static String[] readFromConsole() {
        String[] input = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        input[0] = sc.next();
        System.out.print("Enter the second number (y): ");
        input[1] = sc.next();
        return input;
    }
}
