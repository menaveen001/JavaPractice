public class SumOfAnArrayElement {

    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 6};
        int sum = 0;

        for(int i=0; i <= arr.length -1;  i++){

            sum =sum+arr[i];

        }
        System.out.println(sum);
    }
}
