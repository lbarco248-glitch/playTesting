package WorkbookPractice;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args)
    {
        CellPhone Phone = new CellPhone();
        Scanner input = new Scanner(System.in);
        System.out.print("What is the serial number? ");
        Phone.setSerialNumber(input.nextInt());
        System.out.print(Phone.getSerialNumber());
        System.out.println("What model is the phone? ");
        Phone.setModel(input.nextLine());
        System.out.println("Who is the carrier? ");
        Phone.setCarrier(input.nextLine());
        System.out.println("What is the phone number? ");
        Phone.setCarrier(input.nextLine());
        System.out.println("Who is the owner of the phone? ");
        Phone.setCarrier(input.nextLine());


    }
}
