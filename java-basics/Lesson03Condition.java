import java.util.Scanner;

public class Lesson03Condition {

    public static void main(String[] args) {

        // Boolean expressions using a fixed age
        int age = 20;

        System.out.println(age >= 18);
        System.out.println(age < 18);


        // Simple if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }


        // if-else statement
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // else-if ladder for grade classification
        int marks = 75;

        if (marks >= 80) {
            System.out.println("Grade: A+");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: A-");
        } else {
            System.out.println("Grade: Below A-");
        }


        // Logical AND: both conditions must be true
        boolean hasNid = true;

        if (age >= 18 && hasNid) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }


        // Logical OR: at least one condition must be true
        boolean isFriday = false;
        boolean isHoliday = true;

        if (isFriday || isHoliday) {
            System.out.println("No class today");
        }


        // Logical NOT: reverses a boolean value
        boolean active = true;

        System.out.println("Active: " + active);
        System.out.println("Not active: " + !active);


        // Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);


        // Nested if-else using age and NID status
        System.out.print("Enter the person's age: ");
        int personAge = input.nextInt();

        System.out.print("Does the person have an NID (true/false): ");
        boolean hasNidCard = input.nextBoolean();

        if (personAge >= 18) {

            if (hasNidCard) {
                System.out.println("Eligible");
            } else {
                System.out.println("NID card required");
            }

        } else {
            System.out.println("Age requirement not fulfilled");
        }


        // Traditional switch statement using case and break
        System.out.print("Enter a day number (1-3): ");
        int day = input.nextInt();

        System.out.println("--- Traditional switch statement ---");

        switch (day) {

            case 1:
                System.out.println("Saturday");
                break;

            case 2:
                System.out.println("Sunday");
                break;

            case 3:
                System.out.println("Monday");
                break;

            default:
                System.out.println("Invalid day");
        }


        // Modern switch expression using arrow-style cases
        System.out.println("--- Modern switch expression ---");

        String dayName = switch (day) {
            case 1 -> "Saturday";
            case 2 -> "Sunday";
            case 3 -> "Monday";
            default -> "Invalid day";
        };

        System.out.println("Day: " + dayName);


        // Ternary operator: select a value based on a condition
        System.out.println("\n--- Ternary Operator ---");

        String ageStatus = (personAge >= 18) ? "Adult" : "Minor";

        System.out.println("Age status: " + ageStatus);


        // Ternary operator: check whether a number is even or odd
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        String numberType = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number type: " + numberType);


        // Ternary operator: find the maximum of two integers
        System.out.print("Enter the first integer: ");
        int a = input.nextInt();

        System.out.print("Enter the second integer: ");
        int b = input.nextInt();

        int maximum = (a > b) ? a : b;

        System.out.println("Maximum number: " + maximum);

        input.close();
    }
}