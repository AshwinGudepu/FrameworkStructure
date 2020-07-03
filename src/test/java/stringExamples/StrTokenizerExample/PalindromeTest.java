package stringExamples.StrTokenizerExample;

public class PalindromeTest {

    public static boolean checkPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return checkPalindrome(str.substring(1, str.length() - 1));
        return false;
    }

    public static void main(String[] args) {

        String strInput = "madam";
        if (checkPalindrome(strInput)) {
            System.out.println(strInput + " is palindrome");
        } else {
            System.out.println(strInput + " not a palindrome");
        }
    }
}

