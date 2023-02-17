import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class ArrayReducedForm {
    public static void reducingArray(int array[]) {

        // Create a copy of original array and sort it.
        int sortedArray[] = array.clone();
        Arrays.sort(sortedArray);

        // Create a HashMap
        HashMap<Integer , Integer> arrayMapping = new HashMap<>();
        int reducedValue = 0;

        // Iterate sorted array and assign a reduced value to each elements.
        for (int index = 0; index < array.length; index++) {
            arrayMapping.put(sortedArray[index] , reducedValue++);
        }

        // Iterate the original array and replace each element with its reduced value.
        for (int index = 0; index < array.length; index++) {
            array[index] = arrayMapping.get(array[index]);
        }

        printOutput(array);
    }
    static void printOutput(int array[]) {
        System.out.println("Reduced Array is : ");
        for (int index = 0; index < array.length; index++){
            System.out.print(" ");
            System.out.print(array[index]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of Elements : ");
        int arraySize = sc.nextInt();

        int array[] = new int[arraySize];

        System.out.println("Enter Array Elements : ");
        for (int index = 0; index < array.length; index++) {
            array[index] = sc.nextInt();
        }
        reducingArray(array);
    }
}
