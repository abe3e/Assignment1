import java.util.*; // Importing necessary utilities, including Stack

public class ValidParentheses {
    // Method to check if the given string of parentheses is valid
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // Creating a stack to track opening brackets

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push its corresponding closing bracket onto the stack
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
                // If it's a closing bracket, check if it matches the expected closing bracket from the stack
            else if (stack.isEmpty() || stack.pop() != c)
                return false; // If stack is empty or top of stack doesn't match, return false
        }

        // If the stack is empty at the end, all brackets matched correctly
        return stack.isEmpty();
    }
}
