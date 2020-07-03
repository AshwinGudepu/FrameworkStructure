package stringExamples.StrTokenizerExample;

public class PalindromeTest {

    public static boolean checkPalindromeString(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true;
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return checkPalindromeString(str.substring(1, str.length() - 1));
        return false;
    }

    int reminder=0;
    int quotient=0;
    int sum=0;

    public  int checkPalindromeNumber(int value) {
        if(value!=0) {
            reminder = value % 10;
            sum = sum*10+reminder;
            quotient = value / 10;
            value = quotient;
            return checkPalindromeNumber(value);
        }
        return sum;
    }

    public static void main(String[] args) {
        String strInput = "madam";
        if (checkPalindromeString(strInput)) {
            System.out.println(strInput + " is palindrome");
        } else {
            System.out.println(strInput + " not a palindrome");
        }
        int number=121;
        System.out.println("**********>>"+new PalindromeTest().checkPalindromeNumber(number));
    }
}

