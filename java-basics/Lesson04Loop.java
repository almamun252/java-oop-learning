import java.util.Scanner;

public class Lesson04Loop {

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Print numbers from 1 to n using a for loop
        System.out.print("Enter the last number: ");
        int n = input.nextInt();

        System.out.println("\n--- Forward Counting ---");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


        // Print numbers from n down to 1 using a for loop
        System.out.println("\n--- Reverse Counting ---");

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }


        // Calculate the sum of numbers from 1 to n using a for loop
        System.out.println("\n--- Sum of Numbers ---");

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;

            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("\nSum from 1 to " + n + ": " + sum);


        // Print even numbers from 1 to n
        System.out.println("--- Print even numbers ---");
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }

        }


        // Calculate the sum of even numbers from 1 to n
        System.out.println("\n--- Sum of Even Numbers ---");

        int evenSum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                evenSum += i;

                System.out.println("i = " + i + ", evenSum = " + evenSum);
            }

        }

        System.out.println("\nSum of even numbers from 1 to " + n + ": " + evenSum);


        // Demonstrate the execution order of nested for loops
        System.out.println("\n--- Nested For Loop ---");

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }

        }


        // Print a right-angled triangle using nested for loops
        System.out.println("\n--- Triangle Pattern ---");

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        
        
        // Print numbers from 1 to n using a while loop
        System.out.println("\n--- While Loop ---");

        int whileCounter = 1;

        while (whileCounter <= n) {
            System.out.println(whileCounter);
            whileCounter++;
        }


        // Print numbers from 1 to n using a do-while loop
        System.out.println("\n--- Do-While Loop ---");

        int doWhileCounter = 1;

        do {
            System.out.println(doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter <= n);

        
        // Stop the for loop when the counter reaches 5
        System.out.println("\n--- Break Statement ---");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }


        // Skip the number 5 without stopping the for loop
        System.out.println("\n--- Continue Statement ---");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }



        input.close();
    }
}