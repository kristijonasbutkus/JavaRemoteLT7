package basics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAnnotations {

    @BeforeAll
    public static void setUp() {
        System.out.println("This message will be displayed once before executing all test methods"); }

    @BeforeEach
    public void init() {
        System.out.println("This message will be shown before each test method");
    }

    @AfterAll
    public static void tearDwon() {
        System.out.println("Paskutinis testas");
    }

    @AfterEach
    public void tea() {
        System.out.println("This message will be shown after each test method");
    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test...");
    }

    @Test
    @DisplayName("Test 2 !")
    public void secondTest() {
        System.out.println("Executing second test...");
    }

    @Test
    @Disabled
    public void thirdTest() {
        System.out.println("Executing third test...");
    }
}
