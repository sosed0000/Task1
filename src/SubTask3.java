import java.util.Arrays;

public class SubTask3 {
    public static void main(String[] args) {

        System.out.println("SubTask3");
        System.out.println("args: " + Arrays.toString(args));
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        System.out.printf("Result: %d\n\n", x);

    }

}
