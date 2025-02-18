package Programs;

import java.util.HashMap;
import java.util.Map;

public class HighestOccurredWord {
    public static void main(String[] args) {
        String text = "This is a test. This test is only a Test.";
        String result = highestOccurrence(text);
        System.out.println(result);
    }

    public static String highestOccurrence(String text) {
        // Remove punctuation and convert to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(text);

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to count word occurrences
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Identify the word with the highest count
        String maxWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return  maxWord;
    }
}
