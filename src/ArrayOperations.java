import java.util.*;
public class ArrayOperations {

    public static void main(String[] args) {
        int choice,searchKey=0;
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
            System.out.println("0. Exit");
            System.out.print("Enter your choice: "); 
            choice = scanner.nextInt();  
            if(choice == 1){
                System.out.print("Enter the number to search : ");
                searchKey = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    searchArray(numbers,searchKey);
                    break;
                case 2:
                    sortArray(numbers);
                    break;
                case 3:
                    reverseArray(numbers);
                    break;
                case 4:
                    calculateAverage(numbers);
                    break;
                case 5:
                    countEvenNumbers(numbers);
                    break;
                case 6:
                System.out.println("\n\n\n\nThe sum of the prime numbers in the array you entered is : "+sumOfPrimes(numbers)+"\n\n\n\n\n");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }

    public static boolean searchArray(int[] numbers,int searchKey) {
        boolean found = false; 
        return found;
    }

    public static double[] sortArray(int[] numbers) {
        double [] sorted = {};

        return sorted;
    }


    public static double[] reverseArray(int[] numbers) {
        double [] reversed = {};

        return reversed;
    }

    public static double calculateAverage(int[] numbers) {
        double average = 0;

        return average;
    }

    public static int countEvenNumbers(int[] numbers) {
        int count = 0;

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
}
