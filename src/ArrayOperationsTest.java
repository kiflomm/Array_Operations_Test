import org.junit.*; 

public class ArrayOperationsTest {  

    //Test - one ========> for ArrayOperationsTest.searchArray() 
    @Test
    public void searchArrayTest(){  
      //Test when the search key is not found in the array
            int[] numbers = {1, 2, 3, 4, 5};
            int searchKey = 6;
            int[] expectedIndices = {};
        
            int[] actualIndices = ArrayOperations.searchArray(numbers, searchKey);
        
            Assert.assertArrayEquals(expectedIndices, actualIndices);
        
    }
    //Test - two ========> for ArrayOperationTest.sortArray()


}