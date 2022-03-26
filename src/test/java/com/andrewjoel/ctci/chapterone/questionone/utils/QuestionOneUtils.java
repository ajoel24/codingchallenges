package com.andrewjoel.ctci.chapterone.questionone.utils;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class QuestionOneUtils {
    public static Stream<Arguments> prepareTestData() {
        return Stream.of(
                Arguments.of("12345", true),
                Arguments.of("122345", false),
                Arguments.of("", true),
                Arguments.of("****", false),
                Arguments.of(null, true)
        );
    }
}
