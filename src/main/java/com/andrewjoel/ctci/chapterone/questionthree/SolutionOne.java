package com.andrewjoel.ctci.chapterone.questionthree;

public class SolutionOne implements Solution {
    @Override
    public String toUrl(final String word) {
        if (word == null) {
            return null;
        }

        return word.trim()
                .replaceAll("\\s", "%20");
    }
}
