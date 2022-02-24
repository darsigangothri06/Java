import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    public static void main(String args[]) {
        int marks[] = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(marks[4]);

        // using copyOf, length
        int newMarks[] = Arrays.copyOf(marks, marks.length + 1);
        newMarks[marks.length] = 100;
        System.out.println(newMarks[newMarks.length - 1]);

        // using Random
        System.out.println(newMarks[new Random().nextInt(newMarks.length - 1)]);

        // equals()
        System.out.println(marks.equals(newMarks) + " " + marks.equals(marks));

        // isEmpty()
        System.out.println(Arrays.isEmp);
    }
}
