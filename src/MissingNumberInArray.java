public class MissingNumberInArray {
    public static void main(String[] args) {

        // Array should not have duplicates
        //Array no need to be sorted order
        //Value should be in range

        int arr[] = {1, 2, 3, 4,  6, 7, 8, 9, 10};

        int sum1 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];

        }
        System.out.println("Sum of Array: " + sum1);

      int  sum2 = 0;
      for (int i =1; i <= 10; i++) {
            sum2 = sum2 + i;

        }
        System.out.println("Sum of 1 to 10: " + sum2);

        int missingNumber = sum2 - sum1;
        System.out.println("Missing Number is: " + missingNumber);


    }
}
