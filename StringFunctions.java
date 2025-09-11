public class StringFunctions {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // Character at a specific index
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // Substring
        String substr = str.substring(7, 12);
        System.out.println("Substring (7 to 12): " + substr);

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);

        // Replace characters
        String replacedStr = str.replace('o', '0');
        System.out.println("Replaced 'o' with '0': " + replacedStr);

        // Trim whitespace
        String strWithSpaces = "   Hello, World!   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");

        // Split string
        String[] parts = str.split(", ");
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Comape strings
        String str2 = "Hello, World!";
        boolean isEqual = str.equals(str2);
        System.out.println("Is original string equal to str2? " + isEqual);
    }
}
