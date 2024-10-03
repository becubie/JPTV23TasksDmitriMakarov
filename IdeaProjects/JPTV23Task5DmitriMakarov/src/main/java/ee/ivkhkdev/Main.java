package ee.ivkhkdev;
import java.util.Random;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[][] jaggedArray = new int[5][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[7];
        jaggedArray[3] = new int[8];
        jaggedArray[4] = new int[9];
        Random rand = new Random();
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = rand.nextInt(51) + 50;
                }
            }
            System.out.println("Sorted: ");
            printJaggedArray(jaggedArray);
            for (int i = 0; i < jaggedArray.length; i++) {
                Arrays.sort(jaggedArray[i]);
            }
            System.out.println("\nUnsorted: ");
            printJaggedArray(jaggedArray);
        }
        public static void printJaggedArray(int[][] array) {
            for (int[] row : array) {
                System.out.println(Arrays.toString(row));
            }
    }
}