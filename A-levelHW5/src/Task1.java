import java.util.Scanner;
import static java.lang.System.out;

public class Task1 {
    public static void main(String[] args) {
        int[] testArray;
        testArray = new int[10];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < testArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int arrayItem = scanner.nextInt();
            testArray[i] = arrayItem;
        }
        int arrayLength = testArray.length;
        int[] countResultArray = new int[arrayLength];
        int[] resultArray = new int[arrayLength];


////* Sorting block
        for (int i = arrayLength - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (testArray[j] > testArray[j + 1]) {
                    int tmp = testArray[j];
                    testArray[j] = testArray[j + 1];
                    testArray[j + 1] = tmp;
                }
            }
        }
////
        int equalsCheck = 0;
        int counter = 0;
        int counterResult = 0;

        out.print("Our sorted array\n");
////* Checking for duplicates block
        for (int i = 0; i < arrayLength; i++) {
            out.print(testArray[i] + "," + " ");
            equalsCheck = testArray[i];
            for (int j = 0; j < arrayLength; j++) {
                if (equalsCheck == testArray[j]) {
                    counter++;
                }
            }
            countResultArray[i] = counter;
            counter = 0;
        }
////

////* Mode determination block

        counterResult = countResultArray[0];
        for (int i = 1; i < arrayLength; i++) {
            if (counterResult < countResultArray[i]) {
                counterResult = countResultArray[i];
            }
        }
        out.println("\nThe largest number of repetitions: " + counterResult);
////


////* Checking for number which appears the more than others and the smallest one from this set

        int tempIndex = 0;
        out.print("Numbers with the most frequent repetitions: ");
        for (int k = 0; k < arrayLength; k++) {
            if (countResultArray[k] == counterResult && testArray[k] != testArray[k + 1]) {
                out.print(testArray[k] + "," + " ");
                resultArray[tempIndex] = testArray[k];
                tempIndex++;
            }
        }
        out.println("\nMinimum encountered mode equals:" + " " + resultArray[0]);
    }
////
}
