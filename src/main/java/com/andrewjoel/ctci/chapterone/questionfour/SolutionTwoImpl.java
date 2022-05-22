package com.andrewjoel.ctci.chapterone.questionfour;

import java.util.BitSet;

public class SolutionTwoImpl implements Solution {
    @Override
    public boolean isPalindromePermutation(final String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        final var bitset = new BitSet();

        for (final char letter : word.toCharArray()) {
            if (bitset.get(letter)) {
                bitset.flip(letter);
            } else {
                bitset.set(letter);
            }
        }

        return bitset.cardinality() == 0 || bitset.cardinality() == 1;
    }
}
