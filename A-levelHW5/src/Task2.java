import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int arraySize = 3;
        int[][] testArray = new int[arraySize][arraySize];
        matrixCreation(testArray);
        System.out.println("It's an our matrix:");
        printArray(testArray);
        matrixRotation(testArray);
        System.out.println("It's an rotated matrix:");
        printArray(testArray);

    }

    public static int[][] matrixCreation(int[][] array) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Scanner scanner = new Scanner(System.in);
                int arrayItem = scanner.nextInt();
                array[i][j] = arrayItem;
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixRotation(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                int tempItem = 0;
                tempItem = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = tempItem;
            }
        }
        return array;
    }

}
