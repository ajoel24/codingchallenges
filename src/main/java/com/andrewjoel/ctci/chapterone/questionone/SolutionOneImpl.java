package com.andrewjoel.ctci.chapterone.questionone;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Solving 1.1 using Hashtable
 */
public class SolutionOneImpl implements Solution {
    @Override
    public boolean isUnique(final String word) {
        final var table = new Hashtable<String, Integer>();

        if (word != null) {
            Arrays.stream(word.split(""))
                    .forEach(letter -> table.merge(letter, 1, Integer::sum));
        }

        if (table.isEmpty()) {
            return true;
        }

        return table.values()
                .stream()
                .allMatch(value -> value == 1);
    }
}
