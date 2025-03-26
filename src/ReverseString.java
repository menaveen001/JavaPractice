public class ReverseString {

    public static void main(String[] args) {

        firstMethod();
        secondMethod();

    }
   //Using + String concatenation operator
    public static void firstMethod(){

       String str = "ABCD";
       String rev ="";
       int len = str.length();

       for (int i =len-1; i >=0; i--){

           rev=rev+str.charAt(i);

       }
        System.out.println("Reverse string is:" +rev);

    }
//  Using charArray method
    public static void secondMethod(){
        String str = "ABCD";
        String rev ="";
        char a[]=str.toCharArray();
        int length = a.length;
        for (int i =length-1; i>=0; i--){

            rev= rev+a[i];
        }
        System.out.println("Reverse string is:" +rev);

    }

}
