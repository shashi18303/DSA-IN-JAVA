package A;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        str = str.toLowerCase();

        int[] freq = new int[256]; 

                for (int i = 0; i < str.length(); i++) {
                	char ch=str.charAt(i);
            freq[ch]++;
        }

        
        for (int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i);
            if (freq[ch] == 1) {
                System.out.println("First non-repeating character: " + ch );
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
