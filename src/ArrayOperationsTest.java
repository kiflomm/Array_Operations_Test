import static org.junit.Assert.assertEquals;

import org.junit.*;

public class ArrayOperationsTest {
//Test when the search key is not found in the array
    @Test
public void testSearchArray_KeyNotFound() {
    int[] numbers = {1, 2, 3, 4, 5};
    int searchKey = 6;
    int[] expectedIndices = {};

    int[] actualIndices = ArrayOperations.searchArray(numbers, searchKey);

    Assert.assertArrayEquals(expectedIndices, actualIndices);
}
//Test when the search key is found multiple times in the array
@Test
public void testSearchArray_KeyFoundMultipleTimes() {
    int[] numbers = {1, 2, 3, 4, 3, 5, 3};
    int searchKey = 3;
    int[] expectedIndices = {2, 4, 6};

    int[] actualIndices = ArrayOperations.searchArray(numbers, searchKey);

    Assert.assertArrayEquals(expectedIndices, actualIndices);
}
//Test with a large array
@Test
public void testSearchArray_LargeArray() {
    int[] numbers = new int[1000000];
    int searchKey = 7;
    // Set a specific index to 7 to ensure it is found
    numbers[123456] = 7;
    int[] expectedIndices = {123456};

    int[] actualIndices = ArrayOperations.searchArray(numbers, searchKey);

    Assert.assertArrayEquals(expectedIndices, actualIndices);
}
//Test with an empty array
@Test
public void testSearchArray_EmptyArray() {
    int[] numbers = {};
    int searchKey = 5;
    int[] expectedIndices = {};

    int[] actualIndices = ArrayOperations.searchArray(numbers, searchKey);

    Assert.assertArrayEquals(expectedIndices, actualIndices);
}
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

    //Test - for ArrayOperationTest.countEvenNumbers() ========>start here
    public class EvenNumbersTest {
   
        @Test
        public void testCountEvenNumbersWithEmptyArray() {
            int[] numbers = {};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=0;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithNoEvenNumbers() {
            int[] numbers = {1, 3, 5, 7, 9};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=0;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithAllEvenNumbers() {
            int[] numbers = {2, 4, 6, 8, 10};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=5;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithMixedNumbers() {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=5;
            assertEquals(expected, actualnumberofevens);
        }
     
        @Test
        public void testCountEvenNumbersWithSingleElementArray() {
            int[] numbers = {7};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=0;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithLargeArray() {
            int[] numbers = new int[10000];
            // Fill the array with even numbers
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i * 2;
            }
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=10000;
            assertEquals(expected, actualnumberofevens);
        }
        @Test
        public void testCountEvenNumbersWithNullArray() {
            int[] numbers = null;
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=0;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithNegativeNumbers() {
            int[] numbers = {-3, -2, -1, 0, 1, 2, 3};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=3;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithZero() {
            int[] numbers = {0, 0, 0, 0, 0};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=5;
            assertEquals(expected, actualnumberofevens);
        }
    
        @Test
        public void testCountEvenNumbersWithMaxInteger() {
            int[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2};
            int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=0;
            assertEquals(expected, actualnumberofevens);
        }
    
    @Test
    public void testArrayWithLargeNumbers() {
        int[]numbers= {1000000, 2000000, 3000000, 4000000};
        int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
            int expected=4;
            assertEquals(expected, actualnumberofevens);
    }
    @Test
public void testArrayWithComplexNumbers() {
    int[] numbers = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 1000, -1000};
    int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
    int expected=7;
    assertEquals(expected, actualnumberofevens);
}  
@Test
public void testArrayWithExtremeValues() {
    int[] numbers= {Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 1, -1, 2, -2, Integer.MAX_VALUE - 1, Integer.MIN_VALUE + 1};
    int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
    int expected=3;
    assertEquals(expected, actualnumberofevens);
}
@Test
public void testArrayWithLargeComplexNumbersAndDuplicates() {
    int[] numbers= new int[1000000]; // Array with 1 million elements
    int count = 0;
    for (int i = -500000; i <= 499999; i++) {
        numbers[count++] = i;
        if (i % 2 == 0) {
            numbers[count++] = i; // Adding duplicates for even numbers
        }
    }
    int actualnumberofevens=ArrayOperations.countEvenNumbers(numbers);
    int expected=750000;
    assertEquals(expected, actualnumberofevens);
}

    
}   

}
    // when you add your Tests and put your code above this


