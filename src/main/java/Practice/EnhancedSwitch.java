package Practice;
import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input today's day of the week: ");
        String day = scan.nextLine();
        // case similar to using multiple if else statements
        switch(day)
        {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a weekday.");
            case "Saturday", "Sunday" -> System.out.println("It's the weekend.");
            // switches can combine multiple values together if they produce the same output
            default -> System.out.printf("%s is not a day.",day);
            // default is similar to else statement
        }
        scan.close();
    }
}
