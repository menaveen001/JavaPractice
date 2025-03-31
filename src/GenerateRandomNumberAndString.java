import java.util.Random;

public class GenerateRandomNumberAndString {

    public static void main(String[] args) {

        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        System.out.println("Random Integers: " + rand_int);

    }
}
