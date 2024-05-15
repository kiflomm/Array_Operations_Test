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
                
               //Test when the search key is found multiple times in the array
             
               int[] numbers1 = {1, 2, 3, 4, 3, 5, 3};
                int searchKey1 = 3;
                int[] expectedIndices1 = {2, 4, 6};

                int[] actualIndices1 = ArrayOperations.searchArray(numbers1, searchKey1);

                Assert.assertArrayEquals(expectedIndices1, actualIndices1);
         //Test with a large array          
                
     int[] numbers2 = new int[1000000];
    int searchKey2 = 7;
    // Set a specific index to 7 to ensure it is found
    numbers2[123456] = 7;
    int[] expectedIndices2 = {123456};

    int[] actualIndices2 = ArrayOperations.searchArray(numbers2, searchKey2);

    Assert.assertArrayEquals(expectedIndices2, actualIndices2);
    }
    //Test - two ========> for ArrayOperationTest.sortArray()


}