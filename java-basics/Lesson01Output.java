public class Lesson01Output {
    public static void main (String[] args) {
        
        // Output - print() Method
        System.out.print("Hello ");
        System.out.print("Java");

        // Output - println() Method
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

        // Output - Java left-to-right evaluate behaviour
        System.out.println("Result: " + 5 + 10);
        System.out.println("Result: " + (5+10));
    }
}