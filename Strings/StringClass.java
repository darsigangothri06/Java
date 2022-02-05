import java.lang.String;

public class StringClass {
    // Serializable - Conversion of a state from object to byte streams
    // Comparable - comparing one obj to other
    // CharSequence - StringBuffer and StringBuilder

    // Create a string by
    // by string literal
    // by new keyword

    public static void main(String args[]) {
        String str = "darsi"; // by string literal
        String str1 = new String("DARSI"); // by new keyword
        System.out.println(str + " " + str1);
    }
}
