package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int x = 2;
        assertEquals("Hello World!", App.hello());
        assertEquals(1, App.binarySearch(arr, 0, n - 1, x));
    }
}
