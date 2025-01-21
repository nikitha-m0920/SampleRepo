public class ReverseString {
    // Method to reverse a string
    public static String reverse(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from the beginning and end of the array
        while (left < right) {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers
            left++;
            right--;
        }

        // Convert the character array back to a string and return it
        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String originalString = "Hello, World!";
        String reversedString = reverse(originalString);

        // Print the original and reversed strings
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}