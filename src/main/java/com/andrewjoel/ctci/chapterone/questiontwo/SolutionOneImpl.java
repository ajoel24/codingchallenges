package com.andrewjoel.ctci.chapterone.questiontwo;

import java.util.Arrays;
import java.util.HashMap;

public class SolutionOneImpl implements Solution {
    @Override
    public boolean isPermutation(final String wordOne, final String wordTwo) {
        if (wordOne == null || wordTwo == null || wordOne.length() != wordTwo.length()) {
            return false;
        }

        final var letterMap = new HashMap<String, Integer>();

        Arrays.stream(wordOne.split(""))
                .forEach(letter -> letterMap.put(letter, letterMap.getOrDefault(letter, 1)));

        Arrays.stream(wordTwo.split(""))
                .forEach(letter -> {
                    if (letterMap.containsKey(letter)) {
                        letterMap.put(letter, letterMap.get(letter) - 1);
                    }
                });

        return letterMap.values()
                .stream()
                .allMatch(value -> value == 0);
    }
}
