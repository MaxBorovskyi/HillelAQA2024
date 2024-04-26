package org.example.HW10;

import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static void main(String[] args) {
        String sentence = "Glory to Ukraine!";
        countLetters(sentence);
    }

    public static void countLetters(String sentence) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);

            if (Character.isLetter(character)) {
                int count = letterCountMap.getOrDefault(character, 0);
                letterCountMap.put(character, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}