package packageexamples;

public class PackageMessage {

    // Display a message that other classes can call
    public static void showMessage() {
        System.out.println("Message from PackageMessage class!");
    }


    // Run this class independently
    public static void main(String[] args) {
        System.out.println("Hello from a named package!");
    }
}