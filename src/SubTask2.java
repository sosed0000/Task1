public class SubTask2 {
    public static void main(String[] args) {

        StringBuilder resultRaw = new StringBuilder();

        for (String str:
             args) {
            resultRaw.append(str).append(" ");
        }

        System.out.println(resultRaw.toString().trim());
    }
}
