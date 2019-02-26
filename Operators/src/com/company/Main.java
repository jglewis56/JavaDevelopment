package com.company;

public class Main {

    public static void main(String[] args) {
        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //if the remaining total #4 is equal to or less than 20.
        double myFirstValue = 20d;
        double  mySecondValue = 80d;
        double mySum = (myFirstValue + mySecondValue) * 25d;
        boolean result = mySum % 40 <= 20;
        if(result)
        {
            System.out.println("Total was over the limit");
        }
    }
}
