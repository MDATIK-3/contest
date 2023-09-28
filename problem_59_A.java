import java.util.Scanner;

public class problem_59_A {
    public static void main(String[] args) {

        //input section
        Scanner str = new Scanner(System.in);
        String given_str = str.nextLine();

        int toupper=0, tolower=0;
        for(int i=0; i<given_str.length(); i++){
            char ch = given_str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                toupper++;
            }
            else if(ch>='a' && ch<='z') {
                tolower++;
            }
        }
        if(tolower>=toupper){
            System.out.println(given_str.toLowerCase());
        }
        else
            System.out.println(given_str.toUpperCase());
    }
}
