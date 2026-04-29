package WorkbookPractice;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args)
    {
        int[] scores = {45, 48, 89 ,89, 72, 99, 74, 69, 81, 90};
        Arrays.sort(scores);
        int location = scores.length - 1;
        float total = 0;
        for (int index = 0; index < scores.length; index++)
        {
            total += scores[index];
        }
        float average = (total / scores.length);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Low Score: %d\n", scores[0]);
        System.out.printf("High Score: %d\n", scores[location]);
    }
}
