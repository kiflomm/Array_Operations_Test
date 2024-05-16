import static org.junit.Assert.assertEquals;

import org.junit.*; 

public class ArrayOperationsTest {  

    //Test - one ========> for ArrayOperationsTest.searchArray() 
    @Test
    public void searchArrayTest(){  

    }
    //Test - two ========> for ArrayOperationTest.sortArray()


public class EvenNumbersTest {
   
    @Test
    public void testCountEvenNumbersWithEmptyArray() {
        int[] numbers = {};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=0;
        assertEquals( expected, actualevens);
    }
    }

    @Test
    public void testCountEvenNumbersWithNoEvenNumbers() {
        int[] numbers = {1, 3, 5, 7, 9};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=0;
        assertEquals( expected, actualevens);
    }

    @Test
    public void testCountEvenNumbersWithAllEvenNumbers() {
        int[] numbers = {2, 4, 6, 8, 10};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=5;
        assertEquals( expected, actualevens);
        
    }

    @Test
    public void testCountEvenNumbersWithMixedNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=5;
        assertEquals( expected, actualevens);
    }
 
    @Test
    public void testCountEvenNumbersWithSingleElementArray() {
        int[] numbers = {7};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=0;
        assertEquals( expected, actualevens);
    }
    

    @Test
    public void testCountEvenNumbersWithLargeArray() {
        int[] numbers = new int[10000];
        // Fill the array with even numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=1000;
        assertEquals( expected, actualevens);
    }
    @Test
    public void testCountEvenNumbersWithNullArray() {
        int[] numbers = null;
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=0;
        assertEquals( expected, actualevens);
    }
    

    @Test
    public void testCountEvenNumbersWithNegativeNumbers() {
        int[] numbers = {-3, -2, -1, 0, 1, 2, 3};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=3;
        assertEquals( expected, actualevens);
    }

    @Test
    public void testCountEvenNumbersWithZero() {
        int[] numbers = {0, 0, 0, 0, 0};
        int actualevens =ArrayOperations.countEvenNumbers(numbers);
        int expected=5;
        assertEquals( expected, actualevens);
    }

    @Test
    public void testCountEvenNumbersWithMaxInteger() {
        int[] numbers = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2};
       int actualevens =ArrayOperations.countEvenNumbers(numbers);
       int expected=0;
        assertEquals(expected,actualevens );
    }
}



    



