package WorkbookPractice;
import java.util.Scanner;
public class HandlingExceptions {
    public static void main(String[] args)
    {
        //Index Out of Bounds
        Scanner scanner = new Scanner(System.in);
        try
        {
            String[] names = {"Ezra", "Irene", "Nearl", "Kaltsit"};
            System.out.println("Pick an individual: (Select 1 - 4)");
            int index = scanner.nextInt();
            index--;
            System.out.println(names[index]);
        }
        catch (Exception e)
        {
            System.out.println("Number out of range.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
