package miscellaneous;

import org.testng.annotations.Test;

public class DecimalToRomanConversion {

    @Test
    public static void decToRomanConversion() {
        {
            int num = 2349;
            if (num > 0 & num < 4000) //checking whether the number entered is within the range [1-3999]
            {
                /*Saving the Roman equivalent of the thousand, hundred, ten and units place of a decimal number*/
                String thou[] = {"", "M", "MM", "MMM"};
                String hund[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
                String ten[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
                String unit[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

                /*Finding the digits in the thousand, hundred, ten and units place*/
                int th = num / 1000;       //2349/1000-----------> 2
                int h = (num / 100) % 10; //(2349/100)-->23%10--->3
                int t = (num / 10) % 10;  //(2349/10)--->234%10-->4
                int u = num % 10;        //2349%10--------------->9

                /*Displaying equivalent roman number*/
                System.out.println("Numbers ----------->" + th + " " + h + " " + t + " " + u);

                /*With the help of index printing the below value*/
                System.out.println("Roman Equivalent= " + thou[th] + hund[h] + ten[t] + unit[u]);
            } else
                System.out.println("Enter value between [1-3999]");
        }
    }
}
