import java.util.Arrays;

public class SubTask4 {
    public static void main(String[] args) {

        System.out.println("SubTask4");
        System.out.println("args: " + Arrays.toString(args));
        int x = Integer.parseInt(args[0]);
        int sum = 0;
        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }

        System.out.printf("Result: %d\n\n",sum);

    }
}
