package Practice;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args)
    {
        // && = AND
        // || = OR
        // ! = NOT
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature outside? (In Celsius)");
        double temp = scanner.nextDouble();

        if(temp <=30 && temp>=0)
        {
            System.out.println("The weather is nice.");
        }
        else
        {
            System.out.println("The weather isn't that nice...");
        }
        scanner.close();
    }
}
