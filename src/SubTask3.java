public class SubTask3 {
    public static void main(String[] args) {
        args = new String[]{"12", "36"};

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }

        System.out.println(x);

    }

}