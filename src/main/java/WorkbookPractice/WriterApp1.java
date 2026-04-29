package WorkbookPractice;

import java.io.FileWriter;
import java.io.IOException;

public class WriterApp1 {
    public static void main(String[] args)
    {
        try
        {
            FileWriter writer = new FileWriter("skills.txt");
            //opens file
            writer.write("Skills:\n");
            writer.write("Git, HTML, CSS, Bootstrap\n");

        }
        catch (IOException e)
        // A way for system to record error for us to fix later
        {
            System.out.println("An unexpected error has occurred.");
            e.printStackTrace();
        }
    }
}
