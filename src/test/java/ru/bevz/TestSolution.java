package ru.bevz;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestSolution {
    final static boolean t = true, f = false;

    private static Stream<Arguments> provideArrayDataForTestIsStrogobogrammatic() {
        return Stream.of(
                Arguments.of("69", t),
                Arguments.of("88", t),
                Arguments.of("962", f),
                Arguments.of("1", t)
        );
    }

    private static Stream<Arguments> provideArrayDataForTestIsPowerOfFour() {
        return Stream.of(
                Arguments.of(16, t),
                Arguments.of(5, f),
                Arguments.of(1, t),
                Arguments.of(0.0625, t)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArrayDataForTestIsStrogobogrammatic")
    void testIsStrogobogrammatic(String value, boolean expected) {
        Solution solution = new Solution();
        Assertions.assertEquals(expected, solution.isStrobogrammatic(value));
    }

    @Test
    public void testIsStrogobogrammatic() {
        Solution solution = new Solution();
        boolean result;

        result = solution.isStrobogrammatic("69");
        Assertions.assertTrue(result);

        result = solution.isStrobogrammatic("88");
        Assertions.assertTrue(result);

        result = solution.isStrobogrammatic("962");
        Assertions.assertFalse(result);

        result = solution.isStrobogrammatic("1");
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("provideArrayDataForTestIsPowerOfFour")
    void testIsPowerOfFour(double value, boolean expected) {
        Solution solution = new Solution();
        Assertions.assertEquals(expected, solution.isPowerOfFour(value));
    }

    @Test
    public void testIsPowerOfFour() {
        Solution solution = new Solution();
        boolean result;

        result = solution.isPowerOfFour(16);
        Assertions.assertTrue(result);

        result = solution.isPowerOfFour(5);
        Assertions.assertFalse(result);

        result = solution.isPowerOfFour(1);
        Assertions.assertTrue(result);

        result = solution.isPowerOfFour(0.0625);
        Assertions.assertTrue(result);
    }
}
