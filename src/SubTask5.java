public class SubTask5 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        StringBuilder sb = new StringBuilder("");

        for (int i = 2; i <= n; i++) {
            if (i == 2 || i == 3) sb.append(i).append(" ");

            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) break;
                if (j == (i / 2) ) sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
