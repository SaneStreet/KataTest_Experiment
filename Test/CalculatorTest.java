import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testTwoPlusThreeEqualsFive() {
        // a = 2, b = 3 => res = 5

        //3. Arrange / Setup
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();

        //2. Act / Execution
        int result = calculator.add(a,b);

        //1. Assert / Verification
        assertEquals(5, result);

        //4. Clean-up
    }

    @Test
    void testFourPlusFiveEqualsNine() {
        // a = 5, b = 4 => res = 9

        //3. Arrange / Setup
        int a = 5;
        int b = 4;
        Calculator calculator = new Calculator();

        //2. Act / Execution
        int result = calculator.add(a,b);

        //1. Assert / Verification
        assertEquals(9, result);

        //4. Clean-up
    }

    @Test
    void testFiveMinusThreeEqualsTwo() {

        //3. Arrange / Setup
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;

        //2. Act / Execution
        int result = calculator.subtract(a,b);

        //1. Assert / Verification
        assertEquals(2, result);

        //4. Clean-up
    }

    @Test
    void testThreeMinusTwoEqualsOne() {

        //3. Arrange / Setup
        Calculator calculator = new Calculator();
        int a = 3;
        int b = 2;

        //2. Act / Execution
        int result = calculator.subtract(a,b);

        //1. Assert / Verification
        assertEquals(1, result);

        //4. Clean-up
    }
}