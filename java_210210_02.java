import java.util.Scanner;

public class java_210210_02 {
    //백준 문자열 단어공부
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        sc.close();

        //String ab = "abcdefghijklmnopqrstuvwxyz";

        char[] arr = new char[s.length()];

        for(int i=0; i<s.length(); i++) {

            arr[i] = s.charAt(i);
        }

        

        
    }
}
