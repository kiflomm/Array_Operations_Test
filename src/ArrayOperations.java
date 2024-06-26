import java.util.*;
public class ArrayOperations {

    public static void main(String[] args) {
        int choice,searchKey=0;
        boolean ascending= true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n \tEnter an Array of integers to perform some operations on it\n start by entering its size: --> ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the integers (separated by spaces): ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
            System.out.println("OKAY NOW you can do the following operations on the array.\n\tplease choose one option");
        do {
            
            System.out.println("1. Search from an array");
            System.out.println("2. Sort an array");
            System.out.println("3. Reverse elements of an array");
            System.out.println("4. Calculate average of the array elements");
            System.out.println("5. Count even numbers");
            System.out.println("6. Find sum of prime numbers");
            System.out.println("7.display min and max");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt();  
            if(choice == 1){
                System.out.print("Enter the number to search : ");
                searchKey = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                        {
                        int []indices;
                        indices=searchArray(numbers,searchKey);
                        //for empty array
                        if
                         (numbers.length==0) 
                         {
                            System.out.println();
                            System.out.print("The array is empty.");
                            System.out.println();
                            System.out.println();
                         }
                       //if the targeted number is not in the array
                      else  if
                        (indices.length == 0)
                         {
                           System.out.println("\nThis number is not found.\n\n");
                          
                        } 
                       else
                        {
                        System.out.print("\n" + searchKey + " is found at index: ");
                        for
                         (int i : indices)
                          {
                            System.out.print(i +"," );
                        }
                        System.out.println("\n");
                    }
                    break;
                        }
                case 2:
                System.out.println("Enter 2 for descending order otherwise the sorting is ascending");
                int order = scanner.nextInt();
                if(order==2){
                     ascending=false;}
                int [] sortedarray=sortArray(numbers, ascending);
                System.out.print("The sorted list is : ");
                for (int i=0; i<numbers.length; i++){
                    System.out.print(sortedarray[i] + " ");
                }
                    System.out.println("\n \n \n");
                    break;
                case 3:
                System.out.print("\n\nThe reversed array list is: ");
                for(int i=0; i<reverseArray(numbers).length; i++){
                    System.out.print(reverseArray(numbers)[i]+" ");
                };
                System.out.println();
                System.out.println();
                System.out.println();
                    break;
                case 4:
                    calculateAverage(numbers);
                    break;
                case 5:
                {
                   int numberofevens;
                   numberofevens= countEvenNumbers(numbers);
                   System.out.println();
                   System.out.println("number of evens in your array"+":"+numberofevens);
                   System.out.println();
                    break;
                }
                case 6:
                System.out.println("\n\n\n\nThe sum of the prime numbers in the array you entered is : "+sumOfPrimes(numbers)+"\n\n\n\n\n");
                    break;
                    case 7:
                    {
                      int[] mima=  displayMinMax(numbers);
                      System.out.println("minimum number in the array is: " + mima[0]);
                      System.out.println("The maximum number in the array is: " + mima[1] + "");
                    break;
                }
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static int[]  searchArray(int[] numbers,int searchKey) {
        
        int count = 0;
        int i;

        // Count the occurrences of the target number
        for
         ( i = 0; i < numbers.length; i++) 
        {
            if
             (numbers[i] == searchKey)
              {
                count++;
            }
        }

        // Create an array to store the indices of the target number
        int[] indices;
        indices = new int[count];
        int index;
        index = 0;
         int j;
        // Store the indices of the target number
        for
         (j = 0; j < numbers.length; j++)
          {
            if (numbers[j] == searchKey) {
                indices[index] = j;
                index++;
                
            }
        }

        return indices;

    }
    
    public static int[] sortArray(int[] numbers,boolean ascending) {
       
        // Clone the original array to avoid modifying it in-place
        int [] sortedarray = numbers.clone();
     
        // Use Arrays.sort() for efficient sorting
        Arrays.sort(sortedarray);

        // Reverse the array for descending order if needed
        if (!ascending) {
             int left = 0;
             int right = sortedarray.length - 1;
            while (left < right) {
                int temp = sortedarray[left];
                sortedarray[left] = sortedarray[right];
                sortedarray[right] = temp;
                left++;
                right--;}       
           }
      
       return sortedarray;

}


    public static int[] reverseArray(int[] numbers) {
            int[] reversed = new int[numbers.length];
            int j = numbers.length - 1;
        
            for (int i = 0; i < numbers.length; i++) {
                reversed[j] = numbers[i];
                j--;
            }
        
            return reversed;
        
    }
    public static double calculateAverage(int[] numbers) { 
        int sum = 0;
        double average = 0.0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        if (numbers.length > 0) {
            average = (double) sum / numbers.length;
            System.out.println("The average of the array elements is: " + average+"\n\n\n");
        } else {
            System.out.println("The array is empty. Cannot calculate average.\n\n\n");
        }
        
        return average;
    }

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    } 

    public static int sumOfPrimes(int[] numbers) {
        int sumOfPrimes = 0;
      
        for (int num : numbers) {
          if (isPrime(num)) {
            sumOfPrimes += num;
          }
        }
      
        return sumOfPrimes;
      }
      
      // Helper method to check if a number is prime (usefull in the sumOfPrimes())
      private static boolean isPrime(int num) {
        if (num <= 1) {
          return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
            return false;
          }
        }
        return true;
      }
      public static int[] displayMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int [] minmax =new int[2];
        minmax[0]=min;
        minmax[1]=max;
        return minmax;
    }
}
