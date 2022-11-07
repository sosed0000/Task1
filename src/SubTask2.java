public class SubTask2 {
    public static void main(String[] args) {

        args = new String[]{"12", "36"};

        StringBuffer resultRaw = new StringBuffer();

        for (String str:
             args) {
            resultRaw.append(str).append(" ");
        }

        System.out.println(resultRaw.toString().trim());
    }
}
