public class SubTask4 {
    public static void main(String[] args) {

        args = new  String[] {"12302"};

        int x = Integer.parseInt(args[0]);
        int sum = 0;
        while (x != 0) {
            sum += (x % 10);
            x /= 10;
        }

        System.out.println(sum);

    }
}
