
import java.util.Arrays;
import java.util.Scanner;

public class new_23_9 {
    public static void main(String[] args) {
        // Input
        Scanner value = new Scanner(System.in);
        String inputStr = value.nextLine();


        // Split the input string by '+'
        String[] numbersArray = inputStr.split("\\+");

        // Convert the numbers to integers
        int[] numbers = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }

        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Convert the sorted numbers back to strings
        String[] sortedNumbersArray = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbersArray[i] = String.valueOf(numbers[i]);
        }

        // Join the sorted numbers with '+' between them
        String sortedStr = String.join("+", sortedNumbersArray);

        // Output
        System.out.println(sortedStr);
    }
}

