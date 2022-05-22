package com.andrewjoel.ctci.chapterone.questionfive;

import java.util.HashMap;

public class SolutionOneImpl implements Solution {
    @Override
    public boolean isOneAway(final String wordOne, final String wordTwo) {
        if (wordOne == null || wordTwo == null) {
            return false;
        }

        if (Math.abs(wordOne.length() - wordTwo.length()) > 1) {
            return false;
        }

        final var wordMap = new HashMap<Integer, Integer>();

        wordOne.chars().forEach(letter -> wordMap.merge(letter, 1, Integer::sum));

        wordTwo.chars()
                .forEach(letter -> {
                    if (wordMap.containsKey(letter)) {
                        wordMap.put(letter, wordMap.get(letter) - 1);
                    }
                });

        return wordMap.values().stream().filter(value -> value != 0).count() <= 1;
    }

}
