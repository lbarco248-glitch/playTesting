package WorkbookPractice;

public class stringBuilder {
    public static void main(String[] args)
    {
        StringBuilder test = new StringBuilder();
        test.append("Git, ");
        // append adds the new text into the string - not replacing but adding
        test.append("To, ");
        test.append("Work, ");
        test.append("You, ");
        test.append("Dunce.");
        String theTest = test.toString();
        //creating variable theTest which we use to call the whatever the mutable string ends up being
        //original test variable isn't a String object, hence why it must be retrieved with to.String
        System.out.println(theTest);
        // Result:Git, To, Work, You, Dunce.

    }
}
