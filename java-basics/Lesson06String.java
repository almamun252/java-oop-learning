public class Lesson06String {

    public static void main(String[] args) {

        // Create String variables using String literals
        String firstName = "Abdullah";
        String lastName = "Al Mamun";

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);


        // Create a String object using the new keyword
        String language = new String("Java");

        System.out.println("Programming Language: " + language);


        // Find the number of characters in a String
        System.out.println("\n--- String Length ---");

        System.out.println("First Name Length: " + firstName.length());
        System.out.println("Last Name Length: " + lastName.length());
        System.out.println("Language Length: " + language.length());


        // Access individual characters using charAt()
        System.out.println("\n--- String Character Access ---");

        System.out.println("First character: " + firstName.charAt(0));
        System.out.println("Third character: " + firstName.charAt(2));

        System.out.println(
            "Last character: " + firstName.charAt(firstName.length() - 1)
        );




        // Extract parts of a String using substring()
        System.out.println("\n--- String Substring ---");

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        System.out.println("First four characters: " + firstName.substring(0, 4));

        System.out.println("First name: " + fullName.substring(0, 8));

        System.out.println("Last part: " + fullName.substring(12));



        // Compare String references and contents
        System.out.println("\n--- String Comparison ---");

        String text1 = "Java";
        String text2 = "Java";

        System.out.println("Literal == Literal: " + (text1 == text2));
        System.out.println("Literal equals Literal: " + text1.equals(text2));

        String text3 = new String("Java");
        String text4 = new String("Java");

        System.out.println("Object == Object: " + (text3 == text4));
        System.out.println("Object equals Object: " + text3.equals(text4));


        // Compare String contents without considering letter case
        System.out.println("\n--- Case-Insensitive String Comparison ---");

        String language1 = "Java";
        String language2 = "java";

        System.out.println("equals(): " + language1.equals(language2));
        System.out.println("equalsIgnoreCase(): " + language1.equalsIgnoreCase(language2));



        // Demonstrate String immutability using toUpperCase()
        System.out.println("\n--- String Immutability ---");

        String originalText = "java";

        String upperText = originalText.toUpperCase();

        System.out.println("Original String: " + originalText);
        System.out.println("Uppercase String: " + upperText);


        // Reassign the String reference to the returned uppercase String
        originalText = originalText.toUpperCase();

        System.out.println("After reassignment: " + originalText);



        // Demonstrate that String reassignment does not modify the original object
        System.out.println("\n--- String Reference Reassignment ---");

        String reference1 = "java";
        String reference2 = reference1;

        reference1 = reference1.toUpperCase();

        System.out.println("Reference 1: " + reference1);
        System.out.println("Reference 2: " + reference2);

        System.out.println("Same object: " + (reference1 == reference2));


        // Convert a String to lowercase without modifying the original
        System.out.println("\n--- String toLowerCase() ---");

        String upperLanguage = "JAVA";

        String lowerLanguage = upperLanguage.toLowerCase();

        System.out.println("Original: " + upperLanguage);
        System.out.println("Lowercase: " + lowerLanguage);



        // Remove leading and trailing spaces from a String
        System.out.println("\n--- String trim() ---");

        String rawName = "   Abdullah Al Mamun   ";

        String cleanName = rawName.trim();

        System.out.println("Original: [" + rawName + "]");
        System.out.println("Trimmed: [" + cleanName + "]");


        // Replace text and characters without modifying the original String
        System.out.println("\n--- String replace() ---");

        String message = "I like Python";

        String updatedMessage = message.replace("Python", "Java");

        System.out.println("Original: " + message);
        System.out.println("Updated: " + updatedMessage);

        String word = "banana";

        System.out.println("Character replacement: " + word.replace('a', 'o'));

        // Check whether a String contains specific text
        System.out.println("\n--- String contains() ---");

        String sentence = "I am learning Java";

        System.out.println("Contains Java: " + sentence.contains("Java"));
        System.out.println("Contains Python: " + sentence.contains("Python"));
        System.out.println("Contains java: " + sentence.contains("java"));



        // Remove extra spaces and compare the language without considering case
        System.out.println("\n--- String Cleaning and Comparison ---");

        String userLanguage = "   JAVA   ";

        String cleanedLanguage = userLanguage.trim().toLowerCase();

        if (cleanedLanguage.equals("java")) {
            System.out.println("You selected Java.");
        } else {
            System.out.println("You selected another language.");
        }


        // Create a mutable StringBuilder and append text
        System.out.println("\n--- StringBuilder append() ---");

        StringBuilder builder = new StringBuilder("Java");

        builder.append(" OOP");
        builder.append(" Learning");

        System.out.println("Builder: " + builder);



        // Insert text at a specific position
        System.out.println("\n--- StringBuilder insert() ---");

        builder.insert(5, "Basic ");

        System.out.println("After insert: " + builder);



        // Delete a range of characters from the StringBuilder
        System.out.println("\n--- StringBuilder delete() ---");

        builder.delete(5, 11);

        System.out.println("After delete: " + builder);



        // Reverse the character sequence in a StringBuilder
        System.out.println("\n--- StringBuilder reverse() ---");

        StringBuilder reverseText = new StringBuilder("Java");

        reverseText.reverse();

        System.out.println("Reversed: " + reverseText);




        // Convert the StringBuilder content into an immutable String
        System.out.println("\n--- StringBuilder toString() ---");

        String result = builder.toString();

        System.out.println("String result: " + result);


        // Demonstrate that modifying StringBuilder does not change the converted String
        builder.append(" Course");

        System.out.println("Updated builder: " + builder);
        System.out.println("Previous String result: " + result);



    }
}