import java.util.Scanner;

public class EmployeeDatabase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total numbers in array: ");
        int n = sc.nextInt();   

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();   
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMissing number: " + findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;  
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
