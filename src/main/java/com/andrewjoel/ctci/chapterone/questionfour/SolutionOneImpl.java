package com.andrewjoel.ctci.chapterone.questionfour;

import java.util.Arrays;
import java.util.HashMap;

public class SolutionOneImpl implements Solution {
    @Override
    public boolean isPalindromePermutation(final String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        final var letterMap = new HashMap<String, Integer>();

        Arrays.stream(word.split(""))
                .forEach(letter -> {
                    if (letterMap.containsKey(letter) && letterMap.get(letter) > 0) {
                        letterMap.put(letter, letterMap.get(letter) - 1);
                    } else {
                        letterMap.put(letter, 1);
                    }
                });

        return letterMap.values().stream().allMatch(value -> value == 0) ||
                letterMap.values().stream().filter(value -> value == 1).count() == 1;
    }
}
