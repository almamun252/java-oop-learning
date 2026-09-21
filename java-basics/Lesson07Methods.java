public class Lesson07Methods {

    // Add two integers and return their sum
    static int add(int a, int b) {
        return a + b;
    }

    // Print a welcome message without parameters or a return value
    static void welcome() {
        System.out.println("Welcome to Java OOP!");
    }


    // Print a name received through a parameter
    static void printName(String name) {
        System.out.println("Name: " + name);
    }


    // Return a fixed integer without receiving any parameters
    static int getNumber() {
        return 100;
    }


    // Check age and exit the method early when the person is a minor
    static void checkAge(int age) {

        if (age < 18) {
            System.out.println("You are a minor.");
            return;
        }

        System.out.println("You are an adult.");
    }


    // Multiply two integers
    static int multiply(int a, int b) {
        return a * b;
    }


    // Multiply two double values
    static double multiply(double a, double b) {
        return a * b;
    }


    // Multiply three integers
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }


    // Demonstrate that changing a primitive parameter does not change the caller's variable
    static void changeNumber(int number) {
        number = 100;

        System.out.println("Inside method: " + number);
    }


    // Modify an element of the array received through a reference parameter
    static void changeArray(int[] arr) {
        arr[0] = 100;
    }


    // Reassign the local array parameter without changing the caller's reference
    static void replaceArray(int[] arr) {
        arr = new int[]{100, 200, 300};
    }



    // Create an integer array and return its reference
    static int[] createArray() {

        int[] numbers = {10, 20, 30};

        return numbers;
    }


    // Print numbers from n down to 1 using recursion
    static void countdown(int n) {

        if (n <= 0) {
            return;
        }

        System.out.println(n);

        countdown(n - 1);
    }



    // Calculate factorial using recursion
    static int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers.");
        }

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }



    public static void main(String[] args) {

        // Call the add() method with different arguments
        System.out.println("--- Method Calling ---");
        
        int result1 = add(10,20);
        int result2 = add(50,30);

        System.out.println("First Sum: " + result1);
        System.out.println("Second Sum: " + result2);


        // Use the returned value in another calculation
        System.out.println("\n--- Using Return Values ---");

        int total = add(result1, result2);
        System.out.println("Total: " + total);


        // Call a method without parameters or a return value
        System.out.println("\n--- No Parameter, No Return Value ---");

        welcome();


        // Pass a String argument to a void method
        System.out.println("\n--- With Parameter, No Return Value ---");

        printName("Mamun");



        // Store the value returned by a method without parameters
        System.out.println("\n--- No Parameter, With Return Value ---");

        int number = getNumber();

        System.out.println("Number: " + number);


        // Demonstrate early return in a void method
        System.out.println("\n--- Early Return ---");

        checkAge(15);
        checkAge(20);


        // Call overloaded methods using different argument types and counts
        System.out.println("\n--- Method Overloading ---");

        int result3 = multiply(2, 3);
        double result4 = multiply(2.5, 3.0);
        int result5 = multiply(2, 3, 4);

        System.out.println("Two integers: " + result3);
        System.out.println("Two doubles: " + result4);
        System.out.println("Three integers: " + result5);



        // Compare primitive values before and after a method call
        System.out.println("\n--- Pass-by-Value: Primitive ---");

        int originalNumber = 10;

        System.out.println("Before method: " + originalNumber);

        changeNumber(originalNumber);

        System.out.println("After method: " + originalNumber);



        // Observe how modifying an array element is visible to the caller
        System.out.println("\n--- Pass-by-Value: Array Modification ---");

        int[] numbers = {10, 20, 30};

        System.out.println("Before method: " + numbers[0]);

        changeArray(numbers);

        System.out.println("After method: " + numbers[0]);



        // Show that reassigning an array parameter does not replace the caller's array
        System.out.println("\n--- Pass-by-Value: Reference Reassignment ---");

        replaceArray(numbers);

        System.out.println("After reassignment: " + numbers[0]);



        // Return an array from a method and modify its elements
        System.out.println("\n--- Returning an Array from a Method ---");

        int[] createdNumbers = createArray();

        System.out.println("First element: " + createdNumbers[0]);

        createdNumbers[0] = 100;

        System.out.println("Updated first element: " + createdNumbers[0]);



        // Call a recursive method to print numbers in descending order
        System.out.println("\n--- Method Recursion ---");

        countdown(5);



        // Calculate and print factorial using a recursive method
        System.out.println("\n--- Recursive Factorial ---");

        int factorialResult = factorial(5);

        System.out.println("Factorial of 5: " + factorialResult);


    }
    
}
