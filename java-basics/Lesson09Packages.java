import packageexamples.PackageMessage;

public class Lesson09Packages {

    public static void main(String[] args) {

        // Demonstrate a class in the unnamed (default) package
        System.out.println("--- Default Package ---");
        System.out.println("This class has no package declaration.");


        // Call a method using its fully qualified class name
        System.out.println("\n--- Fully Qualified Class Name ---");

        packageexamples.PackageMessage.showMessage();


        // Call a method using the imported class name
        System.out.println("\n--- Import Declaration ---");

        PackageMessage.showMessage();
    }
}