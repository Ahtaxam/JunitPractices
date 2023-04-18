import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTask {
    Task task = new Task();

    @Test
    public void testIsPrime(){
        assertEquals(true , task.isPrime(7));
        assertEquals(true , task.isPrime(11));
        assertEquals(false , task.isPrime(70));
        assertEquals(true , task.isPrime(7));
        assertEquals(false , task.isPrime(15));
    }

    @Test
    public void TestisEven(){
        assertEquals(false , task.isEven(5));
        assertEquals(true , task.isEven(6));
        assertEquals(false , task.isEven(5));
    }
}
