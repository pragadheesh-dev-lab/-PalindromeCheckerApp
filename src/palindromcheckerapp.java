import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome ignoring case and spaces
    public static boolean isPalindrome(String input) {
        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Optional: remove all non-alphanumeric characters
        // String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        // Two-pointer palindrome check
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}