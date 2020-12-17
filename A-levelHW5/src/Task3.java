import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] testArray = new int[arrayLength];
        arrayCreation(testArray);
        System.out.println("Initial array:");
        printArray(testArray);
        selectionSort(testArray);
        System.out.println("\nSorted array:");
        printArray(testArray);

    }


    public static int[] arrayCreation(int[] array) {


        System.out.println("Enter the elements of array");
        for (int i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int arrayItem = scanner.nextInt();
            array[i] = arrayItem;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "," + " ");
        }

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minItem = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minItem) {
                    minItem = arr[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int tempItem = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tempItem;
            }
        }
    }

}
