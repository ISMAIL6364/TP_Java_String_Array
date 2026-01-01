import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "";
        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Enter a string");
            System.out.println("2. Display the string");
            System.out.println("3. Reverse the string");
            System.out.println("4. Number of words");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    text = sc.nextLine();
                    break;

                case 2:
                    System.out.println("String: " + text);
                    break;

                case 3:
                    String reversed = new StringBuilder(text).reverse().toString();
                    System.out.println("Reversed string: " + reversed);
                    break;

                case 4:
                    int wordCount = countWords(text);
                    System.out.println("Number of words: " + wordCount);
                    break;

                case 0:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            if (choice != 0) {
                System.out.println("\nPress any key to return to the menu...");
                sc.nextLine();
            }

        } while (choice != 0);

        sc.close();
    }


    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}

