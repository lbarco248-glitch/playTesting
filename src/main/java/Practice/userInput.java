package Practice;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        if (age < 0)
        {
            System.out.println("Invalid age submitted.");
        }
        else if (age < 13)
        {
            System.out.printf("Hey %s, you're a kid!", name);
        }
        else if (age < 18)
        {
            System.out.printf("Hey %s, you're a teenager!", name);
        }
        else if (age < 65)
        {
            System.out.printf("Hey %s, you're an adult!", name);
        }
        else
        {
            System.out.printf("Hey %s, you're a fossil!", name);
        }
        scanner.close();
    }
}
