import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPalindrome {
    int i;
    public boolean isPalindrome(String token){
        i++;
        if (i < token.length()/2){
            if(token.charAt(i) != token.charAt(token.length() - i - 1)){
                return false;
            }
            else{
                return isPalindrome(token);
            }
        }
        else{
            return true;
        }
    }

    @Test
    public void testPalindrome(){
        i = -1;
        Assertions.assertTrue(isPalindrome("abba"));
        i = -1;
        Assertions.assertFalse(isPalindrome("hello"));
    }
}
