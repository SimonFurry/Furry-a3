package baseline;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Solution24Test {
    @Test
    void anagramFalse() {
        String userStr1 = "Care";
        String userStr2 = "Holiday";

        if (userStr1.length() == userStr2.length()) {
            //convert strings to char array
            char[] charArray1 = userStr1.toCharArray();
            char[] charArray2 = userStr2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean trueResult = Arrays.equals(charArray1, charArray2);
            if (trueResult == false) {
                System.out.println(userStr1 + " and " + userStr2 + " are not an Anagram.");
            }
        }
    }

    @Test
    void anagramTrue() {
        String userStr1 = "Care";
        String userStr2 = "Race";

        if (userStr1.length() == userStr2.length()) {
            //convert strings to char array
            char[] charArray1 = userStr1.toCharArray();
            char[] charArray2 = userStr2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean trueResult = Arrays.equals(charArray1, charArray2);
            if (trueResult) {
                System.out.println(userStr1 + " and " + userStr2 + " are an Anagram.");
            }
        }
    }
}