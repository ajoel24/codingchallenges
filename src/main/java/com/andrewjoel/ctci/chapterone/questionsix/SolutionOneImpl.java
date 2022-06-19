package com.andrewjoel.ctci.chapterone.questionsix;

public class SolutionOneImpl implements Solution {
    @Override
    public String compress(final String word) {
        if (word == null || word.length() == 0) {
            return null;
        }

        final StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (i + 1 >= word.length() || word.charAt(i) != word.charAt(i + 1)) {
                result.append(word.charAt(i)).append(++count);
                count = 0;
            } else {
                count++;
            }
        }

        return result.length() > word.length() ? word : result.toString();
    }
}
