package kz.aitu.test;

import kz.aitu.Main;
import org.junit.*;

import static org.junit.Assert.*;
public class JUnitTest {

    @BeforeClass
    public static void setup() {
        System.out.println("SETTING UP TEST FOR BASIC CALCULATOR");
    }

    @AfterClass
    public static void cleanup() {
        System.out.println("FINISHED TESTING BASIC CALCULATOR");
    }

    @Test
    public void testSum() throws Exception {
        int sum = Main.getSum(1, -1);
        assertEquals(sum, 0);
        System.out.println("Test passed.");
    }

    @Test(expected = Exception.class)
    public void testDivisionByZero() throws Exception {
        double division = Main.getDiv(1, 0);
    }

    @Ignore
    @Test
    public void testDifference() throws Exception {
        int diff = Main.getDiff(1, -1);
        assertEquals(diff, 2);
        System.out.println("Test passed.");
    }

    @Test(timeout = 200)
    public void testTooLong() throws InterruptedException {
        Thread.sleep(500);
    }

    @Before
    public void prepare() {
        System.out.println("[Before Block]: Preparing...");
    }
    @After
    public void close() {
        System.out.println("[After Block]: Test closed.");
    }
}
