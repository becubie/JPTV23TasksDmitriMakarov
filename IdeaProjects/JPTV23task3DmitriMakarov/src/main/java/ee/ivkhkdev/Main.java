package ee.ivkhkdev;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();
        System.out.printf("Your surname: ");
        String surname = scanner.nextLine();
        System.out.printf("Your BirthMonth (Letters): ");
        String BMonth = scanner.nextLine();
        System.out.printf("Your birthDay: ");
        int BDay = scanner.nextInt();
        System.out.printf("Your birthYear: ");
        int BYear = scanner.nextInt();
        System.out.println(name + " " + surname + " born in " + BDay + ". " + BMonth + " " + BYear + " year.");
    }
}