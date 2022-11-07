import java.util.Arrays;
import java.util.Scanner;

public class SubTask1 {
    public static void main(String[] args) {

        System.out.println("SubTask1");
        System.out.println("args: " + Arrays.toString(args));
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.printf("Result: %.1f\n\n", x + y);

    }

}
