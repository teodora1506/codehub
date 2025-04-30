import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word, int start, int end) {

            if (start >= end) {
                return true;
            }

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            return isPalindrome(word, start + 1, end - 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();


            if (isPalindrome(word.toLowerCase(), 0, word.length() - 1)) {
                System.out.println("Yes, palindrome!");
            } else {
                System.out.println("No, word isn't palindrome");
            }
        }
    }
