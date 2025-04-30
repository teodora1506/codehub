public class CamelCase {

    public static int countWords(String input) {
        int wordCount = 0;


        if (input.length() > 0) {
            wordCount = 1;
        }

        for (int i = 0; i < input.length(); i++) {

            if (Character.isUpperCase(input.charAt(i))) {
                wordCount++; //
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String input = "CamelCaseExampleString";
        int result = countWords(input);
        System.out.println(" Word count: " + result);
    }
}
