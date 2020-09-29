import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test_isPalindrom() {
        Solution s = new Solution();
        Assert.assertTrue(s.isPalindrom("aba"));
        Assert.assertTrue(s.isPalindrom("abba"));
        Assert.assertTrue(s.isPalindrom("abcdcba"));
        Assert.assertFalse(s.isPalindrom("ab"));
        Assert.assertFalse(s.isPalindrom("abcb"));
    }

    @Test
    public void test_longestPalindrome() {
        Solution s = new Solution();
        Assert.assertEquals(s.longestPalindrome("bb"), "bb");
        Assert.assertEquals(s.longestPalindrome("babad"), "bab");
    }

}
