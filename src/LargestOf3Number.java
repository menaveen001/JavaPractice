import java.util.Scanner;

public class LargestOf3Number {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a= sc.nextInt();
        System.out.println("Enter Second Number");
        int b= sc.nextInt();
        System.out.println("Enter Third Number");
        int c= sc.nextInt();

        if (a>b && a>c){
            System.out.println(a + "is largest number");

        } else if (b>a && b>c) {
            System.out.println(b + "is largest number");
        }
        else {
            System.out.println(c + "is largest number");
        }
    }
}

