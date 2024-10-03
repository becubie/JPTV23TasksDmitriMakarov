package ee.ivkhkdev;
import java.util.Random;
import java.util.Arrays;
public class Main {
    private int randomnum;

    public static void main(String[] args) {
        Random random = new Random();
        int[] randomnum = new int[100];
        int sum = 0;
        for (int i = 0; i < 100; ++i) {
            int num = random.nextInt(99);
            randomnum[i] = num;
            sum += num;
            System.out.println(num);
        }
        double average = (double) sum / (double) randomnum.length;
        System.out.println("Average Arithmetic is " + average);
    }
}