import java.util.Scanner;

public class third {
    public static void main(String[] args) {

        // Input section
        Scanner str = new Scanner(System.in);
        int text_cases = str.nextInt();

        while (text_cases-- > 0) {

            long n = str.nextLong();
            long k = str.nextLong();
            long x = str.nextLong();

            // Calculate the sum directly using arithmetic sum formula


            if ( 2*x >= k*(k+1) && 2*x <= (n*(n+1) - (n-k)*(n-k+1))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
