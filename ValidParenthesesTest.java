import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    @Test
    public void testIsValid() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("()"));
        assertTrue(vp.isValid("()[]{}"));
        assertFalse(vp.isValid("(]"));
        assertFalse(vp.isValid("([)]"));

        // Edge case: Empty string
        assertTrue(vp.isValid(""));

        // Edge case: Very long valid sequence
        assertTrue(vp.isValid("({[]})".repeat(1000))); // Repeat pattern 1000 times
    }
}
