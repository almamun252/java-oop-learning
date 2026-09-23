// Define the data that each Student object will contain
class Student {

    String name;
    int age;
    double cgpa;
}


public class Lesson01ClassObject {

    public static void main(String[] args) {

        // Create two Student objects and assign their information
        Student student1 = new Student();

        student1.name = "Mamun";
        student1.age = 20;
        student1.cgpa = 3.75;

        Student student2 = new Student();

        student2.name = "Rahim";
        student2.age = 21;
        student2.cgpa = 3.50;


        // Access the information stored in each object
        System.out.println("--- Student 1 ---");

        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("CGPA: " + student1.cgpa);

        System.out.println("\n--- Student 2 ---");

        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("CGPA: " + student2.cgpa);


        // Demonstrate how two reference variables can refer to the same object
        System.out.println("\n--- Object Reference ---");

        Student student3 = new Student();

        student3.name = "Karim";
        student3.age = 22;

        Student student4 = student3;

        System.out.println("Before modification:");
        System.out.println("Student 3 age: " + student3.age);
        System.out.println("Student 4 age: " + student4.age);

        student4.age = 25;

        System.out.println("After modification:");
        System.out.println("Student 3 age: " + student3.age);
        System.out.println("Student 4 age: " + student4.age);

        
    }
}