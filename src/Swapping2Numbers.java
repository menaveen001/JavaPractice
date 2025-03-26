public class Swapping2Numbers {

    public static void main(String[] args) {
        firstLogic();
        secondLogic();
        thirdLogic();
    }

// using third variable methode
    public static void firstLogic(){
        int a= 10;
        int b= 20;

        System.out.println("Before swapping value are..." +a+ " "+ b);

        int t =a; // temp variable
         a=b;
         b=t;

        System.out.println("After swapping value are.." +a+ " "+ b);

    }
// without using third variables (use + & -)

    public static void secondLogic(){
        int a= 10;
        int b= 20;
        System.out.println("Before swapping value are..." +a+ " "+ b);

        a= a+b;   // 10+20 =30
        b=a-b;    //30-20 = 10
        a=a-b;    // 30-10 = 20
        System.out.println("After swapping value are.." +a+ " "+ b);

    }

// using (* and / ) without using third variable(a & b should not be zero)
    public static void thirdLogic(){
        int a= 10;
        int b= 20;
        System.out.println("Before swapping value are..." +a+ " "+ b);

        a= a*b; // 10*20 =200
        b=a/b;   // 200/20 = 10
        a=a/b;  // 200/10 = 20
        System.out.println("After swapping value are.." +a+ " "+ b);

    }

}
