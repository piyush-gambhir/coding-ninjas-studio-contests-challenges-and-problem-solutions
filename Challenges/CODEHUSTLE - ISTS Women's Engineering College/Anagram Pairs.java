import java.util.*;

public class Solution {

    public static boolean isAnagram(String str1, String str2) {
        // Your code goes here
        if (str1.length() != str2.length()) {
            return false;
        }
        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

}