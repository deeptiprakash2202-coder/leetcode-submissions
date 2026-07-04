class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip all spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // Store the end of the current word
            int end = i;

            // Move to the beginning of the current word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Add a space before every word except the first
            if (sb.length() > 0) {
                sb.append(' ');
            }

            // Append the current word
            sb.append(s.substring(i + 1, end + 1));
        }

        return sb.toString();
    }
}