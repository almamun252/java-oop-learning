import java.util.Scanner;

public class Lesson02Input{
    public static void main (String[] args) {
        // Input - Scanner 
        Scanner input = new Scanner(System.in);

        // Input - Integer
        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        System.out.println("Your age is: " + userAge);

        /*

        Scanner method    Return type
        nextInt()       → int
        nextDouble()    → double
        nextFloat()     → float
        nextLong()      → long
        nextBoolean()   → boolean

        */


        // Input - double
        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println("Your CGPA: " + cgpa);


        // Input - Others Data types

        System.out.print("Enter price: ");
        float price = input.nextFloat();

        System.out.print("Enter population: ");
        long population = input.nextLong();

        System.out.print("Enter active status (true/false): ");
        boolean active = input.nextBoolean();

        System.out.println("Price: " + price);
        System.out.println("Population: " + population);
        System.out.println("Active: " + active);

        

        // Input - String using next()
        // next() -> reads only one word/token

        System.out.print("Enter your Nickname: ");
        String name =  input.next();
        System.out.println("Name : " + name);

        // Consume the Leftover newline after next()
        input.nextLine();


        // Input - String using nextLine()
        // nextLine() -> reads the full line

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Full Name: " + fullName);


        // Input - Character
        System.out.print("Enter your grade: ");
        char grade = input.next().charAt(0);
        System.out.println("Grade: " + grade);

        input.close();
    }
}