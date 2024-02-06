package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounting {
	public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
	
	public static void processWord(String word, Map<String, Integer> wordCounts) {
        if (word.length() > 3 && !isNumeric(word)) {
            word = word.toLowerCase();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }
	
	public static Map<String, Integer> countWords(String filename) {
        Map<String, Integer> wordCounts = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
            	String[] words = line.split("\\W+");
                for (String word : words) {
                    // Remove punctuation from the word
                    word = word.replaceAll("[^a-zA-Z']", "");
                    processWord(word, wordCounts);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCounts;
    }
	
	public static void printWordCounts(Map<String, Integer> wordCounts) {
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
	
	public static void main(String[] args) {
        String filename = "D:/hp/Documents/words.txt";
        System.out.println("Filename: " + filename); // Debug statement
        Map<String, Integer> wordCounts = countWords(filename);
        printWordCounts(wordCounts);
    }
	
	
}
