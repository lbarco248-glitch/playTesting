package WorkbookPractice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderTest {
    public static void main(String[] args)
    {
        try
        {
        FileReader reader = new FileReader("poem.txt");
        BufferedReader bufReader = new BufferedReader(reader);
        String input;
        while((input = bufReader.readLine()) != null)
        // while bufferedReader reads lines that doesn't return null the following occcurs
            {
                System.out.println(input);
            }
        bufReader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
