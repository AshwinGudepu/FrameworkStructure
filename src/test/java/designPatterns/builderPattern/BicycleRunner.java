package designPatterns.builderPattern;

public class BicycleRunner {
    public static void main(String args[]) {
        BiCycle biCycle = new BiCycle.Builder().setColour("Blue").setDoubleSeats(1).setGears(true).
                setDoubleStands(1).setCarriers(1).build();
        System.out.println("First Bicylce" +biCycle);

        BiCycle baseCycle = new BiCycle.Builder().setColour("Blue").build();
        System.out.println("Base Bicylce" +baseCycle);

        System.out.println("--------"+baseCycle.getColour());
    }
}
