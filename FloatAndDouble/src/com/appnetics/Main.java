package com.appnetics;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("my max float value is " + myMaxFloatValue);
        System.out.println("my Min float value is "+ myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("my max double value is " + myMaxDoubleValue);
        System.out.println("my Min double value is "+ myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myThirdFloatValue = (float) 5.25;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("my integer value is " + myIntValue);
        System.out.println("my float value is " + myFloatValue);
        System.out.println("my double value is " + myDoubleValue);



    }
}
