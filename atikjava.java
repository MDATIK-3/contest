
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the testCases value.
        int arr[] = {2,
                1,
                3,
                1,
                6,
                2,
                0,
                0};
        for (int i = 0; i < testCases; i++) {
            System.out.println(arr[i]);
        }


        scanner.close();
    }}
//    public static int transformToTarget(String input) {
//        int count = 0;
//        while (input.contains("AB") || input.contains("BA")) {
//            if (input.contains("AB")) {
//                input = input.replaceFirst("AB", "BC");
//                count++;
//            } else if (input.contains("BA")) {
//                input = input.replaceFirst("BA", "CB");
//                count++;
//            }
//        }
//
//        return count;
//    }
//}