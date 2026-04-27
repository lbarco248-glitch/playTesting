package Practice;
import java.util.Scanner;

public class Methods {
    public static void main(String [] args)
    {
        //method = a block of reusable code that is executed when called with --> ()
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();

        happyBirthday(name, age);

    }
    static void happyBirthday(String name, int age)
    {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old.", age);
    }
    
}
