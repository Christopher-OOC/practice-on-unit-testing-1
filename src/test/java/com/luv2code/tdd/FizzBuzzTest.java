package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // if number is divisible by 3, print Fizz
    // if number is divisible by 5, print Buzz
    // if number is divisible by 3 and 5, print FizzBuzz
    // if number is not divisible by 3 and 5, then print the number

    @Test
    @DisplayName("Divisible by Three")
    @Order(1)
    void testForDivisibleByThree() {

        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    @DisplayName("Divisible by Three")
    @Order(2)
    void testForDivisibleByFive() {

        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    @Test
    @DisplayName("Divisible by Three and Five")
    @Order(3)
    void testForDivisibleByThreeAndFive() {

        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @Test
    @DisplayName("Not Divisible by Three or Five")
    @Order(4)
    void testForNotDivisibleByThreeAndFive() {

        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }
}
