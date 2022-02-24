import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String args[]) {
        String[] strings = { "hello", "hi", "Good" };
        List<String> k = Arrays.asList(strings);
        System.out.println(k);
    }
}