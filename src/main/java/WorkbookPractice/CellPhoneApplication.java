package WorkbookPractice;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

            CellPhone Phone1 = new CellPhone();
            // Object 1 of CellPhone
            Scanner input = new Scanner(System.in);
            System.out.print("What is the serial number? ");
            Phone1.setSerialNumber(input.nextInt());
            System.out.println(Phone1.getSerialNumber());
            System.out.print("What model is the phone? ");
            input.nextLine();
            Phone1.setModel(input.nextLine());
            System.out.println(Phone1.getModel());
            System.out.print("Who is the carrier? ");
            Phone1.setCarrier(input.nextLine());
            System.out.println(Phone1.getCarrier());
            System.out.print("What is the phone number? ");
            Phone1.setPhoneNumber(input.nextLine());
            System.out.println(Phone1.getPhoneNumber());
            System.out.print("Who is the owner of the phone? ");
            Phone1.setOwner(input.nextLine());
            System.out.println(Phone1.getOwner());

            String test = Phone1.getOwner() + "'s" + Phone1.dial(Phone1.getPhoneNumber());
            // Used concatenation to avoid issues for future use of dial method
            System.out.println(test);

            CellPhone Phone2 = new CellPhone();
            //Object 2 of CellPhone
            System.out.print("What is the serial number? ");
            Phone2.setSerialNumber(input.nextInt());
            System.out.println(Phone2.getSerialNumber());
            System.out.print("What model is the phone? ");
            input.nextLine();
            Phone2.setModel(input.nextLine());
            System.out.println(Phone2.getModel());
            System.out.print("Who is the carrier? ");
            Phone2.setCarrier(input.nextLine());
            System.out.println(Phone2.getCarrier());
            System.out.print("What is the phone number? ");
            Phone2.setPhoneNumber(input.nextLine());
            System.out.println(Phone2.getPhoneNumber());
            System.out.print("Who is the owner of the phone? ");
            Phone2.setOwner(input.nextLine());
            System.out.println(Phone2.getOwner());
            input.close();
CellPhone Phone3 = new CellPhone(456156,"Samsung","MetroPCS","9722172987","Luis");
            display(Phone1);
            display(Phone2);
            display(Phone3);
            //display(PhoneX) calls the object
        Phone1.dial(Phone2.getPhoneNumber());
        //Phone 1 is dialing Phone 2 using the dial method in CellPhone
        Phone2.dial(Phone1.getPhoneNumber());
        Phone3.dial(Phone1.getPhoneNumber());

    }
    public static void display(CellPhone phone)
    {
        System.out.printf("Serial Number: %d", phone.getSerialNumber());
    }
}
