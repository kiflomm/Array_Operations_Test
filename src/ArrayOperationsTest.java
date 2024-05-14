import org.junit.*; 

public class ArrayOperationsTest {  
    // General tests for the array 
   










    //Test - one ========> for ArrayOperationsTest.searchArray() 
    @Test
    public void searchArrayTest(){  

    }
    //Test - two ========> for ArrayOperationTest.sortArray()
    @Test
public void testValidAscendingSort() {
  int[] numbers = {5, 2, 8, 1, 3};
  boolean ascending = true;
  int[] expected = {1, 2, 3, 5, 8};

  int[] actual = sortArray(numbers.clone(), ascending);

  assertArrayEquals(expected, actual);
}
}