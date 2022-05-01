package com.andrewjoel.ctci.chapterone.questiontwo;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SolutionTwoImpl implements Solution {
    @Override
    public boolean isPermutation(final String wordOne, final String wordTwo) {
        if (wordOne == null || wordTwo == null || wordOne.length() != wordTwo.length()) {
            return false;
        }

        return sorted(wordOne).equals(sorted(wordTwo));
    }

    private String sorted(final String word) {
        return Arrays.stream(word.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
