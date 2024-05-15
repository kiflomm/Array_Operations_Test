import org.junit.*; 

public class ArrayOperationsTest {
    @Test
        public void testCalculateAverage() {
            int[] numbers = {1, 2, 3, 4, 5};
            
            double expectedAverage = 3.0;
            double actualAverage = ArrayOperations.calculateAverage(numbers);
            
            // Assert the calculated average is equal to the expected average
            Assert.assertEquals(expectedAverage, actualAverage, 0.001);
    }
    
}