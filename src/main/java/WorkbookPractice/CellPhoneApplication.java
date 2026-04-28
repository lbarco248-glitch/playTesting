package WorkbookPractice;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args)
    {
        CellPhone Phone = new CellPhone();
        Scanner input = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        Phone.setSerialNumber(input.nextInt());
        System.out.println(Phone.getSerialNumber());
        System.out.print("What model is the phone? ");
        input.nextLine();
        Phone.setModel(input.nextLine());
        System.out.println(Phone.getModel());
        System.out.print("Who is the carrier? ");
        Phone.setCarrier(input.nextLine());
        System.out.println(Phone.getCarrier());
        System.out.print("What is the phone number? ");
        Phone.setPhoneNumber(input.nextLine());
        System.out.println(Phone.getPhoneNumber());
        System.out.print("Who is the owner of the phone? ");
        Phone.setOwner(input.nextLine());
        System.out.println(Phone.getOwner());
        input.close();

        String test = Phone.dial(Phone.getOwner(), Phone.getPhoneNumber());
        System.out.println(test);
    }
}
