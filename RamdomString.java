public class RamdomString {
        public static void main(String[] args) {
            String s = "ramdomstring";
            StringBuilder result = new StringBuilder();

            int index = 0;
            int count = 1;

            while (index < s.length()) {
                // Append `count` characters from the current index
                if (index + count <= s.length()) {
                    result.append(s, index, index + count);
                    index += count;
                } else {
                    result.append(s.substring(index));
                    break;
                }
                // Add spaces in incremental order
                result.append(" ".repeat(count));
                count++;
            }

            System.out.println(result.toString().trim());
        }
    }
