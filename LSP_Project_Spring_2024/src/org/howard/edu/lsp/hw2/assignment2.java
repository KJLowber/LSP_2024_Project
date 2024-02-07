package org.howard.edu.lsp.hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class assignment2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java WordCounter <filename>");
            System.exit(1);
        }

        String filename = args[0];
        numWords(filename);
    }

    public static void numWords(String filename) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("(?<!\\p{Alpha})|(?=\\p{Punct})|(?<=\\p{Punct})");
                for (String word : words) {
                    if (isValidWord(word)) {
                        word = word.toLowerCase();
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            printWordCount(wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public static boolean isValidWord(String word) {
        return word.length()-1 > 3 && !isNumeric(word);
    }

    public static boolean isNumeric(String str) {
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    public static void printWordCount(Map<String, Integer> wordCount) {
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}