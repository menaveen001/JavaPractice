public class EvenOddFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Even Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);

            }
        }


        System.out.println("Odd Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0) {
                System.out.println(arr[i]);

            }
        }

    }
}
