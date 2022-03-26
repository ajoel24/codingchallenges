package com.andrewjoel.ctci.chapterone.questionone;


import java.util.BitSet;

/**
 * Solving question 1.1 using bit vector
 * I will use BitSet class
 */
public class SolutionTwoImpl implements Solution {

    @Override
    public boolean isUnique(final String word) {
        if (word == null) {
            return true;
        }

        final var bitSet = new BitSet();

        for (final int index : word.toCharArray()) {
            if (bitSet.get(index)) {
                return false;
            }

            bitSet.set(index);
        }

        return true;
    }
}
