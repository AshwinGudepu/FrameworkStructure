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

    static String StringReversed="";
    public static String reverseStringUsingRecursion(String original,int len){
        if (len>0){
            StringReversed=StringReversed+original.charAt(len-1);
            len--;
            reverseStringUsingRecursion(original,len);
        }
        return StringReversed;
    }

    public static void main(String[] args) {
        String stringInput = "liril";
        if (checkPalindromeString(stringInput)) {
            System.out.println("Palindrome-->"+stringInput);
        } else {
            System.out.println("Given String is not a palindrome-->"+stringInput);
        }

        int number=121;
        System.out.println("**********>>"+new PalindromeTest().checkPalindromeNumber(number));

        String returnedString=reverseStringUsingRecursion(stringInput,stringInput.length());
        if(returnedString.equals(stringInput)){
            System.out.println("Given word is Palindrome");
        }else{
            System.out.println("Given Word is not Palindrome");
        }
    }
}

