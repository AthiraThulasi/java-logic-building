package FrequencyAndHashing;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "aaabbcdddd";
        System.out.println("Original: " + input);
        System.out.println("Compressed: " + compressString(input));
        // Expected Output: a3b2c1d4
    }

    public static String compressString(String str) {
        // Edge case: handle empty or null strings
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Loop through the string up to the second-to-last character
        for (int i = 0; i < str.length(); i++) {
            // Check if the next character is the same as the current one
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Character changed or reached the end; append the character and its frequency
                compressed.append(str.charAt(i));
                compressed.append(count);
                count = 1; // Reset counter for the next character
            }
        }

        return compressed.toString();
    }
}


