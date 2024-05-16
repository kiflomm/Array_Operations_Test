import org.junit.*;  
public class ArrayOperationsTest {

    // Hello every one delete this coment when you add your Tests and put your code above this

    @Test
    public void testSumOfPrimesEmptyArray() {
        int[] numbers = new int[0];
        int expectedSum = 0;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesNoPrimes() {
        int[] numbers = {4, 6, 8, 10};
        int expectedSum = 0;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesSinglePrime() {
        int[] numbers = {2};
        int expectedSum = 2;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesMultiplePrimes() {
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int expectedSum = 41;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesWithNegativeNumbers() {
        int[] numbers = {-2, 3, -5, 7};
        int expectedSum = 10; // Only positive primes are considered
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }
}
