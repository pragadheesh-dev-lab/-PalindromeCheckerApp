import java.util.*;

publicclass PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize input (remove spaces & convert to lowercase)
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char ch : processed.toCharArray()) {
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        // Compare Queue and Stack
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // Dequeue
            char fromStack = stack.pop();    // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}