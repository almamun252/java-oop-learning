public class Lesson01Output {

    public static void main(String[] args) {

        // Output - print() method
        System.out.print("Hello ");
        System.out.print("Java");

        // Output - println() method
        System.out.println();
        System.out.println("Hello");
        System.out.println("World");

        // Output - Variable print
        String name = "Mamun";
        int age = 19;

        System.out.println(name);
        System.out.println(age);

        // Output - Text + Variable
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Output - Java left-to-right evaluation behavior
        System.out.println("Result: " + 5 + 10);
        System.out.println("Result: " + (5 + 10));


        /*
        
        | Escape sequence | Work               |
        | --------------- | ------------------ |
        | \n              | New line           |
        | \t              | Tab                |
        | \"              | Double quote print |
        | \'              | Single quote       |
        | \\              | Backslash print    |

        */

        // Using escape sequences
        System.out.println("\n--- Escape Sequence Example ---");
        System.out.println("Java\nOOP");
        System.out.println("Name\tAge");
        System.out.println("He said \"Hello\"");
        System.out.println("C:\\Users\\Mamun");


        // Formatted output using printf()
        System.out.println("\n--- Formatted Output ---");

        String fullName = "Abdullah Al Mamun";
        double cgpa = 3.75;
        char grade = 'A';
        boolean active = true;

        System.out.printf("Age: %d%n", age);
        System.out.printf("CGPA: %.2f%n", cgpa);
        System.out.printf("Nickname: %s%n", name);
        System.out.printf("Full Name: %s%n", fullName);
        System.out.printf("Grade: %c%n", grade);
        System.out.printf("Active: %b%n", active);

        // Print multiple variables
        System.out.printf(
            "Name: %s, Age: %d, CGPA: %.2f%n",
            name, age, cgpa
        );
        
    }
}