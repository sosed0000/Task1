public class SubTask5 {
    public static void main(String[] args) {

        args = new  String[] {"10"};

        int n = Integer.parseInt(args[0]);

        for (int i = 2; i <= n; i++) {

            for (int j = 2; j <= i / 2; j++) {
                System.out.println(i + " "  + j + " " + i % j);
                if (i % j == 0) break;
                if (j == i) System.out.println(i);
            }
        }
    }
}
