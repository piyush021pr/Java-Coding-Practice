import java.util.Formatter;
public class Reverse_string_using_stringformatter {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        Formatter formatter = new Formatter();

        // Appending characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            formatter.format("%c", str.charAt(i));
        }

        String reversedString = formatter.toString();
        formatter.close();

        return reversedString;
    }
}
