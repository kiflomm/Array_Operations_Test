import java.util.*;
public class ArrayOperations {

    public static void main(String[] args) {
        int choice;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Search from an array");
            System.out.println("2. Sort an array");
            System.out.println("3. Reverse elements of an array");
            System.out.println("4. Calculate average of the array elements");
            System.out.println("5. Count even numbers");
            System.out.println("6. Find sum of prime numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchArray();
                    break;
                case 2:
                    sortArray();
                    break;
                case 3:
                    reverseArray();
                    break;
                case 4:
                    calculateAverage();
                    break;
                case 5:
                    countEvenNumbers();
                    break;
                case 6:
                    sumOfPrimes();
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

    public static boolean searchArray() {
        boolean found = false;

        return found;
    }

    public static double[] sortArray() {
        double [] sorted = {};

        return sorted;
    }


    public static double[] reverseArray() {
        double [] reversed = {};

        return reversed;
    }

    public static double calculateAverage() {
        double average = 0;

        return average;
    }

    public static int countEvenNumbers() {
        int count = 0;

        return count;
    }

    public static int sumOfPrimes() {
        int sumOfPrimes = 0;

        return sumOfPrimes;
    } 
}
