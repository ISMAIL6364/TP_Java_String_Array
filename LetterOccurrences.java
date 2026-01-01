import java.util.Scanner;

public class LetterOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a line of text (max. 100 characters): ");
        String ch = sc.nextLine();


        int[] nb_occurrences = new int[26];


        ch = ch.toUpperCase();


        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                nb_occurrences[c - 'A']++;
            }
        }


        System.out.println("The string \"" + ch + "\" contains:");

        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char letter = (char) ('A' + i);
                System.out.println(
                        nb_occurrences[i] + " occurrence(s) of the letter '" + letter + "'"
                );
            }
        }

        sc.close();
    }
}
