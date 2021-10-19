package arraylists;

import java.util.*;

public class exercises {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<String>();
        words.add("reel");
        words.add("superfluous");
        words.add("excite");
        words.add("peril");
        System.out.println(averageVowels(words));
    }

    public static double averageVowels(ArrayList<String> words) {
        double total = (double) words.length;
        double vowels = 0.0;
        for (String s : words) {
            for (char c : s) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }
        }
        return vowels / total;
    }
}
