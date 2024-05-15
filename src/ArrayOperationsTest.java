import org.junit.*; 

public class ArrayOperationsTest {  

    //Test - one ========> for ArrayOperationsTest.searchArray() 
    @Test
    public void searchArrayTest(){  

    }





    
    //test for empty arrays
    @Test
    public void testReverseArray_EmptyArray() {
        int[] arr = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }



    // test for single element array
    @Test
    public void testReverseArray_SingleElementArray() {
        int[] arr = {5};
        
        int[] expected = {5};
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }



     //test for even number of elemnts
    @Test
    public void testReverseArray_EvenNumberOfElements() {
        int[] arr = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        Assert.assertArrayEquals(expected,  ArrayOperations.reverseArray(arr));
    }



    //test for odd number of elemnets
    @Test
    public void testReverseArray_OddNumberOfElements() {
        int[] arr = {1, 2, 3, 4, 5};
        
        int[] expected = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, ArrayOperations.reverseArray(arr));
    }



     //test for dublicate elements in array
    @Test
    public void testReverseArray_DuplicateElements() {
        int[] arr = {2, 4, 2, 1, 4};
       
        int[] expected = {4, 1, 2, 4, 2};
        Assert.assertArrayEquals(expected,  ArrayOperations.reverseArray(arr));
    }

}