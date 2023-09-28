import java.util.Scanner;

public class first_problem_900 {
    public static void main(String[] args) {

        //input section
        Scanner str = new Scanner(System.in);
     int t;
     int text_cases = str.nextInt();

    while(text_cases-- > 0){

        int n = str.nextInt();
        int k = str.nextInt();
        int count=0;
       int[] arr = new int[n];

        for(int i=0; i<n; i++){
           arr[i] = str.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i] == k){
                count++;
                break;
            }
        }

        if(count != 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }


    }}
