import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    void testAddition() {
        int result = 2 + 3;
        System.out.println("Test1 is running");
        Assert.assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testStringLength() {
        String text = "Hello, World!";
        int length = text.length();
        System.out.println("Test2 is running");
        Assert.assertEquals(13, length, "Length of 'Hello, World!' should be 13");
    }

    @Test
    void testDivision() {
        int dividend = 10;
        int divisor = 2;
        int result = dividend / divisor;
        System.out.println("Test2 is running");
        Assert.assertEquals(5, result, "10 / 2 should equal 5");
    }
}
