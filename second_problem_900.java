import java.util.Scanner;

public class second_problem_900 {
    public static void main(String[] args) {

        //input section
        Scanner str = new Scanner(System.in);
        int t;
        int text_cases = str.nextInt();

        while (text_cases-- > 0) {

            int n = str.nextInt();
            int start = 1;

            for(int i=1; i<=n; i++){
                System.out.print(start + " ");
                start += 2;
            }
        }
    }
}
