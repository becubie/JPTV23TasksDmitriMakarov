package ee.ivkhkdev;
import java.util.Scanner;
public class Main {
    static int SumNum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st 3-digits number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd 3-digits number: ");
        int num2 = scanner.nextInt();
        int SumNum = num1 + num2;
        System.out.println("Your 3-digits number sum is: " + SumNum);
    }
}