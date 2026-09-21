public class Lesson08VariableScope {
    

    // Demonstrate independent local variables in different methods
    static void firstMethod() {

        int number = 10;

        System.out.println("First Method: " + number);
    }


    static void secondMethod() {

        int number = 20;

        System.out.println("Second Method: " + number);
    }


    // Demonstrate the scope of a method parameter
    static void displayAge(int age) {
        System.out.println("Method parameter: " + age);
    }




    public static void main(String[] args) {

        // Access local variables through their respective methods
        System.out.println("--- Local Variable Scope ---");

        firstMethod();
        secondMethod();


        // Access an outer variable from an inner block
        System.out.println("\n--- Outer and Inner Block Scope ---");

        int outerNumber = 100;

        if (outerNumber > 50) {

            int innerNumber = 200;

            System.out.println("Outer variable inside block: " + outerNumber);
            System.out.println("Inner variable inside block: " + innerNumber);
        }

        System.out.println("Outer variable outside block: " + outerNumber);


        // Demonstrate that a method parameter and a caller's variable are independent
        System.out.println("\n--- Method Parameter Scope ---");

        int age = 20;

        displayAge(19);

        System.out.println("Main variable: " + age);


        // Demonstrate that a loop variable can be reused in separate for loops
        System.out.println("\n--- For Loop Variable Scope ---");

        for (int i = 1; i <= 3; i++) {
            System.out.println("First loop: " + i);
        }

        for (int i = 4; i <= 6; i++) {
            System.out.println("Second loop: " + i);
        }



        // Access a variable after a loop when it was declared outside the loop
        System.out.println("\n--- Variable Declared Outside a Loop ---");

        int counter = 1;

        for (; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println("Counter after loop: " + counter);


        // Traverse an array using a variable scoped to the enhanced for loop
        System.out.println("\n--- Enhanced For Loop Variable Scope ---");

        int[] numbers = {10, 20, 30};

        for (int number : numbers) {
            System.out.println(number);
        }



    }
}