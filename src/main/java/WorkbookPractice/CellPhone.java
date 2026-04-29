package WorkbookPractice;

public class CellPhone {
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String dial(String phoneNumber)
    {
       return String.format(" phone is calling %s",phoneNumber);
    }
    /*If I wanted to, I could add another method named dial so long as the signature is different
    Different signatures are recognized by Java w/o specifying the variable so long as
    the type of parameters used for the same method name is different

    When the same name is used for methods with diff signatures, these are referred to as
    OVERLOADED METHODS or OVERLOADS
    */
    public CellPhone()
    {
        //included this method with empty body to iterate other calls to it can either include no parameter () or 5 parameters (below)
    }
    public CellPhone(int serialNumber, String model, String carrier, String PhoneNumber, String owner)
    {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = PhoneNumber;
        this.owner = owner;
        //without including this.variable, the overloaded method is a husk that doesn't return inputted values
    }
}

