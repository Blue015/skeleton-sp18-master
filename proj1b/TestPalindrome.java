import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {

    // You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.
    static Palindrome palindrome = new Palindrome();

    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(palindrome.isPalindrome("awa"));
        assertFalse(palindrome.isPalindrome("cat"));
        assertTrue(palindrome.isPalindrome("a"));
        assertTrue(palindrome.isPalindrome("AaA"));
        assertFalse(palindrome.isPalindrome("Aa"));
    }

    @Test
    public void testOffByOne() {
        CharacterComparator ob = new OffByOne();
        assertTrue(palindrome.isPalindrome("flake", ob));
        assertTrue(palindrome.isPalindrome("", ob));
        assertTrue(palindrome.isPalindrome("acadb", ob));
        assertFalse(palindrome.isPalindrome("cate", ob));
    }

    @Test
    public void testOffBy5() {
        CharacterComparator cc = new OffByN(5);
        assertTrue(palindrome.isPalindrome("", cc));
        assertTrue(palindrome.isPalindrome("a", cc));
        assertFalse(palindrome.isPalindrome("flake", cc));
    }
}
