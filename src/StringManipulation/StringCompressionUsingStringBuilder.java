package StringManipulation;

public class StringCompressionUsingStringBuilder {

        public static void main(String[] args) {

            String str = "AAABBCC";
            StringBuilder result = new StringBuilder();

            int count = 1;

            for (int i = 0; i < str.length() - 1; i++) {

                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    result.append(str.charAt(i));
                    result.append(count);
                    count = 1;
                }
            }

            result.append(str.charAt(str.length() - 1));
            result.append(count);

            System.out.println(result);
        }
    }

