package pohon_ekspresi;

import java.util.Scanner;

public class SpellingCorrection {
    public static void main(String[] args) {
        // Create a dictionary of valid words (assumed)
        String[] dictionary = {
                "apple",
                "banana",
                "cat",
                "dog",
                "elephant",
                "fish",
                "giraffe",
                "horse"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word for spelling correction: ");
        String inputWord = scanner.nextLine();

        boolean isValid = false;

        // Check if the input word is already in the dictionary
        for (String word : dictionary) {
            if (word.equalsIgnoreCase(inputWord)) {
                isValid = true;
                break;
            }
        }

        if (isValid) {
            System.out.println("Input word is already valid.");
        } else {
            // Perform spelling correction
            String suggestedWord = suggestCorrection(inputWord, dictionary);
            System.out.println("Did you mean: " + suggestedWord);
        }
    }

    public static String suggestCorrection(String inputWord, String[] dictionary) {
        // Perform spelling correction logic here
        // You can use algorithms like Levenshtein distance or phonetic algorithms

        // For simplicity, let's assume the correction algorithm returns the first valid word from the dictionary
        if (dictionary.length > 0) {
            return dictionary[0];
        } else {
            return "No suggested correction found.";
        }
    }
}
