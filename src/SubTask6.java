import java.util.Arrays;

public class SubTask6 {
    public static void main(String[] args) {

        System.out.println("SubTask6");
        System.out.println("args: " + Arrays.toString(args));

        String literalValue = "ax";
        System.out.printf("findColumnNumberByLiteralValue(\"%s\")\n", literalValue);
        System.out.println("Result: " + findColumnNumberByLiteralValue(literalValue));

        int columnNumber = 42;
        System.out.printf("findLiteralValueByColumnNumber(%d)\n", columnNumber);
        System.out.println("Result: " + findLiteralValueByColumnNumber(columnNumber));

        literalValue = "AB";
        System.out.printf("findRightColumnNumberByLiteralValue(\"%s\")\n", literalValue);
        System.out.println("Result: " + findRightColumnNumberByLiteralValue(literalValue));
    }

    public static int findColumnNumberByLiteralValue(String literalValue) {
        char[] chars = literalValue.toUpperCase().toCharArray();
        int length = chars.length;
        int columnNumber = 0;
        for (int i = 0; i < length; i++) {
            columnNumber += (chars[i] - 64) * Math.pow(26, (length - i - 1));
        }
        return columnNumber;
    }

    public static String findLiteralValueByColumnNumber(int columnNumber) {
        StringBuilder literalValue = new StringBuilder();
        while (columnNumber / 26 > 0) {
            literalValue.append((char) ((columnNumber % 26) + 64));
            columnNumber /= 26;
        }
        literalValue.append((char) (columnNumber + 64));
        return literalValue.reverse().toString();
    }

    public static int findRightColumnNumberByLiteralValue(String literalValue) {
       return findColumnNumberByLiteralValue(literalValue) + 1;
    }

}
