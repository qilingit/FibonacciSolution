import org.junit.Assert;
import org.junit.Test;

public class TestFibonacciSolution {
    @Test
    public void testRecursiveN() {
        Assert.assertEquals(13, FibonacciSolution.getResultRecursive(6));
    }

    @Test
    public void testRecursive1() {
        Assert.assertEquals(1, FibonacciSolution.getResultRecursive(1));
    }

    @Test
    public void testRecursive2() {
        Assert.assertEquals(2, FibonacciSolution.getResultRecursive(2));
    }

    @Test
    public void testTmpVariable1() {
        Assert.assertEquals(1, FibonacciSolution.getResultTempVariable(1));
    }

    @Test
    public void testTmpVariable2() {
        Assert.assertEquals(2, FibonacciSolution.getResultTempVariable(2));
    }

    @Test
    public void testTmpVariable() {
        Assert.assertEquals(13, FibonacciSolution.getResultTempVariable(6));
    }

    @Test
    public void testCache1() {
        Assert.assertEquals(1, FibonacciSolution.getResultTempVariable(1));
    }

    @Test
    public void testCache2() {
        Assert.assertEquals(2, FibonacciSolution.getResultTempVariable(2));
    }

    @Test
    public void testCacheN() {
        Assert.assertEquals(13, FibonacciSolution.getResultTempVariable(6));
    }
}
