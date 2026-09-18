import java.util.Scanner;

public class Lesson02Input {

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);


        // Input - Integer
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Your age is: " + age);


        /*
        
        Scanner Method     Return Type
        --------------------------------
        nextInt()          int
        nextDouble()       double
        nextFloat()        float
        nextLong()         long
        nextBoolean()      boolean
        next()             String
        nextLine()         String

        */


        // Input - Double
        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println("Your CGPA: " + cgpa);


        // Input - Other data types
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
        // next() reads only one token
        System.out.print("Enter your nickname: ");
        String nickname = input.next();

        System.out.println("Nickname: " + nickname);


        // Consume the leftover newline before using nextLine()
        input.nextLine();


        // Input - String using nextLine()
        // nextLine() reads the remaining/full line
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Full Name: " + fullName);


        // Input - Character
        // Scanner has no nextChar(), so read a String and take its first character
        System.out.print("Enter your grade: ");
        char grade = input.next().charAt(0);

        System.out.println("Grade: " + grade);


        // Close the Scanner after all input operations are finished
        input.close();
    }
}