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
        System.out.print("\033[H\033[2J");              // clears the screen after prompting the array successfuly
        System.out.flush();
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
            System.out.print("\033[H\033[2J");              // clears the screen after displaying the menu
            System.out.flush();
            switch (choice) {
                case 1:
                    searchArray(numbers,searchKey);
                    break;
                case 2:
                    sortArray(numbers,ascending);
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
                    sumOfPrimes(numbers);
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
        
    public static int[] sortArray(int[] numbers, boolean ascending) {
            // Clone the original array to avoid modifying it in-place
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 1 for ascending  and 2 for descending order");
            int order = scanner.nextInt();
            if(order==2){
                ascending=false;
            }

            int[] sortedarray =  numbers.clone();
          
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
                right--;
              }
            }
            for(int i=0; i<numbers.length;i++){
                System.out.print(sortedarray[i]+ " "); 
                }
                System.out.println("\n \n");
            return sortedarray ;
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
        
        return sumOfPrimes;
    } 
}

