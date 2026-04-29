package WorkbookPractice;

public class Arrays {
    public static void main(String[] args)
    {
        int[] numbers = {60,62,64,66,90,87};
        displayNumbers(numbers);

        String[]colors = {"red", "white", "black"};
        String[]copyColors = new String[3];
        for (int i = 0; i < 3; i++)
        {
            copyColors[i] = colors[i];

        }
        for (int i = 0; i < 3; i++)
        {
            System.out.println(copyColors[i]);
        }
        /*
        Alternative, both prior for statements can be replaced
        by
        System.arraycopy(colors, 0, copyColors, 0, 3);
        to replace each index value of copyColors array with
        the colors array equivalent
        In both arrays, 0 marks the starting index while
        3 marks the number of elements copied to copyColors array
         */
    }
    public static void displayNumbers(int[] numbers)
    {
        for (int index = 0; index < numbers.length;  index++)
        {
            System.out.println(numbers[index] + "");
        }
        System.out.println();
    }
}
