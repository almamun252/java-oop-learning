import java.util.Scanner;

public class Lesson05Array {

    public static void main(String[] args) {

        // Create an array using an array initializer
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("--- Array Initialization ---");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        // Create an array with a fixed length and assign values
        int[] marks = new int[5];

        marks[0] = 80;
        marks[1] = 75;
        marks[2] = 90;
        marks[3] = 85;
        marks[4] = 95;

        System.out.println("\n--- Array Element Access ---");

        System.out.println("First mark: " + marks[0]);
        System.out.println("Third mark: " + marks[2]);


        // Modify an existing array element
        marks[2] = 100;

        System.out.println("\n--- Array Element Modification ---");
        System.out.println("Updated third mark: " + marks[2]);


        // Access the array length and its last element
        System.out.println("\n--- Array Length ---");

        System.out.println("Total marks: " + marks.length);
        System.out.println("Last mark: " + marks[marks.length - 1]);



        // Traverse the array using a normal for loop
        System.out.println("\n--- Array Traversal Using Normal For Loop ---");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }


        // Traverse the array using an enhanced for loop
        System.out.println("\n--- Array Traversal Using Enhanced For Loop ---");

        for (int number : numbers) {
            System.out.println(number);
        }



        // Modify array elements using their indices
        System.out.println("\n--- Array Modification Using For Loop ---");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        for (int number : numbers) {
            System.out.println(number);
        }


        // Read the array size and elements from the user
        System.out.println("\n--- Array Input Using Scanner ---");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] userNumbers = new int[size];

        System.out.print("Enter " + size + " integers: ");

        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = input.nextInt();
        }


        // Print the user-provided array elements
        System.out.println("\n--- User Array Elements ---");

        for (int number : userNumbers) {
            System.out.println(number);
        }


        // Calculate the sum of the array elements
        System.out.println("\n--- Array Sum ---");

        int arraySum = 0;

        for (int number : userNumbers) {
            arraySum += number;
        }

        System.out.println("Array Sum: " + arraySum);



        // Find the maximum and minimum elements of the user-provided array
        System.out.println("\n--- Maximum and Minimum Elements ---");

        if (userNumbers.length > 0) {

            int maximum = userNumbers[0];
            int minimum = userNumbers[0];

            for (int i = 1; i < userNumbers.length; i++) {

                if (userNumbers[i] > maximum) {
                    maximum = userNumbers[i];
                }

                if (userNumbers[i] < minimum) {
                    minimum = userNumbers[i];
                }
            }

            System.out.println("Maximum element: " + maximum);
            System.out.println("Minimum element: " + minimum);

        } else {
            System.out.println("The array is empty.");
        }



        // Calculate the average of the user-provided array
        System.out.println("\n--- Array Average ---");

        if (userNumbers.length > 0) {

            double average = (double) arraySum / userNumbers.length;

            System.out.printf("Array Average: %.2f%n", average);

        } else {
            System.out.println("Cannot calculate the average of an empty array.");
        }



        // Create a 2D array and access individual elements
        System.out.println("\n--- 2D Array Initialization and Indexing ---");

        int[][] studentMarks = {
            {80, 75, 90},
            {85, 70, 95},
            {60, 80, 88}
        };

        System.out.println("Total rows: " + studentMarks.length);
        System.out.println("Elements in first row: " + studentMarks[0].length);

        System.out.println("First student's second mark: " + studentMarks[0][1]);
        System.out.println("Second student's third mark: " + studentMarks[1][2]);


        // Traverse a 2D array using nested for loops
        System.out.println("\n--- 2D Array Traversal ---");

        for (int i = 0; i < studentMarks.length; i++) {

            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
            }

            System.out.println();
        }


        // Create and traverse a jagged array with different row lengths
        System.out.println("\n--- Jagged Array ---");

        int[][] jaggedArray = {
            {10, 20},
            {30, 40, 50},
            {60}
        };

        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }

            System.out.println();
        }



        // Read the dimensions and elements of a 2D array
        System.out.println("\n--- 2D Array Input Using Scanner ---");

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }


        // Print the user-provided 2D array
        System.out.println("\n--- User Matrix ---");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }


        // Calculate the sum of each row
        System.out.println("\n--- Matrix Row Sum ---");

        for (int i = 0; i < matrix.length; i++) {

            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum: " + rowSum);
        }


        // Calculate the sum of each column
        System.out.println("\n--- Matrix Column Sum ---");

        for (int j = 0; j < columns; j++) {

            int columnSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum: " + columnSum);
        }



        // Calculate the sum of all matrix elements
        System.out.println("\n--- Total Matrix Sum ---");

        int totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
        }

        System.out.println("Total Matrix Sum: " + totalSum);



        // Demonstrate that assigning an array copies its reference, not its elements
        System.out.println("\n--- Array Reference ---");

        int[] original = {10, 20, 30};

        int[] sameArray = original;

        sameArray[0] = 100;

        System.out.println("Original first element: " + original[0]);
        System.out.println("Assigned array first element: " + sameArray[0]);



        // Create a separate array using clone()
        System.out.println("\n--- Array Cloning ---");

        int[] copiedArray = original.clone();

        copiedArray[0] = 500;

        System.out.println("Original first element: " + original[0]);
        System.out.println("Copied array first element: " + copiedArray[0]);


        input.close();

    }
}