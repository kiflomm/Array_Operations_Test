import org.junit.*;
import static org.junit.Assert.*;
public class ArrayOperationsTest {
    // Tests for the ArrayOperations.reverseArray() starts here
    // test for empty arrays
    @Test
    public void testReverseArray_EmptyArray() {
        int[] arr = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }

    // test for single element array
    @Test
    public void testReverseArray_SingleElementArray() {
        int[] arr = { 5 };

        int[] expected = { 5 };
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }

    // test for even number of elemnts
    @Test
    public void testReverseArray_EvenNumberOfElements() {
        int[] arr = { 1, 2, 3, 4 };
        int[] expected = { 4, 3, 2, 1 };
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }

    // test for odd number of elemnets
    @Test
    public void testReverseArray_OddNumberOfElements() {
        int[] arr = { 1, 2, 3, 4, 5 };

        int[] expected = { 5, 4, 3, 2, 1 };
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }

    // test for dublicate elements in array
    @Test
    public void testReverseArray_DuplicateElements() {
        int[] arr = { 2, 4, 2, 1, 4 };

        int[] expected = { 4, 1, 2, 4, 2 };
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }

    // Tests for the ArrayOperations.sumOfPrimes() starts here
    @Test
    public void testSumOfPrimesEmptyArray() {
        int[] numbers = new int[0];
        int expectedSum = 0;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesNoPrimes() {
        int[] numbers = { 4, 6, 8, 10 };
        int expectedSum = 0;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesSinglePrime() {
        int[] numbers = { 2 };
        int expectedSum = 2;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesMultiplePrimes() {
        int[] numbers = { 2, 3, 5, 7, 11, 13 };
        int expectedSum = 41;
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfPrimesWithNegativeNumbers() {
        int[] numbers = { -2, 3, -5, 7 };
        int expectedSum = 10; // Only positive primes are considered
        int actualSum = ArrayOperations.sumOfPrimes(numbers);
        Assert.assertEquals(expectedSum, actualSum);
    }

    // test for the ArrayOperations.calculateAverage() begins here
    @Test
    public void testCalculateAverage() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        double expectedAverage = 3.0;
        double actualAverage = ArrayOperations.calculateAverage(numbers);
        Assert.assertEquals(expectedAverage, actualAverage, 0.001);
    }

    @Test
    public void testCalculateAverageWithNegativeNumbers() {
        int[] numbers = { -5, -10, -15, -20 };
        double expected = -12.5;
        double actual = ArrayOperations.calculateAverage(numbers);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateAverageWithNonEmptyArrayUsingAssertNotEquals() {
        int[] numbers = { 5, 10, 15, 20 };
        double actual = ArrayOperations.calculateAverage(numbers);
        Assert.assertNotEquals(0.0, actual);
    }

    @Test
    public void testCalculateAverageWithNonEmptyArrayUsingAssertTrue() {
        int[] numbers = { 5, 10, 15, 20 };
        double actual = ArrayOperations.calculateAverage(numbers);
        Assert.assertTrue(actual > 0.0);
    }

    @Test
    public void testCalculateAverageWithNegativeNumbersUsingAssertFalse() {
        int[] numbers = { -5, -10, -15, -20 };
        double actual = ArrayOperations.calculateAverage(numbers);
        Assert.assertFalse(actual > 0.0);
    }

    // Test for sortArray starts here
    @Test
    public void testValidAscendingSort() {
    int[] numbers = {5, 2, 8, 1, 3};
    boolean ascending = true;
    int[] expected = {1, 2, 3, 5, 8};

    int[] actual = ArrayOperations.sortArray(numbers.clone(), ascending);
    assertArrayEquals(expected, actual);}
    
   
    // when you add your Tests and put your code above this

}
