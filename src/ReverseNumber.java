import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int  num = sc.nextInt();

        // Using algorithm

        int rev = 0;

        while (num != 0){

          rev =rev*10 + num%10;
          num = num /10;

        }
        System.out.println("Revers Number is :  " + rev);


        // Using StringBuffer class
        secondMethod();


    }

    public static void secondMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int  num = sc.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer  rev1= sb.reverse();

        System.out.println("Reverse Number is:" +rev1);
    }
}
