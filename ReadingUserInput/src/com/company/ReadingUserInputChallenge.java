package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (count <= 10)
        {
            System.out.println("Enter number #" + count);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt)
            {
                sum += scanner.nextInt();
                count++;
            }else{
                System.out.println("invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("The Sum is " + sum);

    }
}
