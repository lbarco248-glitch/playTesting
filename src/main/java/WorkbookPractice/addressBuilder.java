package WorkbookPractice;
import java.util.Scanner;
public class addressBuilder {
    public static void main(String[] args)
    {
        StringBuilder address = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information.");
        System.out.println("Full Name: ");
        String name = scanner.nextLine() + "\n\n";
        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine() + "\n";
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine() + "\n";
        System.out.println("Billing State: ");
        String billingState = scanner.nextLine() + "\n";
        System.out.println("Billing Zip Code: ");
        String billingZip = scanner.nextLine() + "\n\n";
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine() + "\n";
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine() + "\n";
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine() + "\n";
        System.out.println("Shipping Zip Code: ");
        String shippingZip = scanner.nextLine() + "\n";
        scanner.close();
        address.append(name);
        System.out.println();
        address.append(billingStreet);
        address.append(billingCity);
        address.append(billingState);
        address.append(billingZip);
        System.out.println();
        address.append(shippingStreet);
        address.append(shippingCity);
        address.append(shippingState);
        address.append(shippingZip);
        System.out.println(address);
    }
}
