package java8Tasks.Lambdas;

public class StringRotation {

    public static void rotationalString(String firstString, String secondString) {
        String firstName = firstString;
        String keyString = secondString;
        String contTwoStrings = firstName.concat(firstName);
        if (firstName.length() == keyString.length()) {
            if (contTwoStrings.contains(keyString)) {
                System.out.println("ROTATIONAL STRING");
            } else {
                System.out.println("NON ROTATIONAL STRING");
            }
        }
    }

    public static void applyingFuncRotationalString(String firstString, String secondString) {
        RotationalFuncInterface rotationalFuncInterface=(firstKey,secondKey)-> {
            String firstName = firstString;
            String keyString = secondString;
            String contTwoStrings = firstName.concat(firstName);
            if (firstName.length() == keyString.length()) {
                if (contTwoStrings.contains(keyString)) {
                    System.out.println("Functional Interface ROTATIONAL STRING");
                } else {
                    System.out.println("Functional Interface NON ROTATIONAL STRING");
                }
            }
        };
        rotationalFuncInterface.firstStringAndKeyString(firstString,secondString);
    }

    public static void main(String[] args) {
        StringRotation stringRotation = new StringRotation();
        StringRotation.rotationalString("FIRSTSTRING","IRSTSTRINGF");
        StringRotation.rotationalString("FIRSTSTRING","RSTSTRINGFI");
        StringRotation.rotationalString("FIRSTSTRING","SRTSTRINGFI");

        StringRotation.applyingFuncRotationalString("HELLOUSER","RHELLOUSE");
        StringRotation.applyingFuncRotationalString("HELLOUSER","HRELLOUSE");
    }
}
