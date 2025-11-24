package String;
public class LastWordLength {
    public static void main(String[] args) {

        String s = "Hello World";

        s = s.trim();  // Remove trailing spaces

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        System.out.println("Length of last word: " + count);
    }
}
