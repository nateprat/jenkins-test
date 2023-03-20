package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @BeforeEach
    void setUp() {
        System.out.println("test - setup");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test - teardown");
    }

    @Test
    void main() {
        Assertions.assertTrue(() -> {
            System.out.println("This is a simple test");
            return Boolean.TRUE;
        });
    }
}