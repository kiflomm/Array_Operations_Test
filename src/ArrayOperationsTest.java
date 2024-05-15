import org.junit.*; 
import static org.junit.Assert.*;

public class ArrayOperationsTest {  

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

    int[] actual = ArrayOperations.sortArray(numbers.clone(), ascending);
    assertArrayEquals(expected, actual);}
    //Test for descending sort
    
    @Test
    public void testValidDescendingSort() {
    int[] numbers = {5, 2, 8, 1, 3};
    boolean ascending = false; // Sort in descending order
    int[] expected = {8, 5, 3, 2, 1};

    int[] actual = ArrayOperations.sortArray(numbers.clone(), ascending);

    assertArrayEquals(expected, actual);
}
}

