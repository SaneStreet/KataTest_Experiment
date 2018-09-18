import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DieTest {


    //Test to roll minimum value
    @Test
    void testRollMinValue(){

        //3. Arrange / Setup
        DieMinValue die = new DieMinValue();

        //2. Act / Execution
        die.roll();

        //1. Assert / Verification
        assertTrue(die.wasRolled);
        assertEquals(1, die.getFaceValue());

        //4. Clean-up
    }

    //Override roll from die, and give the random minimum
    private class DieMinValue extends Die{
        boolean wasRolled = false;

        @Override
        public void roll(){
            super.roll();
            wasRolled = true;
        }

        @Override
        protected double mathRandom(){
            return 0;
        }
    }

    //Test minimum value equals
    @Test
    void testMinValueEqauls(){
        Die die = new Die();
        assertEquals(1, die.getMinValue());
    }

    //Test maximum value equals
    @Test
    void testMaxValueEquals(){
        Die die = new Die();
        assertEquals(6, die.getMaxValue());
    }

    //Test to roll maximum value
    @Test
    void testRollMaxValue(){

        DieMaxValue die = new DieMaxValue();

        die.roll();

        assertTrue(die.wasRolled);
        assertEquals(6, die.getFaceValue());
    }

    //Override roll from die, and give random maximum
    private class DieMaxValue extends Die{
        boolean wasRolled = false;

        @Override
        public void roll(){
            super.roll();
            wasRolled = true;
        }

        @Override
        protected double mathRandom(){
            return 0.99999999;
        }
    }

}
