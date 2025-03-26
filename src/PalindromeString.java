import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your String");

        String str = scanner.next();

        String rev= "";
        int len = str.length();
        for (int i = len-1; i>=0; i--){

            rev=rev+str.charAt(i);
        }
        System.out.println(rev);

        if (str.equals(rev)){

            System.out.println("String is a palindrome String");
        }
        else {
            System.out.println("Sting is not a palindrome String");
        }
    }
}
